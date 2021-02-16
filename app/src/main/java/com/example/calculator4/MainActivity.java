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

        View.OnClickListener buttonsandar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sanaldyngy = sandar.getText().toString();
                String result = "";
                String ayagy= ";";
                switch(v.getId()){

                    case R.id.btn0:
                        result = "0";
                        break;

                    case R.id.btn1:
                        result = "1";
                        break;

                    case R.id.btn2:
                        result = "2";
                        break;

                    case R.id.btn3:
                        result = "3";
                        break;

                    case R.id.btn4:
                        result = "4";
                        break;

                    case R.id.btn5:
                        result = "5";
                        break;

                    case R.id.btn6:

                        result = "6";
                        break;
                    case R.id.btn7:
                        result = "7";
                        break;

                    case R.id.btn8:
                        result = "8";
                        break;

                    case R.id.btn9:
                        result = "9";
                        break;
                    case R.id.button02:
                        result = "00";
                        break;

                }
                if(!sanaldyngy.equals("0")) ayagy= sanaldyngy+result;
                else ayagy = result;
                sandar.setText(ayagy);

            }


        };
        button0.setOnClickListener(buttonsandar);
        button1.setOnClickListener(buttonsandar);
        button2.setOnClickListener(buttonsandar);
        button3.setOnClickListener(buttonsandar);
        button4.setOnClickListener(buttonsandar);
        button5.setOnClickListener(buttonsandar);
        button6.setOnClickListener(buttonsandar);
        button7.setOnClickListener(buttonsandar);
        button8.setOnClickListener(buttonsandar);
        button9.setOnClickListener(buttonsandar);

        View.OnClickListener buttonoshiruPlusMinus = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.buttonclear:
                        sandar.setText("0");
                        break;

                    case R.id.buttonoshiru:
                        String sanText = sandar.getText().toString();
                        int san = Integer.parseInt(sanText);

                        if(san > 0) sandar.setText("-"+ sanText);
                        else{
                            san = san * (-1);
                            sandar.setText("" + san);
                        }


                        break;
                }
            }
        };
        buttonclear.setOnClickListener(buttonoshiruPlusMinus);
        buttonoshiru.setOnClickListener(buttonoshiruPlusMinus);


    }




    }
}