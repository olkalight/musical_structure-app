package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the Songs Activity
        TextView songs = (TextView) findViewById(R.id.songs);
        //Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Songs view is clicked on
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
        //Find the VIew that shows the Artists Activity
        TextView artists = (TextView) findViewById(R.id.artists);
        //Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Artists view is clicked on
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });
        //Find the VIew that shows the Artists Activity
        TextView albums = (TextView) findViewById(R.id.albums);
        //Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the Albums view is clicked on
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });
    }
}
