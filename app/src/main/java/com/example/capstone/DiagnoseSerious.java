package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DiagnoseSerious extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.diagnose_report);
        Button HomeBtn = findViewById(R.id.HomeButton);
        Button banBtn = findViewById(R.id.BanNumberButton);
        Button CommunityBtn = findViewById(R.id.WriteinGalleryButton);
        Button preventBtn = findViewById(R.id.PreventionButton);
        Button moreInfo = findViewById(R.id.MoreButton);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHomePage = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(goHomePage);
            }
        });
        //Go Report Page
        banBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goReportPage = new Intent(getApplicationContext(), Reporting.class);
                startActivity(goReportPage);
            }
        });
        //Go Community Page
        CommunityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goCommunityPage = new Intent(getApplicationContext(), CommunityWrite.class);
                startActivity(goCommunityPage);
            }
        });
        //go Prevention Page - Not yet
        /*
        preventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

         */

        //More Info Popup Page Calling
        moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popup = new Intent(getApplicationContext(), MoreInfoPopup.class);
                startActivity(popup);
            }
        });
    }
}
