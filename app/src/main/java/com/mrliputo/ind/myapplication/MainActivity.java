package com.mrliputo.ind.myapplication;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button intent1 = (Button) findViewById(R.id.cobainten1);
        Button intent2 = (Button) findViewById(R.id.sendmsgextra);
        Button intent3 = (Button) findViewById(R.id.sendmsgbundle);
        Button intent4 = (Button) findViewById(R.id.goURL);
        final EditText input1 = (EditText) findViewById(R.id.input1);
        final EditText input2 = (EditText) findViewById(R.id.inputbundle1);
        final EditText input3 = (EditText) findViewById(R.id.inputbundle2);
        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent goTo = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(goTo);

            }
        });
        intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getinput = input1.getText().toString();
                Intent IntentSent = new Intent (MainActivity.this, Main2Activity.class);
                IntentSent.putExtra("input1", getinput);
                startActivity(IntentSent);
            }
        });

        intent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle allinput = new Bundle();
                String getinput1 = input2.getText().toString();
                String getinput2 = input3.getText().toString();
                Intent IntentSent = new Intent (MainActivity.this, Main2Activity.class);
                allinput.putString("inputbundle1", getinput1);
                allinput.putString("inputbundle2", getinput2);
                IntentSent.putExtras(allinput);
                startActivity(IntentSent);
            }
        });
        intent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimplisit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://duniaprogrammers.com"));
                startActivity(intentimplisit);
            }
        });
    }
}
