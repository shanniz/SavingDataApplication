package com.example.shan.savingdataapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PreferenceActivity extends AppCompatActivity {

    EditText mEditTextUname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        mEditTextUname = findViewById(R.id.editTextUName);
    }

    public void onShowPreferences(View view) {
        SharedPreferences sharedPreferences =
                this.getPreferences(MODE_PRIVATE);
        String uname =  sharedPreferences.getString("uname", "admin");
        Toast.makeText(this, uname, Toast.LENGTH_LONG).show();
    }

    public void onSavePreferences(View view) {
        SharedPreferences sharedPreferences =
                getApplicationContext().getSharedPreferences("Credentials",
                        MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("uname", mEditTextUname.getText().toString());
        editor.commit();
    }

    public void openActivity(View view) {
        Intent intent
                = new Intent(PreferenceActivity.this,
                TestActivity.class);
        startActivity(intent);

    }
}
