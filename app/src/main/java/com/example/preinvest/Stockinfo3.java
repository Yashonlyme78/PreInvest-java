package com.example.preinvest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Stockinfo3 extends AppCompatActivity {
    Button st3;
    Button rt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stockinfo3);
        st3 = findViewById(R.id.bz);
        rt3= findViewById(R.id.pz3);

        st3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Stockinfo4.class);
                startActivity(intent);
                finish();
            }
        });
        rt3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Stockinfo2.class);
            startActivity(intent);
            finish();
            }
        });
    }
}
