package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        final List<Album> albums = MusicLibrary.getInstance().getAlbums();
        // Create a AlbumAdapter with the list_view of albums data source
        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        // Find the GridView with the view ID caller grid_view
        GridView album = (GridView) findViewById(R.id.gridview);
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
