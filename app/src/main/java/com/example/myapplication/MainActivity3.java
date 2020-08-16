package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button eko;
    private Button ecg;
    private Button tele;
    private Button tam;
    private Button trop;
    private Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        eko=findViewById(R.id.eko);
        eko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eko eko=new eko();
                eko.show(getSupportFragmentManager(), "Myeko");

            }
        });
        ecg=findViewById(R.id.EKG);
        ecg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecg ecg=new ecg();
                ecg.show(getSupportFragmentManager(), "MyECG");

            }
        });

        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActiviy4();

            }
        });

        tele=findViewById(R.id.tele);
        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tele tele=new tele();
                tele.show(getSupportFragmentManager(), "Mytele");

            }
        });

        tam=findViewById(R.id.TAM);
        tam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tam tam=new tam();
                tam.show(getSupportFragmentManager(), "Mytam");

            }
        });
        trop=findViewById(R.id.Trop);
        trop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trop trop=new trop();
                trop.show(getSupportFragmentManager(), "Mytrop");

            }
        });

    }
    public void openMainActiviy4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        overridePendingTransition(R.xml.slide_in_right, R.xml.slide_out_left);
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.xml.slide_in_left, R.xml.slide_out_right);
    }
}