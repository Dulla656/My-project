package com.example.wahaby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button div;
    private Button mult;
    private Button sub;
    private Button equal;
    private Button clear;
    private TextView oper;
    private TextView result;
    private final char ADDITION = '+';
    private final char DIVISION = '/';
    private final char MULTIPLICATION = '*';
    private final char SUBSTRACTION = '-';
    private final char EQUAL = 0;
    private char ACTION;
    private double val1 = Double.NaN;
    private double val2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper.setText(oper.getText().toString() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1).toString() + "+");
                oper.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBSTRACTION;
                result.setText(String.valueOf(val1).toString() + "-");
                oper.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1).toString() + "/");
                oper.setText(null);
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1).toString() + "*");
                oper.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUAL;
                result.setText(result.getText().toString().valueOf(val2) + "=" + String.valueOf(val1));
                oper.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oper.getText().length() > 0){
                    CharSequence name = oper.getText().toString();
                    oper.setText(name.subSequence(0, name.length() -1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    oper.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    public void setupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn0);
        add = (Button)findViewById(R.id.Addition);
        sub = (Button)findViewById(R.id.Substraction);
        mult = (Button)findViewById(R.id.Multiplication);
        div = (Button)findViewById(R.id.Division);
        equal = (Button)findViewById(R.id.Equal);
        clear = (Button)findViewById(R.id.Clear);
        oper = (TextView)findViewById(R.id.Operation);
    }

    private void compute(){
        if (!Double.isNaN(val1)){
        val1 = Double.parseDouble(oper.getText().toString());
        switch (ACTION){
            case DIVISION:
                val1 = val1/val2;
                break;
            case MULTIPLICATION:
                val1 = val1*val2;
                break;
            case ADDITION:
                val1 = val1+val2;
                break;
            case SUBSTRACTION:
                val1 = val1-val2;
                break;
            case EQUAL:
                break;
        }
    }else {
            val1 = Double.parseDouble(oper.getText().toString());
        }
    }
}