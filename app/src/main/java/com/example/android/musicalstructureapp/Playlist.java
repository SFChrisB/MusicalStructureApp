package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Find the view that shows the MainMenu category and move back to it
        TextView MainMenu = (TextView)findViewById(R.id.mainMenu);
        //Attach the listener to the MainMenu view
        MainMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@Link MainMenu}
                Intent mainMenuIntent = new Intent(Playlist.this, MainActivity.class);

                //Start the MainMenu activity
                startActivity(mainMenuIntent);
            }
        });

        //Find the view that shows the NowPlaying category
        TextView NowPlay = (TextView) findViewById(R.id.NowPlay);
        //Attach the listener to the NowPlaying view
        NowPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link NowPlaying}
                Intent nowPlayIntent = new Intent(Playlist.this, NowPlaying.class);

                //Start the NowPlaying activity
                startActivity(nowPlayIntent);
            }
        });
    }
}
