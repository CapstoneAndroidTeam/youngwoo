package com.example.capstone.Report;

import static com.example.capstone.Report.Reporting.report_number;
import static com.example.capstone.Report.Reporting.report_type;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstone.Chatbot.Chat;
import com.example.capstone.Community.CommunityWrite;
import com.example.capstone.Home.MainActivity;
import com.example.capstone.R;

public class ReportingEnd extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endreport);
        ImageButton HomeBtn = findViewById(R.id.HomeButton);
        ImageButton WriteInGalleryButton = findViewById(R.id.WriteinGalleryButton);
        ImageButton BackBtn = findViewById(R.id.BackButton);
        ImageButton treatBtn = findViewById(R.id.PreventionButton);
        TextView reportnum = findViewById(R.id.phonenumber);
        TextView reportreason = findViewById(R.id.reportreason);
        reportnum.setText(report_number);
        reportreason.setText(report_type);
        treatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goChat = new Intent(getApplicationContext(), Chat.class);
                startActivity(goChat);
            } //진단하기 버튼 누르면 진단하기 창으로
        });
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish the current activity to go to the parent page
                finish();
            }
        });
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHomePage = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(goHomePage);
            }
        });
        /*
        BanNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //go To Ban Number List Page;
            }
        });
        */
        WriteInGalleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goCommunity = new Intent(getApplicationContext(), CommunityWrite.class);
                startActivity(goCommunity);
            }
        });
    }
}
