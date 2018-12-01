package com.example.nh.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtoylistTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoylistTextView=  findViewById(R.id.textView2);
        String[] ToyNames =ToyBox.getToyNames();
        for (String ToyName : ToyNames){
            mtoylistTextView.append(ToyName+"\n\n\n");
        }
    }
}
