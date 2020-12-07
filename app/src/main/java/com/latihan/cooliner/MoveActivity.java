package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btnangsle;
import static com.latihan.cooliner.R.id.btnbakso;
import static com.latihan.cooliner.R.id.btnkrawu;
import static com.latihan.cooliner.R.id.btnlontongbalap;
import static com.latihan.cooliner.R.id.btnmadu;
import static com.latihan.cooliner.R.id.btnpecel;
import static com.latihan.cooliner.R.id.btnrujak;


public class MoveActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawatimur11);

        Button btnPecel = findViewById(btnpecel);
        btnPecel.setOnClickListener(this);

        Button btnBakso = findViewById(btnbakso);
        btnBakso.setOnClickListener(this);

        Button btnKrawu = findViewById(btnkrawu);
        btnKrawu.setOnClickListener(this);

        Button btnRujak = findViewById(btnrujak);
        btnRujak.setOnClickListener(this);

        Button btnLontong = findViewById(btnlontongbalap);
        btnLontong.setOnClickListener(this);

        Button btnMadu = findViewById(btnmadu);
        btnMadu.setOnClickListener(this);

        Button btnAngsle = findViewById(btnangsle);
        btnAngsle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btnpecel:
                Intent movePecel = new Intent(MoveActivity.this, DetailPecel.class);
                startActivity(movePecel);
                break;
        }
        switch (view.getId()) {
            case btnbakso:
                Intent moveBakso = new Intent(MoveActivity.this, DetailBakso.class);
                startActivity(moveBakso);
                break;
        }
        switch (view.getId()) {
            case btnrujak:
                Intent moveRujak = new Intent(MoveActivity.this, DetailRujak.class);
                startActivity(moveRujak);
                break;
        }
        switch (view.getId()) {
            case btnkrawu:
                Intent moveKrawu = new Intent(MoveActivity.this, DetailKrawu.class);
                startActivity(moveKrawu);
                break;
        }
        switch (view.getId()) {
            case btnlontongbalap:
                Intent moveLontong = new Intent(MoveActivity.this, DetailLontong.class);
                startActivity(moveLontong);
                break;
        }
        switch (view.getId()) {
            case btnmadu:
                Intent moveMadu = new Intent(MoveActivity.this, DetailMadu.class);
                startActivity(moveMadu);
                break;
        }
        switch (view.getId()) {
            case btnangsle:
                Intent moveAngsle = new Intent(MoveActivity.this, DetailAngsle.class);
                startActivity(moveAngsle);
                break;
        }
    }
}