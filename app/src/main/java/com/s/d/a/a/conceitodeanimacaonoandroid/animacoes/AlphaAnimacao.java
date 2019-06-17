package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class AlphaAnimacao extends Activity {
    private boolean visivel = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View v) {
        int anim = visivel ? android.R.anim.fade_out : android.R.anim.fade_in;
        Animation a = AnimationUtils.loadAnimation(this, anim);
        executarAnimacao(a);
    }
    public void onClickAnimarAPI(View v) {
        AlphaAnimation fade_out = new AlphaAnimation(1.0f, 0.0f);
        AlphaAnimation fade_in = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation a = visivel ? fade_out : fade_in;
        executarAnimacao(a);
    }
    public void executarAnimacao(Animation a) {
        // 2 segundos
        a.setDuration(2000);
        // Manter o efeito no final da animação
        a.setFillAfter(true);
        // Inicia a animação
        ImageView img = (ImageView) findViewById(R.id.img);
        img.startAnimation(a);
        // Inverte o flag para na próxima vez utilizar a animação inversa
        visivel = !visivel;
    }
}
