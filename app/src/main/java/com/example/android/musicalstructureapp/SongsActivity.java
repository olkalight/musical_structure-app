package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

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
        // find the ListView
        ListView song = (ListView) findViewById(R.id.list_view);
        // Make the List View use the SongsAdapter created above,
        // so that the listView song will display the song item for each song in the list_view
        song.setAdapter(adapter);
        // Set onClickListener to selected item from the list_view
        song.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                Song selectedSong = songs.get(position);

                Intent songIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                songIntent.putExtra("SELECTED-SONG", selectedSong);
                startActivity(songIntent);
            }
        });
    }
}
