package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_madu;

public class DetailMadu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_madu);

        Button BtnMadu = findViewById(btn_madu);
        BtnMadu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_madu:
                Intent moveIntent = new Intent(DetailMadu.this, ResepMadu.class);
                startActivity(moveIntent);
                break;
        }
    }
}