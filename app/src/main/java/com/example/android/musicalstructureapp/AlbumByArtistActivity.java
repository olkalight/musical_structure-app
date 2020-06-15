package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

public class AlbumByArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        final List<Album> albums;
        // get the album position sent through the Intent
        int artistPosition = getIntent().getIntExtra("position", -1);
        // display albums library at the selected position
         albums = MusicLibrary.getInstance().getArtists().get(artistPosition).getAlbums();
        // Create a AlbumAdapter with list_view of albums data source
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Find the GridView with the view ID caller grid_view
        GridView albumByArtist = (GridView) findViewById(R.id.gridview);
        // Make the Grid View use the AlbumAdapter created above,
        // so that the albumByArtist gridView will display the album item for each Album in the list_view
        albumByArtist.setAdapter(adapter);

        albumByArtist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Album selectedAlbum = albums.get(position);

                Intent albumByArtistIntent = new Intent(AlbumByArtistActivity.this, SongsActivity.class);
                albumByArtistIntent.putExtra("SELECTED-ALBUM", selectedAlbum);
                startActivity(albumByArtistIntent);
            }
        });
    }
}