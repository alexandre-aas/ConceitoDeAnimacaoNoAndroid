package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class SimularProblemasAPI_Antiga_Animacao extends Activity {
    private boolean flag = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bug_api_antiga);
    }
    public void onClickAnimar(View view) {
        Animation a = getAnimacaoXML();
        // 2 segundos
        a.setDuration(2000);
        // Manter o efeito no final da animação
        a.setFillAfter(true);
        view.startAnimation(a);
        // Inverte o flag para na próxima vez utilizar a animação inversa
        flag = !flag;
    }
    protected Animation getAnimacaoXML() {
        int anim = flag ? R.anim.translate_mover_para_baixo : R.anim.translate_mover_para_cima;
        Animation a = AnimationUtils.loadAnimation(this, anim);
        return a;
    }
}
