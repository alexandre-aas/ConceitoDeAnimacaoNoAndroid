package com.s.d.a.a.conceitodeanimacaonoandroid.animacoes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;

import com.s.d.a.a.conceitodeanimacaonoandroid.R;

public class GerenciadoDeLayoutViewFlipper_Login extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_animado);
        Button bLogin = findViewById(R.id.btLogin);
        bLogin.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                proximaView();
            }
        });
    }
    private void proximaView() {
        ViewFlipper flip = (ViewFlipper) findViewById(R.id.flip);
        // Animação de saída da view atual
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        out.setDuration(2000);
        // Animação de entrada da próxima view
        Animation in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        in.setDuration(2000);
        // Configura a animação de entrada e saída
        flip.setInAnimation(in);
        flip.setOutAnimation(out);
        // Troca para a próxima view
        flip.showNext();
    }
}
