package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // find the TextView that displays songs activity
    @BindView(R.id.songs)
    TextView songs;
    // find the TextView that displays albums activity
    @BindView(R.id.albums)
    TextView albums;
    // find the TextView that displays artists activity
    @BindView(R.id.artists)
    TextView artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind the views using ButterKnife
        ButterKnife.bind(this);

        //Set a click listener on that View
        //The code in this method will be executed when the Songs view is clicked on
        songs.setOnClickListener(v -> {
            Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
            startActivity(songsIntent);
        });
        //Set a click listener on that View
        //The code in this method will be executed when the Artists view is clicked on
        artists.setOnClickListener(v -> {
            Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
            startActivity(artistIntent);
        });
        //Set a click listener on that View
        //The code in this method will be executed when the Albums view is clicked on
        albums.setOnClickListener(v -> {
            Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
            startActivity(albumIntent);
        });
    }
}