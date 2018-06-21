package com.ce17b023.quizdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity24 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);
        count=getIntent().getExtras().getInt("passing");
        String str=String.valueOf(count);
        android.widget.TextView mytxt=(android.widget.TextView) findViewById(R.id.textView24);
        mytxt.setText(str);
    } @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }
    public void onclick6(android.view.View vv){
        android.content.Intent intent=new android.content.Intent(this, com.ce17b023.quizdo.Activity1.class);
        startActivity(intent);
    }
}


