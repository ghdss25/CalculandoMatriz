package com.example.calculandomatriz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class dividir_matriz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir_matriz);

    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public void Dividir_Matriz(View v) {

        EditText e[][] = new EditText[2][9];

        int n1[] = new int[9];
        int n2[] = new int[9];
        int dividir[] = new int[9];

        int i, j;

        for(i=0; i < 2; i++) {

            for(j=0; j<9; j++) {

                String s = "T" + i + j;
                e[i][j] = findViewById(getResources().getIdentifier(s, "id", getOpPackageName()));
            }
        }

        for(i=0; i < 2; i++) {

            for(j=0; j<9; j++) {

                if(i == 0) {

                    n1[j] = Integer.parseInt(e[i][j].getText().toString());
                }

                if(i == 1) {

                    n2[j] = Integer.parseInt(e[i][j].getText().toString());
                }
            }
        }

        for(j = 0; j < 9; j++) {

            dividir[j] = n1[j] / n2[j];
        }

        Intent i1 = new Intent(this, ver_divisao_matriz.class);
        i1.putExtra("Extra", dividir);

        String n = "Divisão de Matrizes";

        i1.putExtra("Matriz Divisão", n);
        startActivity(i1);
    }
}