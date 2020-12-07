package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_jamblang;

public class DetailJamblang extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jamblang);

        Button BtnJamblang = findViewById(btn_jamblang);
        BtnJamblang.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_jamblang:
                Intent moveIntent = new Intent(DetailJamblang.this, ResepJamblang.class);
                startActivity(moveIntent);
                break;
        }
    }
}