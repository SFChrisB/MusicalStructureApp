package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find the view that shows the MainMenu category and move back to it
        TextView MainMenu = (TextView)findViewById(R.id.mainMenu);
        //Attach the listener to the MainMenu view
        MainMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Create a new intent to open the {@Link MainMenu}
                Intent mainMenuIntent = new Intent(NowPlaying.this, MainActivity.class);

                //Start the MainMenu activity
                startActivity(mainMenuIntent);
            }
        });
    }
}
