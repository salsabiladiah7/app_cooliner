package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_ongklok;

public class DetailOngklok extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ongklok);

        Button BtnOngklok = findViewById(btn_ongklok);
        BtnOngklok.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_ongklok:
                Intent moveIntent = new Intent(DetailOngklok.this, ResepMieOngklok.class);
                startActivity(moveIntent);
                break;
        }
    }
}