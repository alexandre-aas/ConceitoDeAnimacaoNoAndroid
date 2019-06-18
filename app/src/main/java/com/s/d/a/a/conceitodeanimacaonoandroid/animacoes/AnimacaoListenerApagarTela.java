package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.View.OnClickListener;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class AnimacaoListenerApagarTela extends Activity implements OnClickListener, AnimationListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btOk = findViewById(R.id.btLogin);
        btOk.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // Simular login aqui... Se login ok, aplicar a animação e trocar de tela
        ViewGroup layout = (ViewGroup) findViewById(R.id.layout);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        // Define o listener para ser notificado sobre os eventos da animação
        anim.setAnimationListener(this);
        anim.setFillAfter(true);
        anim.setDuration(2000);
        layout.startAnimation(anim);
    }
    @Override
    public void onAnimationStart(Animation animation) {
    }
    @Override
    public void onAnimationRepeat(Animation animation) {
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Agora podemos trocar de tela ou fazer qualquer outra coisa
        finish();
    }

}
