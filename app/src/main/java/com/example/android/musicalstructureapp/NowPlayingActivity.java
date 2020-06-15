package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NowPlayingActivity extends AppCompatActivity {

    @BindView(R.id.nowplaying_album_cover_picture)
    ImageView albumImageView;
    @BindView(R.id.playing_song)
    TextView songTextView;
    @BindView(R.id.playing_artist)
    TextView artistTextView;
    @BindView(R.id.playing_album)
    TextView albumTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Bind the views using ButterKnife
        ButterKnife.bind(this);

        // Item passed through intent from the songs list_view
        Song song = getIntent().getParcelableExtra("SELECTED-SONG");

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

