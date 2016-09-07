package com.sjq.customtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doClick(View view){
        ToastHelper.makeText(this,"Show  Custom  Toast",ToastHelper.LENGTH_LONG).setAnimation(R.style.PopToast).show();
    }

}
