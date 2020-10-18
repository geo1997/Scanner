package com.technic.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTakePicture, btnScanBarcode,btnScanBarcodeForUnreserved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        btnScanBarcode = findViewById(R.id.btnScanBarcode);
        btnScanBarcodeForUnreserved= findViewById(R.id.btnScanForUnreserved);
        btnScanBarcode.setOnClickListener(this);
        btnScanBarcodeForUnreserved.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnScanBarcode:
                startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));
                break;

            case R.id.btnScanForUnreserved:
                startActivity(new Intent(MainActivity.this,ScannedBarcodeActivityUnreserved.class));
                break;

        }

    }
}
