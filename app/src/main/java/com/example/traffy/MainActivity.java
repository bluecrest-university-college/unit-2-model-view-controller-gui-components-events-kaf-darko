package com.example.traffy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button runButton;
    private TextView readme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runButton = (Button) findViewById(R.id.runButton);
        p
        readme = (TextView) findViewById(R.id.readme);

    }
}
