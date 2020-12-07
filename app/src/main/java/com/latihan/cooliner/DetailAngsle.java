package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_angsle;

public class DetailAngsle extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_angsle);

        Button BtnAngsle = findViewById(btn_angsle);
        BtnAngsle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_angsle:
                Intent moveIntent = new Intent(DetailAngsle.this, ResepAngsle.class);
                startActivity(moveIntent);
                break;
        }
    }
}