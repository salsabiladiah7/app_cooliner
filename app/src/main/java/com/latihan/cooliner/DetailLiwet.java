package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_liwet;

public class DetailLiwet extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_liwet);

        Button BtnLiwet = findViewById(btn_liwet);
        BtnLiwet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_liwet:
                Intent moveIntent = new Intent(DetailLiwet.this, ResepLiwet.class);
                startActivity(moveIntent);
                break;
        }
    }
}