package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class TranslateAnimacao extends Activity {
    private boolean visivel = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View v) {
        int anim = visivel ? R.anim.translate_mover_para_baixo : R.anim.translate_mover_para_cima;
        Animation a = AnimationUtils.loadAnimation(this, anim);
        animar(a);
    }
    public void onClickAnimarAPI(View v) {
        Animation moverParaBaixo = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0F, Animation.RELATIVE_TO_SELF, 0.0F,
                Animation.RELATIVE_TO_SELF, 0.0F, Animation.RELATIVE_TO_SELF, 2.0F
        );
        Animation moverParaCima = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0F, Animation.RELATIVE_TO_SELF, 0.0F,
                Animation.RELATIVE_TO_SELF, 2.0F, Animation.RELATIVE_TO_SELF, 0.0F
        );
        Animation a = visivel ? moverParaBaixo : moverParaCima;
        animar(a);
    }
    public void animar(Animation a) {
        ImageView img = findViewById(R.id.img);
        // 2 segundos
        a.setDuration(2000);
        // Manter o efeito no final da animação
        a.setFillAfter(true);
        img.startAnimation(a);
        // Inverte o flag para na próxima vez utilizar a animação inversa
        visivel = !visivel;
    }
}
