package com.example.shan.savingdataapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void onGetUserName(View view) {
        SharedPreferences sharedPreferences =
                getApplicationContext().getSharedPreferences("Credentials",
                        MODE_PRIVATE);
        String uname = sharedPreferences.getString("uname",
                "null");
        Toast.makeText(this,
                uname, Toast.LENGTH_LONG).show();



    }
}
