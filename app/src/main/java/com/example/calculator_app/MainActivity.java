/*
 * *************************************************************************************
 * Matthew Deagle, 2024.
 * *************************************************************************************
 */

/*
 * *************************************************************************************
 * Matthew Deagle, 2024.
 * *************************************************************************************
 */

package com.example.calculator_app;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.m04_gui_01.R;

public class MainActivity extends AppCompatActivity {

    private EditText textNum1, textNum2, textAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        textNum1 = findViewById(R.id.userInput1);
        textNum2 = findViewById(R.id.userInput2);
        textAns = findViewById(R.id.answerField);

        setupListeners();
    }

    private void setupListeners() {
        findViewById(R.id.b_Add).setOnClickListener(view -> calculate("add"));
        findViewById(R.id.b_Subtract).setOnClickListener(view -> calculate("subtract"));
        findViewById(R.id.b_Multiply).setOnClickListener(view -> calculate("multiply"));
        findViewById(R.id.b_Divide).setOnClickListener(view -> calculate("divide"));
    }

    //This could be modified to use enum for a more complex calculator.
    private void calculate(String operation){
        double answer = 0;
        try {
            double num1 = Double.parseDouble(textNum1.getText().toString());
            double num2 = Double.parseDouble(textNum2.getText().toString());

            //Operations
            switch (operation) {
                case "add":
                    answer = num1 + num2;
                    Log.d("Calculator", "Add selected => " + num1 + " + " + num2);
                    break;
                case "subtract":
                    answer = num1 - num2;
                    Log.d("Calculator", "Subtract selected => " + num1 + " - " + num2);
                    break;
                case "multiply":
                    answer = num1 * num2;
                    Log.d("Calculator", "Multiply selected => " + num1 + " * " + num2);
                    break;
                case "divide":
                    if (num2 == 0) {
                        Log.e("Calculator", "Attempted to divide by zero");
                        textAns.setText(getString(R.string.error_divide_by_zero));
                        return;
                    }
                    answer = num1 / num2;
                    Log.d("Calculator", "Divide selected => " + num1 + " / " + num2);
                    break;
            }
            textAns.setText(String.valueOf(answer));
        } catch (NumberFormatException e) {
            textAns.setText(getString(R.string.error_invalid_input));
            Log.e("Calculator", "Invalid input"); //Fields are set to numbers only, this error should be impossible
        }
    }
}
