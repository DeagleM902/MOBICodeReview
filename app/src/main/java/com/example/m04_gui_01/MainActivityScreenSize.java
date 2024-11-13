package com.example.m04_gui_01;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityScreenSize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_screen_size);

        // Action when "Add" button is pressed
        ImageButton addButton = findViewById(R.id.b_Add);
        addButton.setOnClickListener(v -> {
            Log.d("M01_Calculator ADD BUTTON", "User tapped the Add button");

            Double d1 = 0.0;
            Double d2 = 0.0;
            Double answer = 0.0;

            EditText textN1 = findViewById(R.id.userInput1);
            EditText textN2 = findViewById(R.id.userInput2);
            //Initialize, value not needed
            EditText textANS = findViewById(R.id.answerField);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 + d2;
            } catch (Exception e) {
                Log.w("M01_Calculator ADD BUTTON", "Add Selected with no inputs ... " + answer);
            }

            // Set the Answer into the the answer field
            textANS.setText(answer.toString());

            // log what we are doing
            Log.w("M01_Calculator ADD BUTTON", "Add Selected with => " + d1 + " + " + d2 + "=" + answer);
        });

        // Action when "Subtract" button is pressed
        ImageButton subtractButton = findViewById(R.id.b_Subtract);
        subtractButton.setOnClickListener(v -> {
            Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Subtract button");

            Double d1 = 0.0;
            Double d2 = 0.0;
            Double answer = 0.0;

            EditText textN1 = findViewById(R.id.userInput1);
            EditText textN2 = findViewById(R.id.userInput2);
            //Initialize, value not needed
            EditText textANS = findViewById(R.id.answerField);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 - d2;
            } catch (Exception e) {
                Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with no inputs ... " + answer);
            }

            // Set the Answer into the the answer field
            textANS.setText(answer.toString());

            // log what we are doing
            Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with => " + d1 + " - " + d2 + "=" + answer);
        });

        // Action when "Multiply" button is pressed
        ImageButton multiplyButton = findViewById(R.id.b_Multiply);
        multiplyButton.setOnClickListener(v -> {
            Log.d("M01_Calculator MULTIPLY BUTTON", "User tapped the Multiply button");

            Double d1 = 0.0;
            Double d2 = 0.0;
            Double answer = 0.0;

            EditText textN1 = findViewById(R.id.userInput1);
            EditText textN2 = findViewById(R.id.userInput2);
            //Initialize, value not needed
            EditText textANS = findViewById(R.id.answerField);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                answer = d1 * d2;
            } catch (Exception e) {
                Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with no inputs ... " + answer);
            }

            // Set the Answer into the the answer field
            textANS.setText(answer.toString());

            // log what we are doing
            Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with => " + d1 + " - " + d2 + "=" + answer);
        });

        // Action when "Divide" button is pressed
        ImageButton divideButton = findViewById(R.id.b_Divide);
        divideButton.setOnClickListener(v -> {
            Log.d("M01_Calculator DIVIDE BUTTON", "User tapped the Divide button");

            Double d1 = 0.0;
            Double d2 = 0.0;
            Double answer = 0.0;

            EditText textN1 = findViewById(R.id.userInput1);
            EditText textN2 = findViewById(R.id.userInput2);
            //Initialize, value not needed
            EditText textANS = findViewById(R.id.answerField);

            try {
                d1 = Double.parseDouble(textN1.getText().toString());
                d2 = Double.parseDouble(textN2.getText().toString());
                if (d2 == 0){
                    Log.w("M01_Calculator DIVIDE BUTTON", "Cannot divide by zero.");
                } else{
                    answer = d1 / d2;
                }
            } catch (Exception e) {
                Log.w("M01_Calculator DIVIDE BUTTON", "Divide Selected with no inputs ... " + answer);
            }

            // Set the Answer into the the answer field
            textANS.setText(answer.toString());

            // log what we are doing
            Log.w("M01_Calculator DIVIDE BUTTON", "Divide Selected with => " + d1 + " - " + d2 + "=" + answer);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_screen_size, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
