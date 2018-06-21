package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        final EditText txtname = (EditText) findViewById(R.id.editText4);
        final String name2 = txtname.getText().toString();


        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText txtname = (EditText) findViewById(R.id.editText4);
                String name2 = txtname.getText().toString();
                boolean bl = name2.equals("Karnam Malleswari");
                if (bl) {
                    Toast.makeText(Activity2.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    count++;

                } else
                    Toast.makeText(Activity2.this, "wrong!",
                            Toast.LENGTH_LONG).show();
            }

        });
    }
        @Override
        public void onBackPressed ()
        {
            // Your Code Here. Leave empty if you want nothing to happen on back press.
        }

        public void onclick4 (View vv){
            Intent intent = new Intent(this, com.ce17b023.quizdo.Activity3.class);
            intent.putExtra("passing", count);
            startActivity(intent);
        }
        public void onclick5 (View vv){
            Intent intent = new Intent(this, com.ce17b023.quizdo.Activity12.class);
            intent.putExtra("passing", count);
            startActivity(intent);
        }
    }


