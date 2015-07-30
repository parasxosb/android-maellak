package com.example.paraschos.android20150728;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class Result extends Activity {

    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Result = (TextView) findViewById(R.id.ResultTxt);
        Result.setText(String.valueOf(getIntent().getExtras().getInt("Result")));
    }

    }
