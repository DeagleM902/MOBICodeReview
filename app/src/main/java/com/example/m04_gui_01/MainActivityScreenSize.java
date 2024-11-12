package com.example.m04_gui_01;

import android.content.Context;
import android.content.res.Configuration;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivityScreenSize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_screen_size);

        // Action when "Add" button is pressed
        ImageButton addButton = (ImageButton) findViewById(R.id.b_Add);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator ADD BUTTON", "User tapped the Add button");

                Double d1 = 0.0;
                Double d2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.userInput1);
                EditText textN2 = (EditText) findViewById(R.id.userInput2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.answerField);

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
            }
        });

        // Action when "Subtract" button is pressed
        ImageButton subtractButton = (ImageButton) findViewById(R.id.b_Subtract);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Subtract button");

                Double d1 = 0.0;
                Double d2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.userInput1);
                EditText textN2 = (EditText) findViewById(R.id.userInput2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.answerField);

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
            }
        });

        // Action when "Multiply" button is pressed
        ImageButton multiplyButton = (ImageButton) findViewById(R.id.b_Multiply);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator MULTIPLY BUTTON", "User tapped the Multiply button");

                Double d1 = 0.0;
                Double d2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.userInput1);
                EditText textN2 = (EditText) findViewById(R.id.userInput2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.answerField);

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
            }
        });

        // Action when "Divide" button is pressed
        ImageButton divideButton = (ImageButton) findViewById(R.id.b_Divide);
        divideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator DIVIDE BUTTON", "User tapped the Divide button");

                Double d1 = 0.0;
                Double d2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.userInput1);
                EditText textN2 = (EditText) findViewById(R.id.userInput2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.answerField);

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
            }
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


    public void getMyVersion(View view) {

        // Get version data
        String versionNum = Integer.toString(Build.VERSION.SDK_INT);
        Boolean afterKitKat = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT);

        // Put it on the screen
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(" Version Number is " + versionNum);
        t.append("\n afterKitKat = " + afterKitKat.toString());
        t.append("\n Build.VERSION.RELEASE = " + Build.VERSION.RELEASE);
        t.append("\n Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL);

        // dump build and display metrics
        t.append("\n Build.DISPLAY = " + Build.DISPLAY.toString());
        t.append("\n Screen Size = " + getSizeName(view.getContext()));
        t.append("\n getDisplayMetrics().densityDpi = " + getResources().getDisplayMetrics().densityDpi);
        t.append("\n getDisplayMetrics().density = " + getResources().getDisplayMetrics().density);
        t.append("\n getDisplayMetrics().xdpi = " + getResources().getDisplayMetrics().xdpi);
        t.append("\n getDisplayMetrics().ydpi = " + getResources().getDisplayMetrics().ydpi);
        t.append("\n getDisplayMetrics().heightPixels = " + getResources().getDisplayMetrics().heightPixels);
        t.append("\n getDisplayMetrics().widthPixels = " + getResources().getDisplayMetrics().widthPixels);

        // show what the masks look like for layout size
        t.append("\n\n screenLayout (HEX) = " + (Integer.toHexString(view.getContext().getResources().getConfiguration().screenLayout)));
        t.append("\n SCREENLAYOUT_SIZE_MASK (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_MASK)));
        t.append("\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
        t.append("\n SCREENLAYOUT_SIZE_SMALL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_SMALL)));
        t.append("\n SCREENLAYOUT_SIZE_NORMAL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_NORMAL)));
        t.append("\n SCREENLAYOUT_SIZE_LARGE (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_LARGE)));

        // Get the layout and mask with size
        int screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
        t.append("\n screenLayout & size mask (HEX) = " + (Integer.toHexString((screenLayout))));

        // Get the layout (again) and mask with long bit of layout
        t.append("\n\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
        t.append("\n SCREENLAYOUT_LONG_NO  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_NO)));
        t.append("\n SCREENLAYOUT_LONG_UNDEFINED   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_UNDEFINED)));
        t.append("\n  SCREENLAYOUT_LONG_YES   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_YES)));

        // Now get the layout (again) and mask with size
        screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_LONG_MASK;
        t.append("\n screenLayout & long mask (HEX) = " + (Integer.toHexString((screenLayout))));

    }


    // Use bitmasks to determine screen size
    private static String getSizeName(Context context) {
        int screenLayout = context.getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (screenLayout) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                Log.w("SCREEN SIZE", "SMALL");
                return "small";
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                Log.w("SCREEN SIZE", "NORMAL");
                return "normal";
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                Log.w("SCREEN SIZE", "LARGE");
                return "large";
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                Log.w("SCREEN SIZE", "XLARGE");
                return "xlarge";
            default:
                return "undefined";
        }
    }


}
