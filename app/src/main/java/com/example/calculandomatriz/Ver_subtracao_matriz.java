package com.example.calculandomatriz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class Ver_subtracao_matriz extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_subtracao_matriz);

        Intent i = getIntent();
        TextView t[] = new TextView[10];

        int sub[] = i.getIntArrayExtra("Extra");
        int j;

        String g[] = new String[9];

        for(j=0; j < 9; j++) {

            String s = "T" + j;
            t[j] = findViewById(getResources().getIdentifier(s, "id", getOpPackageName()));
        }

        t[9] = findViewById(R.id.T9);
        String n = i.getStringExtra("Matriz");

        t[9].setText(n);

        for(j = 0; j < 9; j++) {

            g[j] = Integer.toString(sub[j]);
        }

        for(j = 0; j < 9; j++) {

            t[j].setText(g[j]);
        }
    }
}