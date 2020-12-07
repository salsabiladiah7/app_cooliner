package com.latihan.cooliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.latihan.cooliner.R.id.btn_grombyang;

public class DetailGrombyang extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_grombyang);

        Button BtnGrombyang = findViewById(btn_grombyang);
        BtnGrombyang.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_grombyang:
                Intent moveIntent = new Intent(DetailGrombyang.this, ResepGrombyang.class);
                startActivity(moveIntent);
                break;
        }
    }
}