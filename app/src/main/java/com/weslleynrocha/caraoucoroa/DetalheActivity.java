package com.weslleynrocha.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView moeda;
    private ImageButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        moeda = findViewById(R.id.moeda);
        btnVoltar = findViewById(R.id.btnVoltar);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String opc = extra.getString("opcao");
            if (opc.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            } else{
                moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetalheActivity.super.finish();
            }
        });

    }
}
