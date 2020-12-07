package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_sotomie;

public class DetailSotoMie extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_soto_mie);

        Button BtnSM = findViewById(btn_sotomie);
        BtnSM.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_sotomie:
                Intent moveIntent = new Intent(DetailSotoMie.this, ResepSotoMie.class);
                startActivity(moveIntent);
                break;
        }
    }
}