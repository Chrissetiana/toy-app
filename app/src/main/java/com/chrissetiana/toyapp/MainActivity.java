package com.chrissetiana.toyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toyList = findViewById(R.id.toy_names);
        String[] toyNames = ToyBox.getToyNames();

        for (String toyName : toyNames) {
            toyList.append(toyName + "\n\n\n");
        }
    }
}
