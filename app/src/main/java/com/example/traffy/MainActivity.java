package com.example.traffy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button runButton;
    private TextView trafic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trafic = findViewById(R.id.traffic);
        runButton = findViewById(R.id.runButton);


        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(trafic.getText().toString() == "Red"){
                    trafic.setText("Yellow");
                    trafic.setTextColor(getResources().getColor(R.color.Yellow));
                }else if(trafic.getText().toString() == "Yellow"){

                    trafic.setText("Green");
                    trafic.setTextColor(getResources().getColor(R.color.Green));

                }else{

                    trafic.setText("Red");
                    trafic.setTextColor(getResources().getColor(R.color.Red));
                }
            }
        });
    }

}