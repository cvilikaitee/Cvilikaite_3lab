package com.example.a3labcvlilikaite;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button zero, one, two, three, four, five, six,
            seven, eight, nine, plus, minus, div,
            mult, c, equal, buttonDot,root, plusMinus, del, pow;
    EditText crunchifyEditText;
    TextView textView;
    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, rootFuncion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        c = (Button) findViewById(R.id.c);
        equal = (Button) findViewById(R.id.equal);
        root = (Button) findViewById(R.id.root);
        plusMinus= (Button) findViewById(R.id.plusMinus);
        del = (Button) findViewById(R.id.del);
        pow = (Button) findViewById(R.id.button15);
        crunchifyEditText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                    textView.setText(String.valueOf(mValueOne)+ "+");
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mSubtract = true;
                    crunchifyEditText.setText(null);
                    textView.setText(String.valueOf(mValueOne)+ "-");
                }

            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    double square = Math.sqrt((double) mValueOne);
                    crunchifyEditText.setText(square+ "");
                    textView.setText("???"+String.valueOf(mValueOne));
                    mValueOne = (float) square;
                }

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyMultiplication = true;
                    crunchifyEditText.setText(null);
                    textView.setText(String.valueOf(mValueOne)+ "*");
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyDivision = true;
                    crunchifyEditText.setText(null);
                    textView.setText(String.valueOf(mValueOne)+ "/");
                }

            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    double pow = Math.pow((double) mValueOne,2);
                    crunchifyEditText.setText(pow+ "");
                    textView.setText(String.valueOf(pow)+ "^2");
                    mValueOne = (float) pow;
                }

            }
        });
        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mValueOne = mValueOne * -1;
                    crunchifyEditText.setText(String.valueOf(mValueOne));
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunchifyAddition == true) {
                    textView.setText(String.valueOf(mValueOne)+ "+"+ String.valueOf(mValueTwo));
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    textView.setText(String.valueOf(mValueOne)+ "-"+ String.valueOf(mValueTwo));
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    textView.setText(String.valueOf(mValueOne)+ "*"+ String.valueOf(mValueTwo));
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    textView.setText(String.valueOf(mValueOne)+ "/"+ String.valueOf(mValueTwo));
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
                textView.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lenght = crunchifyEditText.length();
                if(lenght != 0) crunchifyEditText.getText().delete(lenght - 1, lenght);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "0.");
                } else {
                    crunchifyEditText.setText(crunchifyEditText.getText() + ".");
                }

            }
        });
    }
};