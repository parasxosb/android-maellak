package com.example.paraschos.android20150728;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Calculate extends Activity implements View.OnClickListener {

    Button BtnMulti;
    Button BtnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        BtnAdd = (Button) findViewById(R.id.button2);
        BtnMulti = (Button) findViewById(R.id.button3);
        BtnAdd.setOnClickListener(this);

    }

    public void onClick (View v){
        Intent MyIntent2 = new Intent(this, Result.class);

        if (v == BtnAdd) {
            MyIntent2.putExtra("Result", getIntent().getExtras().getInt("FirstNo") +  getIntent().getExtras().getInt("SecondNo"));
            startActivity(MyIntent2);
        }else
        {
            MyIntent2.putExtra("Result", getIntent().getExtras().getInt("FirstNo") *  getIntent().getExtras().getInt("SecondNo"));
            startActivity(MyIntent2);
        }
    }
}
