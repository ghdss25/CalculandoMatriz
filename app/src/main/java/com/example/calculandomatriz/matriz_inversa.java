package com.example.calculandomatriz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class matriz_inversa extends AppCompatActivity {

    EditText ed, ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8;
    TextView tv, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;

    int m[][] = new int [3][9];

    int l;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriz_inversa);

        ed = (EditText) findViewById(R.id.T00);
        ed1 = (EditText) findViewById(R.id.T01);
        ed2 = (EditText) findViewById(R.id.T02);

        ed3 = (EditText) findViewById(R.id.T03);
        ed4 = (EditText) findViewById(R.id.T04);
        ed5 = (EditText) findViewById(R.id.T05);

        ed6 = (EditText) findViewById(R.id.T06);
        ed7 = (EditText) findViewById(R.id.T07);
        ed8 = (EditText) findViewById(R.id.T08);

        tv = (TextView) findViewById(R.id.T0);
        tv1 = (TextView) findViewById(R.id.T1);
        tv2 = (TextView) findViewById(R.id.T2);

        tv3 = (TextView) findViewById(R.id.T3);
        tv4 = (TextView) findViewById(R.id.T4);
        tv5 = (TextView) findViewById(R.id.T5);

        tv6 = (TextView) findViewById(R.id.T6);
        tv7 = (TextView) findViewById(R.id.T7);
        tv8 = (TextView) findViewById(R.id.T8);
    }

    public void Matriz_Inversa(View v) {

        m[0][0] = Integer.parseInt(ed.getText().toString());
        m[0][1] = Integer.parseInt(ed1.getText().toString());
        m[0][2] = Integer.parseInt(ed2.getText().toString());

        m[1][0] = Integer.parseInt(ed3.getText().toString());
        m[1][1] = Integer.parseInt(ed4.getText().toString());
        m[1][2] = Integer.parseInt(ed5.getText().toString());

        m[2][0] = Integer.parseInt(ed6.getText().toString());
        m[2][1] = Integer.parseInt(ed7.getText().toString());
        m[2][2] = Integer.parseInt(ed8.getText().toString());

        for(l = 0; l < m.length; l++) {

            for(c = 0; c < m.length; c++) {

                tv.setText("" + m[2][2]);
                tv1.setText("" + m[2][1]);
                tv2.setText("" + m[2][0]);

                tv3.setText("" + m[1][2]);
                tv4.setText("" + m[1][1]);
                tv5.setText("" + m[1][0]);

                tv6.setText("" + m[0][2]);
                tv7.setText("" + m[0][1]);
                tv8.setText("" + m[0][0]);
            }
        }
    }
}