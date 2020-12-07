package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_cendol;

public class DetailCendol extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cendol);

        Button BtnCendol = findViewById(btn_cendol);
        BtnCendol.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_cendol:
                Intent moveIntent = new Intent(DetailCendol.this, ResepCendol.class);
                startActivity(moveIntent);
                break;
        }
    }
}