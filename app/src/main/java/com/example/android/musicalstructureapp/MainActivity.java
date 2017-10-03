package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the NowPlaying category
        ImageView NowPlay = (ImageView) findViewById(R.id.NowPlay);
        //Attach the listener to the NowPlaying view
        NowPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link NowPlaying}
                Intent nowPlayIntent = new Intent(MainActivity.this, NowPlaying.class);

                //Start the NowPlaying activity
                startActivity(nowPlayIntent);
            }
        });

        //Find the view that shows the Search category
        ImageView Search = (ImageView) findViewById(R.id.Search);
        //Attach the listener to the Search view
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link Search}
                Intent searchIntent = new Intent(MainActivity.this, Search.class);

                //Start the Search activity
                startActivity(searchIntent);
            }
        });

        //Find the view that shows the Playlists category
        ImageView Playlists = (ImageView) findViewById(R.id.PlayList);
        //Attach the listener to the Playlists view
        Playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link Playlists}
                Intent PlaylistsIntent = new Intent(MainActivity.this, Playlist.class);

                //Start the Playlists activity
                startActivity(PlaylistsIntent);
            }
        });

        //Find the view that shows the Library category
        TextView Library = (TextView) findViewById(R.id.Library);
        //Attach the listener to the Libaray view
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@Link Library}
                Intent LibraryIntent = new Intent(MainActivity.this, Library.class);

                //Start the Library activity
                startActivity(LibraryIntent);
            }
        });
    }
}

/*********************************************
 * resources:
 *  Art provided by my wife using GIMP.
 *  Other art provided by android at https://material.io/icons/
 *
 *********************************************/
