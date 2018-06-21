package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity48 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_48);
        count=getIntent().getExtras().getInt("passing");
        final android.widget.Button btn = (android.widget.Button) findViewById(R.id.button119);
        btn.setOnClickListener(new android.view.View.OnClickListener()

        {

            @Override
            public void onClick(android.view.View vv) {
                EditText txt = (EditText) findViewById(R.id.editText44);
                String name = txt.getText().toString();
                boolean bl = name.equals("Rajasthan");
                if (bl) {
                    Toast.makeText(Activity48.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;
                } else
                    Toast.makeText(Activity48.this, "wrong!",
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
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity49.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }
    public void onclick7(View vv){
        Intent intent=new android.content.Intent(this, com.ce17b023.quizdo.Activity54.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }
}
