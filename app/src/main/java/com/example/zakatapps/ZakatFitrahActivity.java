package com.example.zakatapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZakatFitrahActivity extends AppCompatActivity {

    private Button btnBacksatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_fitrah);

        btnBacksatu = (Button) findViewById(R.id.btn_backsatu);

        btnBacksatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ZakatFitrahActivity.this, MainActivity.class));
            }
        });
    }
}
