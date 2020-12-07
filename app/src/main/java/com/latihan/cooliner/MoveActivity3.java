package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btnbandros;
import static com.latihan.cooliner.R.id.btncendol;
import static com.latihan.cooliner.R.id.btnjamblang;
import static com.latihan.cooliner.R.id.btnlengko;
import static com.latihan.cooliner.R.id.btnmiekocok;
import static com.latihan.cooliner.R.id.btnsotokuning;
import static com.latihan.cooliner.R.id.btnsotomie;


public class MoveActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawabarat11);

        Button btnMieKocok = findViewById(btnmiekocok);
        btnMieKocok.setOnClickListener(this);

        Button btnKuning = findViewById(btnsotokuning);
        btnKuning.setOnClickListener(this);

        Button btnJamblang = findViewById(btnjamblang);
        btnJamblang.setOnClickListener(this);

        Button btnLengko = findViewById(btnlengko);
        btnLengko.setOnClickListener(this);

        Button btnSotoMie = findViewById(btnsotomie);
        btnSotoMie.setOnClickListener(this);

        Button btnBandros = findViewById(btnbandros);
        btnBandros.setOnClickListener(this);

        Button btnCendol = findViewById(btncendol);
        btnCendol.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btnmiekocok:
                Intent moveMieKocok = new Intent(MoveActivity3.this, DetailMieKocok.class);
                startActivity(moveMieKocok);
                break;
        }
        switch (view.getId()) {
            case btnsotokuning:
                Intent moveKuning = new Intent(MoveActivity3.this, DetailKuning.class);
                startActivity(moveKuning);
                break;
        }
        switch (view.getId()) {
            case btnjamblang:
                Intent moveJamblang = new Intent(MoveActivity3.this, DetailJamblang.class);
                startActivity(moveJamblang);
                break;
        }
        switch (view.getId()) {
            case btnlengko:
                Intent moveLengko = new Intent(MoveActivity3.this, DetailLengko.class);
                startActivity(moveLengko);
                break;
        }
        switch (view.getId()) {
            case btnsotomie:
                Intent moveSotoMie = new Intent(MoveActivity3.this, DetailSotoMie.class);
                startActivity(moveSotoMie);
                break;
        }
        switch (view.getId()) {
            case btnbandros:
                Intent moveBandros = new Intent(MoveActivity3.this, DetailBandros.class);
                startActivity(moveBandros);
                break;
        }
        switch (view.getId()) {
            case btncendol:
                Intent moveCendol = new Intent(MoveActivity3.this, DetailCendol.class);
                startActivity(moveCendol);
                break;
        }
    }
}