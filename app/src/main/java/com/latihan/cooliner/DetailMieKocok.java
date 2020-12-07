package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_miekocok;

public class DetailMieKocok extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mie_kocok);

        Button Btn = findViewById(btn_miekocok);
        Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_miekocok:
                Intent moveIntent = new Intent(DetailMieKocok.this, ResepMieKocok.class);
                startActivity(moveIntent);
                break;
        }
    }
}