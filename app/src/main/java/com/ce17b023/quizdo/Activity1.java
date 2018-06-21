package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ce17b023.quizdo.MainActivity;
import com.ce17b023.quizdo.R;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

    }
    @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }

    public void onclick3(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity2.class);
        startActivity(intent);
    }
    public void onclick4(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity13.class);
        startActivity(intent);
    }
    public void onclick5(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity25.class);
        startActivity(intent);
    }
    public void onclick6(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity37.class);
        startActivity(intent);
    }
    public void onclick7(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.ACtivity42.class);
        startActivity(intent);
    }
    public void onclick8(View v){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity55.class);
        startActivity(intent);
    }
}
