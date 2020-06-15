package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumByArtistActivity extends AppCompatActivity {

    @BindView(R.id.gridview)
    GridView albumByArtist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Find the GridView with the view ID caller grid_view
        setContentView(R.layout.grid_view);
        // Bind the view using ButterKnife
        ButterKnife.bind(this);

        final List<Album> albums;
        // get the album position sent through the Intent
        int artistPosition = getIntent().getIntExtra("position", -1);
        // display albums library at the selected position
         albums = MusicLibrary.getInstance().getArtists().get(artistPosition).getAlbums();
        // Create a AlbumAdapter with list_view of albums data source
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Make the Grid View use the AlbumAdapter created above,
        // so that the albumByArtist gridView will display the album item for each Album in the list_view
        albumByArtist.setAdapter(adapter);
        // create the setOnItemClickListener for the gridView
        albumByArtist.setOnItemClickListener((adapterView, view, position, l) -> {

            Album selectedAlbum = albums.get(position);

            Intent albumByArtistIntent = new Intent(AlbumByArtistActivity.this, SongsActivity.class);
            albumByArtistIntent.putExtra("SELECTED-ALBUM", selectedAlbum);
            startActivity(albumByArtistIntent);
        });
    }
}