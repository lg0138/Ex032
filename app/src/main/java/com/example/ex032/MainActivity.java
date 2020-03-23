package com.example.ex032;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btncnc ;
    Button btnnum ;
    TextView tv1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncnc = findViewById(R.id.btncnc );
        btnnum = findViewById(R.id.btnnum);
        tv1 = findViewById(R.id.tv1);
    }

    public void canc_numb(View view) {

        tv1.setText("Number not found" );

    }

    public void cret_numb(View view) {

        Random rnd = new Random();
        int num = rnd.nextInt(10)+1;
        tv1.setText("Number = " + num);

    }
}
