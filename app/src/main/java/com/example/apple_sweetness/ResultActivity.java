package com.example.apple_sweetness;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_apple_sweetness);

        //scroll
        TextView apple_result = (TextView)findViewById(R.id.apple_result);
        apple_result.setMovementMethod(new ScrollingMovementMethod());


        //Home button

//       ImageView home = findViewById(R.id.home_bu);
//       home.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent AppleSweetnessIntent = new Intent(getApplicationContext(), MainActivity.class);
//               startActivity(AppleSweetnessIntent);
//            }
//        });

    }


}

//img -> server


//server -> img




// server -> result txt
