package com.example.calculandomatriz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.mViewHolder.button1 = findViewById( R.id.button_1);
        this.mViewHolder.button2 = findViewById( R.id.button_2);
        this.mViewHolder.button3 = findViewById( R.id.button_3);
        this.mViewHolder.button4 = findViewById( R.id.button_4);
        this.mViewHolder.button5 = findViewById( R.id.button_5);
        this.mViewHolder.button6 = findViewById( R.id.button_6);

        this.mViewHolder.button1.setOnClickListener(this);
        this.mViewHolder.button2.setOnClickListener(this);
        this.mViewHolder.button3.setOnClickListener(this);
        this.mViewHolder.button4.setOnClickListener(this);
        this.mViewHolder.button5.setOnClickListener(this);
        this.mViewHolder.button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_1) {

            Intent p = new Intent(this, soma_matriz.class);
            startActivity( p );

        } else if(v.getId() == R.id.button_2) {

            Intent p = new Intent(this, subtrair_matriz.class);
            startActivity( p );

        } else if(v.getId() == R.id.button_3) {

            Intent p = new Intent(this, multiplicar_matriz.class);
            startActivity( p );

        } else if(v.getId() == R.id.button_4) {

            Intent p = new Intent(this, dividir_matriz.class);
            startActivity(p);

        } else if(v.getId() == R.id.button_5) {

            Intent p = new Intent(this, matriz_determinante.class);
            startActivity(p);

        } else if(v.getId() == R.id.button_6) {

            Intent p = new Intent(this, matriz_inversa.class);
            startActivity(p);
        }

    }

    private static class ViewHolder {

        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;
    }
}