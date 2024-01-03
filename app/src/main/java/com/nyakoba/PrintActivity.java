package com.nyakoba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * Created by Administrator on 2017/8/17.
 */

public class PrintActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main_print);

    }


    public void withdraw(View view){
        Intent intent = new Intent(getApplicationContext(), WithDrawActivity.class);
        startActivity(intent);

    }



}