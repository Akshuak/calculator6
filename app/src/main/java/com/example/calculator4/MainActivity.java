package com.example.calculator4;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonclear,buttonpercent,buttonoshiru,btdivision,btmultiplication,btsubtraction,btadd,btten,btto,button02,button0;
    TextView sandar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button02 = findViewById(R.id.button02);
        buttonclear = findViewById(R.id.buttonclear);
        buttonpercent = findViewById(R.id.buttonpercent);
        buttonoshiru = findViewById(R.id.buttonoshiru);
        btto = findViewById(R.id.btto);
        btten = findViewById(R.id.btten);
        btdivision= findViewById(R.id.btdivision);
        btmultiplication = findViewById(R.id.btmultiplication);
        btsubtraction = findViewById(R.id.btsubtraction);
        btadd = findViewById(R.id.btadd);



        sandar = findViewById(R.id.sandar);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("9");
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("00");
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("x");
            }
        });
        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("%");
            }
        });
        buttonoshiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("icon");
            }
        });
        btto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText(".");
            }
        });
        btten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("=");
            }
        });
        btdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("/");
            }
        });
        btmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("*");
            }
        });
        btsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("-");
            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                sandar.setText("+");
            }
        });





    }
}