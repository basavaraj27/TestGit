package com.example.basu.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Basu",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"ravi",Toast.LENGTH_SHORT).show();
    }
}
