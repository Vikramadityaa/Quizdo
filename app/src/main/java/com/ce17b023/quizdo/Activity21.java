package com.ce17b023.quizdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Activity21 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
        count=getIntent().getExtras().getInt("passing");
        final android.widget.Button btn = (android.widget.Button) findViewById(R.id.button50);
        btn.setOnClickListener(new android.view.View.OnClickListener()

        {

            @Override
            public void onClick(View vv) {
                EditText txt = (EditText) findViewById(R.id.editText20);
                String name = txt.getText().toString();
                boolean bl = name.equals("Sahara Desert");
                if (bl) {
                    Toast.makeText(Activity21.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;
                } else
                    Toast.makeText(Activity21.this, "wrong!",
                            Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }


    public void onclick6(View vv){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity22.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }
    public void onclick7(View vv){
        Intent intent=new android.content.Intent(this, com.ce17b023.quizdo.Activity24.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }

}


