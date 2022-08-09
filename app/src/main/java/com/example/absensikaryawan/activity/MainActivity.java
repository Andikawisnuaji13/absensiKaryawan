package com.example.absensikaryawan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.absensikaryawan.R;

public class MainActivity extends AppCompatActivity {
    private Button scan, daftar, cloud, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.btnscan);
        daftar = findViewById(R.id.btndaftar);
        cloud = findViewById(R.id.btncloud);
        about = findViewById(R.id.btnabout);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //ketika tombol scan di klik, masuk ke menu scan
            startActivity(new Intent(MainActivity.this, ScanActivity2.class));
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //ketika tombol daftar diklik, masuk ke menu daftar
            startActivity(new Intent(MainActivity.this, DaftarActivity.class));

            }
        });
        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ketika tombol daftar hadir cloud diklik, masuk ke menu daftar hadir cloud
                startActivity(new Intent(MainActivity.this, DaftarCloudActivity.class));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });
    }
}