package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DiagnoseMain extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.diagnose_main);
        Button HomeBtn = findViewById(R.id.HomeButton);
        Button inputVoiceRecordBtn = findViewById(R.id.InputByVoiceRecord);
        Button inputTextBtn = findViewById(R.id.InputByText);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHomePage = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(goHomePage);
            }
        });
        inputTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goDiagnoseWriting = new Intent(getApplicationContext(), DiagnoseWrite.class);
                startActivity(goDiagnoseWriting);
            }
        });
    }
}
