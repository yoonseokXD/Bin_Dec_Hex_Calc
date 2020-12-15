package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    ToggleButton Bin, Dec, Hex;
    RadioButton ResBin, ResDec, ResHex;
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnrem;
    TextView textResult;
    String num1, num2, result2, result16;
    Integer result;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("진법변환 계산기");

        Bin = (ToggleButton) findViewById(R.id.InputBin);
        Dec = (ToggleButton) findViewById(R.id.InputDec);
        Hex = (ToggleButton) findViewById(R.id.InputHex);
        ResBin = (RadioButton) findViewById(R.id.ResBin);
        ResDec = (RadioButton) findViewById(R.id.ResDec);
        ResHex = (RadioButton) findViewById(R.id.ResHex);
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnrem = (Button) findViewById(R.id.Btnrem);

        textResult = (TextView) findViewById(R.id.TextResult);

        /*Bin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton View, boolean isChecked) {

            }
        });
        {

        }
        ;*/

            btnAdd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if ( (Bin.isChecked())&& (Hex.isChecked()) || (Bin.isChecked()) && (Dec.isChecked()) || (Dec.isChecked())&& (Hex.isChecked()) ) {
                        Toast.makeText(getApplicationContext(), "Input Mode 는 한 가지만 가능합니다."
                                , Toast.LENGTH_SHORT).show();
                        textResult.setText(" Invalid Mode ");
                    }
                    else {

                        if (Bin.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else if (Dec.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else
                        {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (num1.equals("") || num2.equals("")) {

                                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                            , Toast.LENGTH_SHORT).show();
                                    textResult.setText("계산 결과 : ");

                                } else {
                                    if (ResBin.isChecked()) {

                                        result = Integer.parseInt(num1, 16) + Integer.parseInt(num2, 16);
                                        result2 = Integer.toBinaryString(result);
                                        textResult.setText("계산 결과 : " + result2);

                                    } else if (ResDec.isChecked()) {
                                        result = Integer.parseInt(num1, 16) + Integer.parseInt(num2, 16);
                                        textResult.setText("계산 결과 : " + result.toString());

                                    } else {
                                        result = Integer.parseInt(num1, 16) + Integer.parseInt(num2, 16);
                                        result16 = Integer.toHexString(result);
                                        textResult.setText("계산 결과 : " + result16);
                                    }
                                }
                            }
                        }

                    }
                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if ( (Bin.isChecked())&& (Hex.isChecked()) || (Bin.isChecked()) && (Dec.isChecked()) || (Dec.isChecked())&& (Hex.isChecked()) ) {
                        Toast.makeText(getApplicationContext(), "Input Mode 는 한 가지만 가능합니다."
                                , Toast.LENGTH_SHORT).show();
                        textResult.setText(" Invalid Mode ");
                    }
                    else {

                        if (Bin.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1, 2) - Integer.parseInt(num2, 2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1, 2) - Integer.parseInt(num2, 2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1, 2) - Integer.parseInt(num2, 2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else if (Dec.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else
                        {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (num1.equals("") || num2.equals("")) {

                                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                            , Toast.LENGTH_SHORT).show();
                                    textResult.setText("계산 결과 : ");

                                } else {
                                    if (ResBin.isChecked()) {

                                        result = Integer.parseInt(num1, 16) - Integer.parseInt(num2, 16);
                                        result2 = Integer.toBinaryString(result);
                                        textResult.setText("계산 결과 : " + result2);

                                    } else if (ResDec.isChecked()) {
                                        result = Integer.parseInt(num1, 16) - Integer.parseInt(num2, 16);
                                        textResult.setText("계산 결과 : " + result.toString());

                                    } else {
                                        result = Integer.parseInt(num1, 16) - Integer.parseInt(num2, 16);
                                        result16 = Integer.toHexString(result);
                                        textResult.setText("계산 결과 : " + result16);
                                    }
                                }
                            }
                        }

                    }

                }
            });

            btnMul.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if ((Bin.isChecked()) && (Hex.isChecked()) || (Bin.isChecked()) && (Dec.isChecked()) || (Dec.isChecked()) && (Hex.isChecked())) {
                        Toast.makeText(getApplicationContext(), "Input Mode 는 한 가지만 가능합니다."
                                , Toast.LENGTH_SHORT).show();
                        textResult.setText(" Invalid Mode ");
                    } else {

                        if (Bin.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1, 2) * Integer.parseInt(num2, 2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1, 2) * Integer.parseInt(num2, 2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1, 2) * Integer.parseInt(num2, 2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        } else if (Dec.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        } else {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (num1.equals("") || num2.equals("")) {

                                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                            , Toast.LENGTH_SHORT).show();
                                    textResult.setText("계산 결과 : ");

                                } else {
                                    if (ResBin.isChecked()) {

                                        result = Integer.parseInt(num1, 16) * Integer.parseInt(num2, 16);
                                        result2 = Integer.toBinaryString(result);
                                        textResult.setText("계산 결과 : " + result2);

                                    } else if (ResDec.isChecked()) {
                                        result = Integer.parseInt(num1, 16) * Integer.parseInt(num2, 16);
                                        textResult.setText("계산 결과 : " + result.toString());

                                    } else {
                                        result = Integer.parseInt(num1, 16) * Integer.parseInt(num2, 16);
                                        result16 = Integer.toHexString(result);
                                        textResult.setText("계산 결과 : " + result16);
                                    }
                                }
                            }
                        }

                    }
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if ( (Bin.isChecked())&& (Hex.isChecked()) || (Bin.isChecked()) && (Dec.isChecked()) || (Dec.isChecked())&& (Hex.isChecked()) ) {
                        Toast.makeText(getApplicationContext(), "Input Mode 는 한 가지만 가능합니다."
                                , Toast.LENGTH_SHORT).show();
                        textResult.setText(" Invalid Mode ");
                    }
                    else {

                        if (Bin.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1, 2) / Integer.parseInt(num2, 2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1, 2) / Integer.parseInt(num2, 2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1, 2) / Integer.parseInt(num2, 2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else if (Dec.isChecked()) {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (ResBin.isChecked()) {

                                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                                    result2 = Integer.toBinaryString(result);
                                    textResult.setText("계산 결과 : " + result2);

                                } else if (ResDec.isChecked()) {
                                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                                    textResult.setText("계산 결과 : " + result.toString());

                                } else {
                                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                                    result16 = Integer.toHexString(result);
                                    textResult.setText("계산 결과 : " + result16);
                                }
                            }
                        }
                        else
                        {
                            if (num1.equals("") || num2.equals("")) {

                                Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                        , Toast.LENGTH_SHORT).show();
                                textResult.setText("계산 결과 : ");

                            } else {
                                if (num1.equals("") || num2.equals("")) {

                                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                            , Toast.LENGTH_SHORT).show();
                                    textResult.setText("계산 결과 : ");

                                } else {
                                    if (ResBin.isChecked()) {

                                        result = Integer.parseInt(num1, 16) / Integer.parseInt(num2, 16);
                                        result2 = Integer.toBinaryString(result);
                                        textResult.setText("계산 결과 : " + result2);

                                    } else if (ResDec.isChecked()) {
                                        result = Integer.parseInt(num1, 16) / Integer.parseInt(num2, 16);
                                        textResult.setText("계산 결과 : " + result.toString());

                                    } else {
                                        result = Integer.parseInt(num1, 16) / Integer.parseInt(num2, 16);
                                        result16 = Integer.toHexString(result);
                                        textResult.setText("계산 결과 : " + result16);
                                    }
                                }
                            }
                        }

                    }

                }
            });
            btnrem.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {

                        Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다."
                                , Toast.LENGTH_SHORT).show();
                        textResult.setText("계산 결과 : ");
                    } else if ((ResBin.isChecked()) || (ResHex.isChecked())) {
                        Toast.makeText(getApplicationContext(), "불가능한 연산입니다."
                                , Toast.LENGTH_SHORT).show();
                    } else {
                        result = Integer.parseInt(num1) % Integer.parseInt(num2);
                        textResult.setText("나머지 값 계산 결과 :" + result.toString());

                    }

                }
            });


        }

    }


