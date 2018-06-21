package com.ce17b023.quizdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity22 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);
         count=getIntent().getExtras().getInt("passing");
       final android.widget.Button btn = (android.widget.Button) findViewById(R.id.button53);
        btn.setOnClickListener(new android.view.View.OnClickListener()

        {

            @Override
            public void onClick(android.view.View vv) {
                android.widget.EditText txt = (android.widget.EditText) findViewById(R.id.editText21);
                String name = txt.getText().toString();
                boolean bl = name.equals("Sahara Desert");
                if (bl) {
                    android.widget.Toast.makeText(Activity22.this, "correct!",
                            android.widget.Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;
                } else
                    android.widget.Toast.makeText(Activity22.this, "wrong!",
                            android.widget.Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        // Your Code Here. Leave empty if you want nothing to happen on back press.
    }

   /* public void onclick6(android.view.View vv){

        android.content.Intent intent=new android.content.Intent(this, com.ce17b023.quizdo.Activity23.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }*/
    public void onclick7(android.view.View
     vv){
        android.content.Intent intent=new android.content.Intent(this, com.ce17b023.quizdo.Activity24.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }

}


