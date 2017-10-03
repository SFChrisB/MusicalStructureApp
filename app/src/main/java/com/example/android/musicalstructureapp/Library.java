package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalstructureapp.R.id.NowPlay;
import static com.example.android.musicalstructureapp.R.id.PlayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //Find the view that shows the MainMenu category and move back to it
        TextView MainMenu = (TextView) findViewById(R.id.mainMenu);
        //Attach the listener to the MainMenu view
        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link MainMenu}
                Intent mainMenuIntent = new Intent(Library.this, MainActivity.class);

                //Start the MainMenu activity
                startActivity(mainMenuIntent);
            }
        });

        //Find the view that shows the Playlist category
        TextView PlayList = (TextView) findViewById(R.id.Playlist);
        //Attach the listener to the Playlist view
        PlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link Playlist}
                Intent PlayListIntent = new Intent(Library.this, Playlist.class);

                //Start the Playlist activity
                startActivity(PlayListIntent);
            }
        });
    }
}

