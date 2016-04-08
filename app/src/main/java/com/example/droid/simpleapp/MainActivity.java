package com.example.droid.simpleapp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText income, outcome;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnD;
    String evalue, operation,result2;
    TextView tv, title_app;
    Integer value1, value2, result;
    Boolean minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        tv = (TextView) findViewById(R.id.val);
        title_app = (TextView)findViewById(R.id.title_app);
        income = (EditText) findViewById(R.id.income);
        outcome = (EditText) findViewById(R.id.outcome);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnC = (Button) findViewById(R.id.clear);
        btnD = (Button) findViewById(R.id.del);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton Fab = (FloatingActionButton) findViewById(R.id.fab);
        Fab.setImageResource(R.drawable.refresh);

//        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//        inputManager.hideSoftInputFromWindow(income.getWindowToken(),
//        InputMethodManager.RESULT_HIDDEN);

//        income.setOnTouchListener(new View.OnTouchListener() {
//            @Override public boolean onTouch(View v, MotionEvent event) {
//                EditText edittext = (EditText) v;
//                int inType = edittext.getInputType();       // Backup the input type
//                edittext.setInputType(InputType.TYPE_NULL); // Disable standard keyboard
//                edittext.onTouchEvent(event);               // Call native handler
//                edittext.setInputType(inType);              // Restore input type
//                return true; // Consume touch event
//            }
//        });
        income.setInputType(InputType.TYPE_NULL);
        income.setTextIsSelectable(true);
        income.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                evalue = "1";
                return false;
            }
        });
        outcome.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                evalue = "2";
                return false;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "0");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "1");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "2");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "3");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "4");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "5");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "6");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "7");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "8");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText(income.getText() + "9");
                }
                if (evalue == "2") {
                    outcome.setText(outcome.getText() + "9");
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    income.setText("");
                    tv.setText("");
                }
                if (evalue == "2") {
                    outcome.setText("");
                    tv.setText("");
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (evalue == "1") {
                    String newIncome = income.getText().toString();
                if (income.length() > 0) {
                    String incomeDel = newIncome.substring(0, newIncome.length()-1);
                    income.setText(incomeDel);
                    }
                }
                if (evalue == "2") {
                    String newOutcome = outcome.getText().toString();
                    String outcomeDel = newOutcome.substring(0, newOutcome.length()-1);
                    outcome.setText(outcomeDel);
                    }
                }
        });

        Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String vin = income.getText().toString();
//                String vout = outcome.getText().toString();
//                String anta = "income";
                    value1 = Integer.parseInt(income.getText() + "");
                    value2 = Integer.parseInt(outcome.getText() + "");
                if (value1+value2>=0) {
                    result = value2 - value1;
                    tv.setText("" + result);
                    title_app.setText("SUCCEED");
                    Toast.makeText(getApplicationContext(),"Your Balance Is = " +result, Toast.LENGTH_LONG).show();
                }
//              else{
//                    tv.setText("WRONG INPUT");
//                }
                }
            }
        );
    }
            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }
            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();
                //noinspection SimplifiableIfStatement
//                if (id == R.id.action_settings) {
//                    return true;
//                }
                if(id == R.id.exit){
                    finish();
                }
                return super.onOptionsItemSelected(item);
            }
        }


