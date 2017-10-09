package com.example.anastasiaafanasyeva.trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ConstraintLayout mConstaintLayout;
    private TextView mInfoTextView;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstaintLayout = (ConstraintLayout)findViewById(R.id.constraint);
        mInfoTextView = (TextView)findViewById(R.id.textView);
        button1 = (Button)findViewById(R.id.buttonRed);
        button2 = (Button)findViewById(R.id.buttonYellow);
        button3 = (Button)findViewById(R.id.buttonGreen);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
                break;
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow);
                mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
                break;
        }
    }

    /*

    public void onClickR(View view) {
        mInfoTextView.setText(R.string.red);
        mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onClickG(View view) {
        mInfoTextView.setText(R.string.green);
        mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }

    public void onClickY(View view) {
        mInfoTextView.setText(R.string.yellow);
        mConstaintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    } */
}
