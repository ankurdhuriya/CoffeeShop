package com.epizy.ankurdhuriya.coffeeshop;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(getIntent().hasExtra("com.epizy.ankurdhuriya.coffeeshop.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.txt_view_result);
            String text = getIntent().getExtras().getString("com.epizy.ankurdhuriya.coffeeshop.SOMETHING");
            tv.setText(text);
        }

    }
}
