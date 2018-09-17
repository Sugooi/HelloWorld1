package com.example.shaik.helloworld;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String var;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //This are the objects
        Button b=(Button)findViewById(R.id.submit);
         editText=(EditText)findViewById(R.id.myedittext);
        //what to do with the objects





        b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               var= editText.getText().toString();


               Toast.makeText(SecondActivity.this,"Thanks for clicking on me "+ var +" !",Toast.LENGTH_SHORT).show();
           }
       });


    }

}
