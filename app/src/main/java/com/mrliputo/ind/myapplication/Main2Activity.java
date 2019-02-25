package com.mrliputo.ind.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String getFirstName = extras.getString("input1");
        String getinputbundle1 = extras.getString("inputbundle1");
        String getinputbundle2 = extras.getString("inputbundle2");
        TextView textView1 = (TextView) findViewById(R.id.getString1);
        TextView textView2 = (TextView) findViewById(R.id.getStringbundle1);
        TextView textView3 = (TextView) findViewById(R.id.getStringbundle2);
        textView1.setText(getFirstName);
        textView2.setText(getinputbundle1);
        textView3.setText(getinputbundle2);
        Button intentback = (Button) findViewById(R.id.Back);

        intentback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTo = new Intent(Main2Activity.this, MainActivity.class);

                startActivity(goTo);

            }
        });

    }
}
