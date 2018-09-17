package com.example.shaik.helloworld;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b=(Button)findViewById(R.id.clickme);

        b.setText("Don't CLick me");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handleme();

                Toast.makeText(MainActivity.this,"Why did you click on me ? :/",Toast.LENGTH_SHORT).show();
            }
        });



    }

    public void handleme()
    {   Intent i = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
    }


}
