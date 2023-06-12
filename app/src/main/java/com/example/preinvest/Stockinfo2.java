package com.example.preinvest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Stockinfo2 extends AppCompatActivity {
    Button st2;
    Button rt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stockinfo2);
        st2 = findViewById(R.id.bz2);
        rt2=findViewById(R.id.pz2);

        st2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Stockinfo3.class);
                startActivity(intent);
                finish();
            }
        });
        rt2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), Stockinfo1.class);
            startActivity(intent);
            finish();
        }
    });
    }
}
