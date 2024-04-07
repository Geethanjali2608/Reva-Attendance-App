package com.example.pichu;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button loginstd;
    Button loginfact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loginstd=(Button)findViewById(R.id.button1);
        loginfact=(Button)findViewById(R.id.button2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,stud_login.class);
                startActivity(intent);

            }

            @Override
            public void onClick()
        });
    }
}