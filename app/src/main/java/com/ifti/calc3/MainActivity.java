package com.ifti.calc3;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView entry, resultfld, counterFld;

    private Button deleteBtn, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnDiv, btnPlus, btnMin, btnMul, btnEq, acBtn, prevBtn, nextBtn, logBtn, sinBtn, tanBtn, cosBtn, bracOpenBtn, bracCloseBtn, sqRtBtn, percentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry = findViewById(R.id.entry);
        resultfld = findViewById(R.id.resultfld);
        counterFld = findViewById(R.id.counterFld);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);

        btnPlus = findViewById(R.id.btnPlus);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        sinBtn = findViewById(R.id.sinBtn);
        cosBtn = findViewById(R.id.cosBtn);
        tanBtn = findViewById(R.id.tanBtn);
        logBtn = findViewById(R.id.logBtn);
        percentBtn = findViewById(R.id.percentBtn);
        sqRtBtn = findViewById(R.id.sqRtBtn);
        bracOpenBtn = findViewById(R.id.bracOpenBtn);
        bracCloseBtn = findViewById(R.id.bracCloseBtn);

        btnEq = findViewById(R.id.btnEq);
        deleteBtn = findViewById(R.id.deleteBtn);
        acBtn = findViewById(R.id.acBtn);
        prevBtn = findViewById(R.id.prevBtn);
        nextBtn = findViewById(R.id.nextBtn);

        SharedPreferences sharedPreferences = getSharedPreferences("history", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (sharedPreferences.contains("histCount")) {
            int tempC = sharedPreferences.getInt("histCount", 0);
            editor.putInt("currentHistCount", tempC);
            editor.apply();
        } else {
            editor.putInt("currentHistCount", 0);
            editor.apply();
        }


//  For button 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                System.out.println(text.getClass());
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 1;
                entry.setText(text);
            }
        });
//  For button 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 2;
                entry.setText(text);
            }
        });

//  For button 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 3;
                entry.setText(text);
            }
        });

//  For button 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 4;
                entry.setText(text);
            }
        });
//  For button 5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 5;
                entry.setText(text);
            }
        });
//  For button 6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 6;
                entry.setText(text);
            }
        });
//  For button 7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 7;
                entry.setText(text);
            }
        });

//  For button 8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 8;
                entry.setText(text);
            }
        });

//  For button 9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 9;
                entry.setText(text);
            }
        });

//  For button 0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + 0;
                entry.setText(text);
            }
        });

//  For button dot
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "0";
                }
                text = text + ".";
                entry.setText(text);
            }
        });


//  For Button plus
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "+";
                entry.setText(text);
            }
        });

//  For button minus
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "-";
                entry.setText(text);
            }
        });

//  For Button division
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                    Toast.makeText(getApplicationContext(), "Enter A Number First", Toast.LENGTH_SHORT).show();
                    return;
                }
                text = text + "÷";
                entry.setText(text);
            }
        });

//  For button multiply
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                    Toast.makeText(getApplicationContext(), "Enter A Number First", Toast.LENGTH_SHORT).show();
                    return;
                }
                text = text + "×";
                entry.setText(text);
            }
        });

        //  For button sin
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "sin(";
                entry.setText(text);
            }
        });

        //  For button cos
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "cos(";
                entry.setText(text);
            }
        });

        //  For button tan
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "tan(";
                entry.setText(text);
            }
        });

        //  For button log
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "log(";
                entry.setText(text);
            }
        });

        //  For button sqrt
        sqRtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (!text.isEmpty()) {
                    text = text + "×";
                }
                text = text + "√(";
                entry.setText(text);
            }
        });

        //  For button percent
        percentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                    Toast.makeText(getApplicationContext(), "Enter A Number First", Toast.LENGTH_SHORT).show();
                    return;
                }
                text = text + "%";
                entry.setText(text);
            }
        });

        //  For button open
        bracOpenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();

                if (text.isEmpty()) {
                    text = "";
                }
                text = text + "(";
                entry.setText(text);
            }
        });

        //  For button close
        bracCloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                    Toast.makeText(getApplicationContext(), "Enter The Opening Bracket First", Toast.LENGTH_SHORT).show();
                    return;
                }
                text = text + ")";
                entry.setText(text);
            }
        });

//  For Button Delete
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = entry.getText().toString();
                if (text.isEmpty()) {
                    text = "";
                    return;
                }

                text = text.substring(0, text.length() - 1);

                if (text.isEmpty()) {
                    resultfld.setText(text);
                }

                entry.setText(text);
            }
        });

        //  For Button AC
        acBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entry.setText("");
                resultfld.setText("");
                counterFld.setText("");
            }
        });

//  For button equal
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Not Implemented Yet", Toast.LENGTH_SHORT).show();
                try {
                    String equation = entry.getText().toString();
                    String equationSave = equation;
                    int count = 0;

                    if (equation.isEmpty()) {
                        equation = "";
                        Toast.makeText(getApplicationContext(), "Nothing To Calculate", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (isDividedByZero(equation)) {
                        Toast.makeText(getApplicationContext(), "Cannot Divide By 0", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (equation.endsWith("+") || equation.endsWith("-") || equation.endsWith("×") || equation.endsWith("÷")) {
                        Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (isBracketNotClosed(equation) < 0) {
                        Toast.makeText(getApplicationContext(), "Please Remove The Extra Closing Bracket ')'", Toast.LENGTH_SHORT).show();
                        return;
                    } else if (isBracketNotClosed(equation) > 0) {
                        Toast.makeText(getApplicationContext(), "Please Close The Bracket ')'", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (isBracketEmpty(equation)) {
                        Toast.makeText(getApplicationContext(), "Nothing in The Bracket '()'", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (isExtraOperator(equation)) {
                        return;
                    }

//                    equation = makeMultiplication(equation);
//                    equation = makeMultiplication2(equation);
//
//                    System.out.println(equation);

                    equation = replaceBracket(equation, "sin", "san");
                    equation = replaceBracket(equation, "cos", "cas");
                    equation = replaceBracket(equation, "tan", "ton");


                    equation = equation.replaceAll("×", "*");
                    equation = equation.replaceAll("÷", "/");
                    equation = equation.replaceAll("san", "Math.sin((Math.PI/180)*");
                    equation = equation.replaceAll("cas", "Math.cos((Math.PI/180)*");
                    equation = equation.replaceAll("ton", "Math.tan((Math.PI/180)*");
                    equation = equation.replaceAll("log", "Math.log10");
//                    equation = equation.replaceAll("√", "*√");
                    equation = equation.replaceAll("√", "Math.sqrt");
                    equation = equation.replaceAll("%", "*(1/100)");
                    equation = equation.replaceAll("]", ")");


                    Result rslt = new Result();

                    String finalResult = rslt.getResult(equation);

//                Display result

                    if (finalResult.endsWith(".0")) {
                        finalResult = finalResult.replace(".0", "");
                    }

                    resultfld.setText(finalResult);
                    counterFld.setText("");

//                    Save to history
                    if (sharedPreferences.contains("histCount")) {
                        count = sharedPreferences.getInt("histCount", 0);
                    }

                    count++;

                    if (count > 10) {
                        count = 10;

//                        copy and shift to left previous results if 10 histories are there
                        for (int i = 1; i < 10; i++) {
                            String histEq = "eq" + i;
                            String histRes = "res" + i;

                            int j = i + 1;

                            String histEqNext = "eq" + j;
                            String histResNext = "res" + j;

                            String histEqNextValue = sharedPreferences.getString(histEqNext, "Not Found!");
                            String histResNextValue = sharedPreferences.getString(histResNext, "Not Found!");

                            editor.putString(histEq, histEqNextValue);
                            editor.putString(histRes, histResNextValue);

                            editor.apply();
                        }

//                        Save the new results
                        String histEq3 = "eq" + 10;
                        String histRes3 = "res" + 10;
//                          changed from equation to eqationSave
                        editor.putString(histEq3, equationSave);
                        editor.putString(histRes3, finalResult);
                        editor.putInt("histCount", count);
                        editor.putInt("currentHistCount", count);
                        editor.apply();

                    } else {
//                        For 1-10 No history for the first time
                        String histEq2 = "eq" + count;
                        String histRes2 = "res" + count;
//                          changed from equation to eqationSave
                        editor.putString(histEq2, equationSave);
                        editor.putString(histRes2, finalResult);

                        editor.putInt("histCount", count);
                        editor.putInt("currentHistCount", count);
                        editor.apply();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Invalid Expression", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //  For Button prev
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hCount = sharedPreferences.getInt("currentHistCount", 0);
                int countH = sharedPreferences.getInt("histCount", 0);

                String text1 = entry.getText().toString();
                String text2 = resultfld.getText().toString();

//                If there the screen is empty then set the current history position counter to 1 more than the total history
                if (text1.isEmpty() || text2.isEmpty()) {
                    hCount = countH + 1;
                }

                if (countH > 0) {
                    if (hCount > 0) {
                        int c = hCount;
                        c--;

                        if (c > 0) {
                            String histEq = "eq" + c;
                            String histRes = "res" + c;

                            String histEqValue = sharedPreferences.getString(histEq, "Not Found!");
                            String histResValue = sharedPreferences.getString(histRes, "Not Found!");


                            entry.setText(histEqValue);
                            resultfld.setText(histResValue);
                            counterFld.setText(String.valueOf(c));

                            editor.putInt("currentHistCount", c);
                            editor.apply();
                        } else {
                            Toast.makeText(getApplicationContext(), "No More History Found", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "No History Found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "No History Found", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        Same as explained in the prev button section
        //  For Button next
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hCount = sharedPreferences.getInt("currentHistCount", 0);
                int countH = sharedPreferences.getInt("histCount", 0);

                String text1 = entry.getText().toString();
                String text2 = resultfld.getText().toString();

//                If there the screen is empty then set the current history position counter to 1 more than the total history
                if (text1.isEmpty() || text2.isEmpty()) {
                    hCount = countH + 1;
                }

                if (countH > 0 && countH <= 10) {
                    if (hCount > 0 && hCount < countH) {
                        hCount++;

                        String histEq = "eq" + hCount;
                        String histRes = "res" + hCount;

                        String histEqValue = sharedPreferences.getString(histEq, "Not Found!");
                        String histResValue = sharedPreferences.getString(histRes, "Not Found!");

                        histEqValue = histEqValue.replaceAll("\\*", "×");
                        histEqValue = histEqValue.replaceAll("/", "÷");

                        entry.setText(histEqValue);
                        resultfld.setText(histResValue);
                        counterFld.setText(String.valueOf(hCount));

                        editor.putInt("currentHistCount", hCount);
                        editor.apply();
                    } else {
                        Toast.makeText(getApplicationContext(), "Last History", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "No More History Found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private static String replaceBracket(String equation, String org, String fak) {
        int index = -1;

        while (equation.contains(org)) {
            index = equation.indexOf(org) + 4;
            equation = equation.replaceFirst(org, fak);
            for (int i = index; i < equation.length(); i++) {
                char c = equation.charAt(i);
                if (c == ')') {
                    StringBuilder builder = new StringBuilder(equation);
                    builder.insert(i + 1, ']');
                    equation = builder.toString();
                    break;
                }
            }
        }

        return equation;
    }

    private int isBracketNotClosed(String equation) {
        int count = 0;

        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == '(') {
                count++;
            }

            if (c == ')') {
                count--;
            }
        }

        return count;
    }

    private Boolean isBracketEmpty(String equation) {
        int count = 0;
        for (int i = 0; i < equation.length(); i++) {
            char c = 'a';
            char d = 'b';

            if (i + 1 < equation.length()) {
                c = equation.charAt(i);
                d = equation.charAt(i + 1);
            }

            if (c == '(' && d == ')') {
                count = 1;
            }
        }

        return count == 1;
    }


    private Boolean isExtraOperator(String equation) {
        int count = 0;
        for (int i = 0; i < equation.length(); i++) {
            char c = 'a';
            char d = 'b';

            if (i + 1 < equation.length()) {
                c = equation.charAt(i);
                d = equation.charAt(i + 1);
            }

            if (c == '+' && d == ')') {
                count = 1;
                Toast.makeText(getApplicationContext(), "Remove The Extra '+' Before ')'", Toast.LENGTH_SHORT).show();
            }
            if (c == '-' && d == ')') {
                count = 1;
                Toast.makeText(getApplicationContext(), "Remove The Extra '-' Before ')'", Toast.LENGTH_SHORT).show();
            }
            if (c == '×' && d == ')') {
                count = 1;
                Toast.makeText(getApplicationContext(), "Remove The Extra '×' Before ')'", Toast.LENGTH_SHORT).show();
            }
            if (c == '÷' && d == ')') {
                count = 1;
                Toast.makeText(getApplicationContext(), "Remove The Extra '÷' Before ')'", Toast.LENGTH_SHORT).show();
            }
            if (c == '%' && d == ')') {
                count = 1;
                Toast.makeText(getApplicationContext(), "Remove The Extra '%' Before ')'", Toast.LENGTH_SHORT).show();
            }
        }

        return count == 1;
    }

    private Boolean isDividedByZero(String equation) {
        int count = 0;
        for (int i = 0; i < equation.length(); i++) {
            char c = 'a';
            char d = 'b';

            if (i + 1 < equation.length()) {
                c = equation.charAt(i);
                d = equation.charAt(i + 1);
            }

            if (c == '÷' && d == '0') {
                count = 1;
            }
        }

        return count == 1;
    }

    private String makeMultiplication(String equation) {
        for (int i = 0; i < equation.length(); i++) {
            char c = 'a';
            char d = 'b';

            if (i + 1 < equation.length()) {
                c = equation.charAt(i);
                d = equation.charAt(i + 1);

                if (c == ')' && d != '+' && d != '-' && d != '÷' && d != '×' && d != '%' && d != ')') {
                    StringBuilder builder = new StringBuilder(equation);
                    builder.insert(i + 1, '*');
                    equation = builder.toString();
                }
            }
        }

        return equation;
    }

    private String makeMultiplication2(String equation) {
        for (int i = equation.length(); i >= 0; i--) {
            char c = 'a';
            char d = 'b';

            if (i - 1 > 0) {
                c = equation.charAt(i);
                d = equation.charAt(i - 1);

                System.out.println("From func 0: " + equation);
                System.out.println("From func 0 c, d: " + c + ", " + d);
                if (c == '(') {
                    System.out.println("From func 1: " + equation);
                    System.out.println("From func 1 c, d: " + c + ", " + d);
                    if (d != '+' && d != '-' && d != '÷' && d != '×' && d != '(' && d != 'n' && d != 's' && d != 'g') {
                        StringBuilder builder = new StringBuilder(equation);
                        builder.insert(i - 1, '*');
                        equation = builder.toString();
                        System.out.println("From func 2: " + equation);
                        System.out.println("From func 2 c, d: " + c + ", " + d);
                    }
                }
            }
        }

        System.out.println("From func 3: " + equation);
//        System.out.println("From func 0 c, d: " + c + ", " + d);
        return equation;
    }
}