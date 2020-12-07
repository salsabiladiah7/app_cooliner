package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_bandros;

public class DetailBandros extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bandros);

        Button BtnBandros = findViewById(btn_bandros);
        BtnBandros.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_bandros:
                Intent moveIntent = new Intent(DetailBandros.this, ResepBandros.class);
                startActivity(moveIntent);
                break;
        }
    }
}