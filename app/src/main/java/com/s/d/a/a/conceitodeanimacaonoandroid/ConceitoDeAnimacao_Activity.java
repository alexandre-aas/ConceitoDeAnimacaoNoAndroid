package com.s.d.a.a.conceitodeanimacaonoandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.AlphaAnimacao;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.AnimacaoListenerApagarTela;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.AnimacaoViewCustomizada;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.GerenciadoDeLayoutViewFlipper_Login;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.ListaDeAnimacoes;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.RotateAnimacao;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.ScaleAnimacao;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.SimularProblemasAPI_Antiga_Animacao;
import com.s.d.a.a.conceitodeanimacaonoandroid.animacoes.TranslateAnimacao;

public class ConceitoDeAnimacao_Activity extends ListActivity {
    private static final String[] ops = new String[] {
            "Animacao Alpha",
            "Animacao Rotate",
            "Animacao Scale",
            "Animacao Translate",
            "Lista De Animações",
            "Animacao Listener",
            "Animacao ViewFlipper",
            "View Animada Customizada",
            "Simular Problemas API Antiga",
            "Sair" };
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        int layout = android.R.layout.simple_list_item_1;
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, layout,ops);
        this.setListAdapter(adaptador);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, AlphaAnimacao.class));
                break;
            case 1:
                startActivity(new Intent(this, RotateAnimacao.class));
                break;
            case 2:
                startActivity(new Intent(this, ScaleAnimacao.class));
                break;
            case 3:
                startActivity(new Intent(this, TranslateAnimacao.class));
                break;
            case 4:
                startActivity(new Intent(this, ListaDeAnimacoes.class));
                break;
            case 5:
                startActivity(new Intent(this, AnimacaoListenerApagarTela.class));
                break;
            case 6:
                startActivity(new Intent(this, GerenciadoDeLayoutViewFlipper_Login.class));
                break;
            case 7:
                startActivity(new Intent(this, AnimacaoViewCustomizada.class));
                break;
            case 8:
                startActivity(new Intent(this, SimularProblemasAPI_Antiga_Animacao.class));
                break;
            default:
                finish();
        }
    }

}
