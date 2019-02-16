package com.choudhary.deepa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, plusbtn, minusbtn, multbtn, divbtn, clearbtn, equalbtn, dotbtn;
    EditText editText;
    TextView errorAlert;
    Float num1 = null, num2 = null;
    boolean clearText = false;
    String prevops = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        plusbtn = (Button) findViewById(R.id.plusbtn);
        minusbtn = (Button) findViewById(R.id.minusbtn);
        multbtn = (Button) findViewById(R.id.multbtn);
        divbtn = (Button) findViewById(R.id.divbtn);
        clearbtn = (Button) findViewById(R.id.clearbtn);
        dotbtn = (Button) findViewById(R.id.dotbtn);
        equalbtn = (Button) findViewById(R.id.equalbtn);
        errorAlert = (TextView) findViewById(R.id.errorAlert);
        editText = (EditText) findViewById(R.id.editText);


        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "0");
                clearText = false;
            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "1");
                clearText = false;
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "2");
                clearText = false;
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "3");
                clearText = false;
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "4");
                clearText = false;
            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "5");
                clearText = false;
            }

        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "6");
                clearText = false;
            }

        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "7");
                clearText = false;
            }

        });

        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "8");
                clearText = false;
            }

        });

        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + "9");
                clearText = false;
            }

        });

        dotbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(clearText)
                    editText.setText("");
                editText.setText(editText.getText() + ".");
                clearText = false;
            }

        });

        plusbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txt = String.valueOf(editText.getText());
                if (txt.isEmpty() || txt == null) {
                    errorAlert.setText("Enter some valid number!");
                    errorAlert.setVisibility(View.VISIBLE);
                } else {

                    if (num1 == null && num2 == null) {
                        num1 = Float.parseFloat(txt);
                    } else {
                        num2 = Float.parseFloat(txt);
                    }
                    editText.setText(null);

                    if (num2 != null) {
                        if (prevops != null) {
                            switch (prevops) {
                                case "add":
                                    num1 = num1 + num2;
                                    num2 = null;
                                    break;
                                case "sub":
                                    num1 = num1 - num2;
                                    num2 = null;
                                    break;
                                case "mul":
                                    num1 = num1 * num2;
                                    num2 = null;
                                    break;
                                case "div":
                                    num1 = num1 / num2;
                                    num2 = null;
                                    break;
                            }
                            editText.setText(num1.toString());
                        }

                    }
                    prevops = "add";
                    clearText = true;
                }
            }

        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txt = String.valueOf(editText.getText());
                if (txt.isEmpty() || txt == null) {
                    errorAlert.setText("Enter some valid number!");
                    errorAlert.setVisibility(View.VISIBLE);
                } else {

                    if (num1 == null && num2 == null) {
                        num1 = Float.parseFloat(txt);
                    } else {
                        num2 = Float.parseFloat(txt);
                    }
                    editText.setText(null);

                    if (num2 != null) {
                        if (prevops != null) {
                            switch (prevops) {
                                case "add":
                                    num1 = num1 + num2;
                                    num2 = null;
                                    break;
                                case "sub":
                                    num1 = num1 - num2;
                                    num2 = null;
                                    break;
                                case "mul":
                                    num1 = num1 * num2;
                                    num2 = null;
                                    break;
                                case "div":
                                    num1 = num1 / num2;
                                    num2 = null;
                                    break;
                            }
                            editText.setText(num1.toString());
                        }
                    }
                    prevops = "sub";
                    clearText = true;
                }
            }
        });

        multbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txt = String.valueOf(editText.getText());
                if (txt.isEmpty() || txt == null) {
                    errorAlert.setText("Enter some valid number!");
                    errorAlert.setVisibility(View.VISIBLE);
                } else {

                    if (num1 == null && num2 == null) {
                        num1 = Float.parseFloat(editText.getText() + "");
                    } else {
                        num2 = Float.parseFloat(editText.getText() + "");
                    }
                    editText.setText(null);

                    if (num2 != null) {
                        if (prevops != null) {
                            switch (prevops) {
                                case "add":
                                    num1 = num1 + num2;
                                    num2 = null;
                                    break;
                                case "sub":
                                    num1 = num1 - num2;
                                    num2 = null;
                                    break;
                                case "mul":
                                    num1 = num1 * num2;
                                    num2 = null;
                                    break;
                                case "div":
                                    num1 = num1 / num2;
                                    num2 = null;
                                    break;
                            }
                            editText.setText(num1.toString());
                        }

                    }
                    prevops = "mul";
                    clearText = true;
                }
            }
        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txt = String.valueOf(editText.getText());
                if (txt.isEmpty() || txt == null) {
                    errorAlert.setText("Enter some valid number!");
                    errorAlert.setVisibility(View.VISIBLE);
                } else {

                    if (num1 == null && num2 == null) {
                        num1 = Float.parseFloat(editText.getText() + "");
                    } else {
                        num2 = Float.parseFloat(editText.getText() + "");
                    }
                    editText.setText(null);

                    if (num2 != null) {
                        if (prevops != null) {
                            switch (prevops) {
                                case "add":
                                    num1 = num1 + num2;
                                    num2 = null;
                                    break;
                                case "sub":
                                    num1 = num1 - num2;
                                    num2 = null;
                                    break;
                                case "mul":
                                    num1 = num1 * num2;
                                    num2 = null;
                                    break;
                                case "div":
                                    num1 = num1 / num2;
                                    num2 = null;
                                    break;
                            }
                            editText.setText(num1.toString());
                        }

                    }
                    prevops = "div";
                    clearText = true;
                }
            }
        });

        equalbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txt = String.valueOf(editText.getText());
                if (txt.isEmpty() || txt == null) {
                    errorAlert.setText("Enter some valid number!");
                    errorAlert.setVisibility(View.VISIBLE);
                } else {

                    if (num1 == null && num2 == null) {
                        num1 = Float.parseFloat(editText.getText() + "");
                    } else {
                        num2 = Float.parseFloat(editText.getText() + "");
                    }
                    editText.setText(null);

                    if (num2 != null) {
                        if (prevops != null) {
                            switch (prevops) {
                                case "add":
                                    num1 = num1 + num2;
                                    num2 = null;
                                    break;
                                case "sub":
                                    num1 = num1 - num2;
                                    num2 = null;
                                    break;
                                case "mul":
                                    num1 = num1 * num2;
                                    num2 = null;
                                    break;
                                case "div":
                                    num1 = num1 / num2;
                                    num2 = null;
                                    break;
                            }
                            editText.setText(num1.toString());
                        }

                    }
                    clearText = true;
                    num2 = null;
                    num1 = null;
                }
            }

        });
        clearbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                editText.setText("");
                num2 = null;
                num1 = null;
                errorAlert.setText("");
                errorAlert.setVisibility(View.INVISIBLE);
                prevops = null;
            }

        });


    }
}

