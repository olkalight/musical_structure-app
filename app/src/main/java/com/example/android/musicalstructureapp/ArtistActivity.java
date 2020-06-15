package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final List<Artist> artists = MusicLibrary.getInstance().getArtists();
        // Create a ArtistAdapter with list_view of artists data source
        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        // find the ListView
        ListView artist = (ListView) findViewById(R.id.list_view);
        // Make the List View use the SongsAdapter created above,
        // so that the listView artist will display the artist item for each artist in the list_view
        artist.setAdapter(adapter);

        artist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int position, long l) {
                Intent artistIntent = new Intent(ArtistActivity.this, AlbumByArtistActivity.class);
                artistIntent.putExtra("position", position);
                startActivity(artistIntent);
            }
        });
    }
}
