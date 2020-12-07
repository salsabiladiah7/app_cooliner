package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btndawet;
import static com.latihan.cooliner.R.id.btngandul;
import static com.latihan.cooliner.R.id.btngrombyang;
import static com.latihan.cooliner.R.id.btnkudus;
import static com.latihan.cooliner.R.id.btnliwet;
import static com.latihan.cooliner.R.id.btnlumpia;
import static com.latihan.cooliner.R.id.btnongklok;


public class MoveActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawatengah11);

        Button btnGrombyang = findViewById(btngrombyang);
        btnGrombyang.setOnClickListener(this);

        Button btnOngklok = findViewById(btnongklok);
        btnOngklok.setOnClickListener(this);

        Button btnGandul = findViewById(btngandul);
        btnGandul.setOnClickListener(this);

        Button btnLiwet = findViewById(btnliwet);
        btnLiwet.setOnClickListener(this);

        Button btnKudus = findViewById(btnkudus);
        btnKudus.setOnClickListener(this);

        Button btnLumpia = findViewById(btnlumpia);
        btnLumpia.setOnClickListener(this);

        Button btnDawet = findViewById(btndawet);
        btnDawet.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btngrombyang:
                Intent moveGrombyang = new Intent(MoveActivity2.this, DetailGrombyang.class);
                startActivity(moveGrombyang);
                break;
        }
        switch (view.getId()) {
            case btnongklok:
                Intent moveOngklok = new Intent(MoveActivity2.this, DetailOngklok.class);
                startActivity(moveOngklok);
                break;
        }
        switch (view.getId()) {
            case btngandul:
                Intent moveGandul = new Intent(MoveActivity2.this, DetailGandul.class);
                startActivity(moveGandul);
                break;
        }
        switch (view.getId()) {
            case btnliwet:
                Intent moveLiwet = new Intent(MoveActivity2.this, DetailLiwet.class);
                startActivity(moveLiwet);
                break;
        }
        switch (view.getId()) {
            case btnkudus:
                Intent moveKudus = new Intent(MoveActivity2.this, DetailKudus.class);
                startActivity(moveKudus);
                break;
        }
        switch (view.getId()) {
            case btnlumpia:
                Intent moveLumpia = new Intent(MoveActivity2.this, DetailLumpia.class);
                startActivity(moveLumpia);
                break;
        }
        switch (view.getId()) {
            case btndawet:
                Intent moveDawet = new Intent(MoveActivity2.this, DetailDawet.class);
                startActivity(moveDawet);
                break;
        }
    }
}