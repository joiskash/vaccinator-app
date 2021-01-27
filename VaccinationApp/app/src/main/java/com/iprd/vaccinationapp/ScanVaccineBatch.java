package com.iprd.vaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScanVaccineBatch extends AppCompatActivity implements  View.OnClickListener{

    Button scan_vaccine_batch_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_vaccine_batch);
        scan_vaccine_batch_btn = (Button) findViewById(R.id.scan_vaccine_batch_btn);
        scan_vaccine_batch_btn.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        switch (b.getId()) {
            case R.id.scan_vaccine_batch_btn:

                Intent intent = new Intent(ScanVaccineBatch.this, ReadyToScanToday.class);
                startActivity(intent);

                break;

        }
    }
}