package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_kudus;

public class DetailKudus extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kudus);

        Button BtnKudus = findViewById(btn_kudus);
        BtnKudus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_kudus:
                Intent moveIntent = new Intent(DetailKudus.this, ResepKudus.class);
                startActivity(moveIntent);
                break;
        }
    }
}