package com.ce17b023.quizdo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
       // final EditText txtname = (EditText) findViewById(R.id.editText6);
        //String name2 = txtname.getText().toString();
        //final boolean bl=name2.equals("Michael Phelps");
        count= getIntent().getExtras().getInt("passing2");;

        final Button btn = (Button) findViewById(R.id.button2);
         btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText txtname = (EditText) findViewById(R.id.editText6);
                String name2 = txtname.getText().toString();
                boolean bl=name2.equals("Michael Phelps");
                if (bl){
                    Toast.makeText(Activity3.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;}

                else
                    Toast.makeText(Activity3.this, "wrong!",
                            Toast.LENGTH_LONG).show();
            }
        });


    }
    @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }

    public void onclick5(View vv){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity4.class);
        intent.putExtra("passing2",count);
        startActivity(intent);
    }
}


