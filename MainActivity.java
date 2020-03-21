package com.example.promedios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        et1 = findViewById( R.id.et_matematica );
        et2 = findViewById( R.id.et_fisica );
        et3 = findViewById( R.id.et_quimica );
        tv1 = findViewById( R.id.tv_status );
    }

    public void estatus(View view){
        String matematicas_str=et1.getText().toString();
        String fisica_str=et2.getText().toString();
        String quimica_str=et3.getText().toString();

        int matematicas_int=Integer.parseInt( matematicas_str );
        int fisica_int=Integer.parseInt( matematicas_str);
        int quimica_int=Integer.parseInt( quimica_str );

        int promedio = (matematicas_int+fisica_int+quimica_int)/3;

        if(promedio >= 11){
            tv1.setText( "Alumno aprobado con " +promedio);
        }
        else{
            tv1.setText( "Alumno desaprobado con "+promedio );
        }
    }
}
