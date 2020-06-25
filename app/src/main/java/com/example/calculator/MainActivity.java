package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear;
    TextView ed1;

    int value1, value2;
    boolean isAddition, isSubstraction, isMultiplication, isDivision, isOperatorActive, isOperationDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);

        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        ed1 = (EditText) findViewById(R.id.edText1);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "0");
                } else {
                    ed1.setText("0");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "1");
                } else {
                    ed1.setText("1");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "2");
                } else {
                    ed1.setText("2");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "3");
                } else {
                    ed1.setText("3");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "4");
                } else {
                    ed1.setText("4");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "5");
                } else {
                    ed1.setText("5");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "6");
                } else {
                    ed1.setText("6");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "7");
                } else {
                    ed1.setText("7");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "8");
                } else {
                    ed1.setText("8");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + "9");
                } else {
                    ed1.setText("9");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperatorActive && !isOperationDone) {
                    ed1.setText(ed1.getText() + ".");
                } else {
                    ed1.setText("0.");
                    isOperatorActive = false;
                    isOperationDone = false;
                }
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    value1 = Integer.parseInt(ed1.getText() + "");
                    isAddition = true;
                    isOperatorActive = true;
                    isOperationDone = false;
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    value1 = Integer.parseInt(ed1.getText()+"");
                    isOperatorActive = true;
                    isSubstraction = true;
                }
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    value1 = Integer.parseInt(ed1.getText()+"");
                    isOperatorActive = true;
                    isMultiplication = true;
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    value1 = Integer.parseInt(ed1.getText()+"");
                    isOperatorActive = true;
                    isDivision = true;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                isOperatorActive = false;
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Integer.parseInt(ed1.getText()+"");
                isOperationDone = true;

                if (isAddition) {
                    ed1.setText(value1 + value2+"");
                    isAddition = false;
                }

                if (isSubstraction) {
                    ed1.setText(value1 - value2 + "");
                    isSubstraction = false;
                }

                if (isMultiplication) {
                    ed1.setText(value1 * value2 + "");
                    isMultiplication = false;
                }

                if (isDivision) {
                    ed1.setText(value1 / value2 + "");
                    isDivision = false;
                }
            }
        });
    }
}

