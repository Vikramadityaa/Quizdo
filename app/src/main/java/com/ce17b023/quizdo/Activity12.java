package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity12 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        count=getIntent().getExtras().getInt("passing10");
        String str=String.valueOf(count);
        TextView mytxt=(TextView) findViewById(R.id.textView10);
        mytxt.setText(str);
    } @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }
    public void onclick6(View vv){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity1.class);
        startActivity(intent);
    }
}
