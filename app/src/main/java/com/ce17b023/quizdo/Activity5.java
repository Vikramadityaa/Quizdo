package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5);
        count=getIntent().getExtras().getInt("passing3");

        final Button btn = (Button) findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText txt=(EditText)findViewById(R.id.editText11);
                EditText txt2=(EditText)findViewById(R.id.editText7);
                String name=txt.getText().toString();
                String name2=txt2.getText().toString();
                boolean bl=((name.equals("Rafael Nadal") && name2.equals("Andre Agassi")) || (name.equals("Andre Agassi"))
                && (name2.equals("Rafael Nadal")));
                if (bl){
                    Toast.makeText(Activity5.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;
                }
                else
                    Toast.makeText(Activity5.this, "wrong!",
                            Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }

    public void onclick7(View vv){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity6.class);
        intent.putExtra("passing4",count);
        startActivity(intent);
    }
}


