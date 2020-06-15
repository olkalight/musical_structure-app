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

public class AlbumActivity extends AppCompatActivity {

    @BindView(R.id.gridview)
    GridView album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Find the GridView with the view ID caller grid_view
        setContentView(R.layout.grid_view);
        // Bind the view using ButterKnife
        ButterKnife.bind(this);

        final List<Album> albums = MusicLibrary.getInstance().getAlbums();
        // Create a AlbumAdapter with the list_view of albums data source
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Make the Grid View use the AlbumAdapter created above,
        // so that the albumActivity gridView will display the album item for each Album in the list_view
        album.setAdapter(adapter);
        // create the setOnItemClickListener for the gridView
        album.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent albumIntent = new Intent(AlbumActivity.this, SongsActivity.class);
                albumIntent.putExtra("position", position);
                startActivity(albumIntent);
            }
        });
    }
}
