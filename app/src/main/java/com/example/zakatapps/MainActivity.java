package com.example.zakatapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSignOut, btnAbout, btnZakatfitrah, btnZakatmaal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignOut = (Button) findViewById(R.id.sign_out);
        btnAbout = (Button) findViewById(R.id.btn_about);
        btnZakatfitrah = (Button) findViewById(R.id.zakat_fitrah);
        btnZakatmaal = (Button) findViewById(R.id.zakat_maal);

        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        btnZakatfitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ZakatFitrahActivity.class));
            }
        });

        btnZakatmaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ZakatMaalActivity.class));
            }
        });

    }
}
