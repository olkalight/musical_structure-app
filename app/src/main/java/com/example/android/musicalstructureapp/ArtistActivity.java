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

public class ArtistActivity extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView artist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Bind the view using ButterKnife
        ButterKnife.bind(this);

        final List<Artist> artists = MusicLibrary.getInstance().getArtists();
        // Create a ArtistAdapter with list_view of artists data source
        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        // Make the List View use the SongsAdapter created above,
        // so that the listView artist will display the artist item for each artist in the list_view
        artist.setAdapter(adapter);

        artist.setOnItemClickListener((AdapterView, view, position, l) -> {
            Intent artistIntent = new Intent(ArtistActivity.this, AlbumByArtistActivity.class);
            artistIntent.putExtra("position", position);
            startActivity(artistIntent);
        });
    }
}
