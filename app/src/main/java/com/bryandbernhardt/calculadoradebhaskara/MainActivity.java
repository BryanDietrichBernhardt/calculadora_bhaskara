package com.bryandbernhardt.calculadoradebhaskara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number_a, number_b, number_c;
    Button btn_calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_a = (EditText) findViewById(R.id.number_a);
        number_b = (EditText) findViewById(R.id.number_b);
        number_c = (EditText) findViewById(R.id.number_c);
        btn_calc = (Button) findViewById(R.id.btn_calc);

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(number_a.getText().toString());
                double b = Double.parseDouble(number_b.getText().toString());
                double c = Double.parseDouble(number_c.getText().toString());
                double raiz_delta = Math.sqrt(b*b-4*a*c);
                double x1 = (-b+raiz_delta)/(2*a);
                double x2 = (-b-raiz_delta)/(2*a);

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                 dialogo.setTitle("Resposta da Bhaskara:");
                 dialogo.setMessage("X1 = " + x1 + "     X2 = " + x2);

                 dialogo.setNeutralButton("OK",null);
                 dialogo.show();


            }
        });
    }
}