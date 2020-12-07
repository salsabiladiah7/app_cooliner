package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_rujak;

public class DetailRujak extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rujak);

        Button BtnRujak = findViewById(btn_rujak);
        BtnRujak.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_rujak:
                Intent moveIntent = new Intent(DetailRujak.this, ResepRujak.class);
                startActivity(moveIntent);
                break;
        }
    }
}