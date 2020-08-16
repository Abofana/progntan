package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button2;
    private Button popupBT;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        popupBT=findViewById(R.id.popupBT);
        popupBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialogF popupBT=new MyDialogF();
                popupBT.show(getSupportFragmentManager(), "Myf");

            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActiviy3();

            }
        });
    }

    public void openMainActiviy3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        overridePendingTransition(R.xml.slide_in_right, R.xml.slide_out_left);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.xml.slide_in_left, R.xml.slide_out_right);
    }
}