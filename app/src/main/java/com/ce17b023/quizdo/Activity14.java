package com.ce17b023.quizdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity14 extends AppCompatActivity {
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);
        count=getIntent().getExtras().getInt("passing");
        final Button btn = (Button) findViewById(R.id.button29);
        btn.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View vv) {
                EditText txt = (EditText) findViewById(R.id.editText13);
                String name = txt.getText().toString();
                boolean bl = name.equals("Canberra");
                if (bl) {
                    Toast.makeText(Activity14.this, "correct!",
                            Toast.LENGTH_LONG).show();
                    btn.setClickable(false);
                    count++;
                } else
                    Toast.makeText(Activity14.this, "wrong!",
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
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity15.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }
    public void onclick7(View vv){
        Intent intent=new Intent(this, com.ce17b023.quizdo.Activity24.class);
        intent.putExtra("passing",count);
        startActivity(intent);
    }

}

