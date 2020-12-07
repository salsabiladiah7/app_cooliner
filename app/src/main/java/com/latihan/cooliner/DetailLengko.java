package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_nasilengko;

public class DetailLengko extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lengko);

        Button BtnLengko = findViewById(btn_nasilengko);
        BtnLengko.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_nasilengko:
                Intent moveIntent = new Intent(DetailLengko.this, ResepLengko.class);
                startActivity(moveIntent);
                break;
        }
    }
}