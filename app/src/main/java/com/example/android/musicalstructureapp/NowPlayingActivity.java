package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Item passed through intent from the songs list_view
        Song song = getIntent().getParcelableExtra("SELECTED-SONG");

        ImageView albumImageView = (ImageView) findViewById(R.id.nowplaying_album_cover_picture);
        TextView songTextView = (TextView) findViewById(R.id.playing_song);
        TextView artistTextView = (TextView) findViewById(R.id.playing_artist);
        TextView albumTextView = (TextView) findViewById(R.id.playing_album);

        if (song != null) {
            // get the song title, artist name, album name and album cover picture
            // and set text to the views
            albumImageView.setImageResource(song.getAlbumDrawableId());
            songTextView.setText(song.getSongTitle());
            artistTextView.setText(song.getArtistName());
            albumTextView.setText(song.getAlbumName());
        }
    }
}

