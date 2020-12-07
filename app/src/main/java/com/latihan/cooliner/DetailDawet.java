package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_dawet;

public class DetailDawet extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dawet);

        Button BtnDawet = findViewById(btn_dawet);
        BtnDawet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_dawet:
                Intent moveIntent = new Intent(DetailDawet.this, ResepDawet.class);
                startActivity(moveIntent);
                break;
        }
    }
}