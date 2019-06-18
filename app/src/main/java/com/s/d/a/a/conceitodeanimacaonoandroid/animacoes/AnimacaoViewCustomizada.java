package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class AnimacaoViewCustomizada extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ViewAnimada(this));
    }
    public class ViewAnimada extends View {
        private Paint paint = new Paint();
        private int largura;
        private int altura;
        private Animation animacao;
        public ViewAnimada(Context context) {
            super(context);
        }
        public ViewAnimada(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            this.largura = w;
            this.altura = h;
            Log.i("livroandroid","w/h: " + w +"/"+h);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.android2);
            canvas.drawBitmap(bitmap, largura / 2 - bitmap.getWidth() / 2, altura / 2 - bitmap.getHeight() / 2, paint);
            if(animacao == null) {
                animacao = getAnimacaoVoltaCompleta();
                startAnimation(animacao);
            }
        }
        protected Animation getAnimacaoVoltaCompleta() {
            RotateAnimation a = new RotateAnimation(0,360,
                    Animation.RELATIVE_TO_SELF, 0.5F,
                    Animation.RELATIVE_TO_SELF, 0.5F);
            a.setDuration(2000);
            a.setRepeatCount(10);
            a.setRepeatMode(Animation.INFINITE);
            return a;
        }
    }
}
