package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView hello_world_text;
    Button blue_button;
    Button red_button;
    Button yellow_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello_world_text = (TextView) findViewById(R.id.hello_world_text);
        blue_button = (Button) findViewById(R.id.blue_button);
        red_button = (Button) findViewById(R.id.red_button);
        yellow_button = (Button) findViewById(R.id.yellow_button);
    }
    public void onBlueClick(View view) {
        hello_world_text.setTextColor(-16776961);
    }
    public void onRedClick(View view) {
        hello_world_text.setTextColor(-65536);
    }
    public void onYellowClick(View view) {
        hello_world_text.setTextColor(-256);
    }
}