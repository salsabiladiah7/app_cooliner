package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_gandul;

public class DetailGandul extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_gandul);

        Button BtnGandul = findViewById(btn_gandul);
        BtnGandul.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_gandul:
                Intent moveIntent = new Intent(DetailGandul.this, ResepGandul.class);
                startActivity(moveIntent);
                break;
        }
    }
}