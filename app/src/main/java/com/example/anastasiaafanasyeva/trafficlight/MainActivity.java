package com.example.anastasiaafanasyeva.trafficlight;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstaintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstaintLayout = (ConstraintLayout)findViewById(R.id.constraint);
        mInfoTextView = (TextView)findViewById(R.id.textView);
    }

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
    }
}
