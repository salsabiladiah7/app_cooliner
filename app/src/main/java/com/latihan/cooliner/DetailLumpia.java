package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_lumpia;

public class DetailLumpia extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lumpia);

        Button BtnLumpia = findViewById(btn_lumpia);
        BtnLumpia.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_lumpia:
                Intent moveIntent = new Intent(DetailLumpia.this, ResepLumpia.class);
                startActivity(moveIntent);
                break;
        }
    }
}