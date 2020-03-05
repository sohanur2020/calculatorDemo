package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnMul, btnDiv, btnEql,
            btnDot;
    Button btnC;
    TextView input, output;
    double a, b, result;
    // boolean Add, Sub, Mul, Div;

    enum OperationFlag {
        Add, Sub, Mul, Div, NO;
    }

    private OperationFlag flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDot = (Button) findViewById(R.id.btndout);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnAdd = (Button) findViewById(R.id.plusbtn);
        btnSub = (Button) findViewById(R.id.minusbtn);
        btnMul = (Button) findViewById(R.id.btnmultiplication);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnEql = (Button) findViewById(R.id.equalbtn);
        btnC = (Button) findViewById(R.id.btnclear);
        input = (TextView) findViewById(R.id.tvInput);
        output = (TextView) findViewById(R.id.tvResult);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnDot.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEql.setOnClickListener(this);
    }  // end of on create method

    int counter = 0;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                setText("0");
                break;
            case R.id.btn1:
                setText("1");
                break;
            case R.id.btn2:
                setText("2");
                break;
            case R.id.btn3:
                setText("3");
                break;
            case R.id.btn4:
                setText("4");
                break;
            case R.id.btn5:
                setText("5");
                break;
            case R.id.btn6:
                setText("6");
                break;
            case R.id.btn7:
                setText("7");
                break;
            case R.id.btn8:
                setText("8");
                break;
            case R.id.btn9:
                setText("9");
                break;
            case R.id.btndout:
                setText(".");
                break;
            case R.id.btnclear:
                clear();
                a=b=result=counter=0;
                break;

            case R.id.plusbtn:
                a = Double.parseDouble(input.getText().toString());
                setText("+");
                setText();
                flag = OperationFlag.Add;
                break;
            case R.id.equalbtn:
                if (counter == 0)
                    b = Double.parseDouble(input.getText().toString());
                ++counter;
                switch (flag) {

                    case Add:
                        result = a + b;
                        break;
                    default:
                        setText("pagla");
                        break;
                }
                setText(result);
                a = Double.parseDouble(input.getText().toString());
                break;
        }
    }

    private void setText(Double num) {
        output.setText(String.valueOf(num));
        // tvHistory.setText(tvHistory.getText()+num);
    }

    private void setText(String num) {
        input.setText(input.getText() + num);
    }

    private void setText() {
        input.setText("");
    }
    private void clear() {
        input.setText("");
        output.setText("");
    }
    private void a(){
        a = Double.parseDouble(input.getText().toString());
    }
    private void b(){
        b = Double.parseDouble(input.getText().toString());
    }
}
