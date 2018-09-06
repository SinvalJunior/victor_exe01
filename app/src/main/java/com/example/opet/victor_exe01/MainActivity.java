package com.example.opet.victor_exe01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade;
    private TextView resultado;
    //private EditText [] nomeTeste;
    //private int      idadeTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade     = findViewById(R.id.idade);
        resultado = findViewById(R.id.resultado);


    }

    public void resultado(View v){

        String idadeVar = idade.getText().toString();

        if(v.getId()==R.id.verificar){

            float idadeFinal = Float.parseFloat(idadeVar);

            if(idadeFinal < 8){

                resultado.setText("Você não tem idade para participar");

            }

            if(idadeFinal >= 8 && idadeFinal <= 12){

                resultado.setText("Infantil");

            }

            if(idadeFinal > 12 && idadeFinal <= 17){

                resultado.setText("Juvenil");

            }

            if(idadeFinal >= 18){

                resultado.setText("Adulto");

            }

        }
    }
}
