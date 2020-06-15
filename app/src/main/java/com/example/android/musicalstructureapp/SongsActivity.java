package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongsActivity extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Bind the view using ButterKnife
        ButterKnife.bind(this);

        final List<Song> songs;
        // get the album position sent through the Intent
        int albumPosition = getIntent().getIntExtra("position", -1);
        if (albumPosition < 0)
            // display all library
            songs = MusicLibrary.getInstance().getSongs();
            // display albums library at the selected position
        else songs = MusicLibrary.getInstance().getAlbums().get(albumPosition).getSongs();
        // Create a SongAdapter with list_view of Songs data source
        SongsAdapter adapter = new SongsAdapter(this, songs);
        // Make the List View use the SongsAdapter created above,
        // so that the listView song will display the song item for each song in the list_view
        song.setAdapter(adapter);
        // Set onClickListener to selected item from the list_view
        song.setOnItemClickListener((parent, view, position, l) -> {

            Song selectedSong = songs.get(position);

            Intent songIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
            songIntent.putExtra("SELECTED-SONG", selectedSong);
            startActivity(songIntent);
        });
    }
}
