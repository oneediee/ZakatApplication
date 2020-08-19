package com.example.zakatapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZakatMaalActivity extends AppCompatActivity {

    private Button btnBackdua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_maal);

        btnBackdua = (Button) findViewById(R.id.btn_backdua);

        btnBackdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ZakatMaalActivity.this, MainActivity.class));
            }
        });

    }
}
