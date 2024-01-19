package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NumNotSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_notsearch);

        Button bannumBtn = findViewById(R.id.BanNumberButton);
        Button communityBtn = findViewById(R.id.GalleryButton);
        Button preventBtn = findViewById(R.id.PreventionButton);

        bannumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReporting = new Intent(getApplicationContext(), Reporting.class);
                startActivity(goReporting);
            }
        });
        communityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCommunity = new Intent(getApplicationContext(), CommunityMain.class);
                startActivity(goCommunity);
            }
        });

        Button HomeBtn = findViewById(R.id.HomeButton);

        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHomePage = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goHomePage);
            }
        });
    }
}