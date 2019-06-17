package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class ListaDeAnimacoes extends Activity {
    private boolean flag = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    // Animar pelo XML
    public void onClickAnimarXML(View v) {
        AnimationSet set1 = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.set_mover_para_baixo_desaparecer);
        AnimationSet set2 = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.set_mover_para_cima_aparecer);
        AnimationSet set = flag ? set1 : set2;
        animar(set);
    }
    // Animar pela API
    public void onClickAnimarAPI(View v) {
        AnimationSet lista = new AnimationSet(true);
        Animation a1 = getAnimacaoMoverParaBaixoCima();
        Animation a2 = getAnimacaoAparecerDesaparecer();
        lista.addAnimation(a1);
        lista.addAnimation(a2);
        animar(lista);
    }
    // Animar o objeto criado
    public void animar(AnimationSet lista) {
        ImageView img = findViewById(R.id.img);
        // 2 segundos
        lista.setDuration(2000);
        // Manter o efeito no final da animação
        lista.setFillAfter(true);
        img.startAnimation(lista);
        // Inverte o flag para na próxima vez utilizar a animação inversa
        flag = !flag;
    }
    // Animação para mover para baixo e para cima
    private Animation getAnimacaoMoverParaBaixoCima() {
        int anim = flag ? R.anim.translate_mover_para_baixo : R.anim.translate_mover_para_cima;
        Animation a = AnimationUtils.loadAnimation(this, anim);
        return a;
    }
    // Animação para esconder e aparecer
    protected Animation getAnimacaoAparecerDesaparecer() {
        int anim = flag ? R.anim.fade_out : R.anim.fade_in;
        Animation a = AnimationUtils.loadAnimation(this, anim);
        return a;
    }
}
