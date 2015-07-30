package com.example.paraschos.android20150728;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText FirstNumber;
    EditText SecondNumber;
    Button Bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstNumber = (EditText) findViewById(R.id.editText);
        SecondNumber = (EditText) findViewById(R.id.editText2);
        Bt1 = (Button) findViewById(R.id.button);
        Bt1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MainActivity.this, Calculate.class);
                Integer FirstNo = Integer.parseInt(FirstNumber.getText().toString().trim());
                Integer SecondNo = Integer.parseInt(SecondNumber.getText().toString().trim());
                MyIntent.putExtra("FirstNo", FirstNo);
                MyIntent.putExtra("SecondNo", SecondNo);
                startActivity(MyIntent);
            }
        });
    }
}
