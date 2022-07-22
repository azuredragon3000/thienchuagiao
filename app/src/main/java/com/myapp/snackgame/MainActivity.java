package com.myapp.snackgame;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// truyen phat giao
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.start);

        bt.setOnClickListener(v->{
            startActivity(new Intent(this,HomeActivity.class));
        });


    }
}