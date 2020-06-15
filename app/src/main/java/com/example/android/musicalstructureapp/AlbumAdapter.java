package com.example.android.musical_structure_app;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, List<Album> albums) {
        // Initialized AlbumAdapter internal storage for the context and the list_view
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View albumItemView = convertView;
        if (albumItemView == null) {
            albumItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_album, parent, false);
        }
        // Get the Album object located at this position in the list_view
        final Album currentAlbum = getItem(position);

        if (currentAlbum != null) {
            // Find the ImageView in the activity_album.xml layout with the ID album_picture_image_view
            ImageView albumPictureImageView = albumItemView.findViewById(R.id.album_picture_image_view);
            // Get the album picture from the current Album object and set this picture on the ImageView
            albumPictureImageView.setImageResource(currentAlbum.getAlbumDrawableId());
            // make sure that picture is visible
            albumPictureImageView.setVisibility(View.VISIBLE);
            // Find the TextView in the activity_album.xml layout with the ID album_title_text_view
            TextView albumTextView = albumItemView.findViewById(R.id.album_title_text_view);
            // Get the album title from the current Album object and set this text on the TextView
            albumTextView.setText(currentAlbum.getAlbumName());
            // Find the TextView in the activity_album.xml layout with the ID artist_name_text_view
            TextView albumArtistTextView = albumItemView.findViewById(R.id.album_artist_name_text_view);
            // Get the artist name from the current Album object and set this text on the TextView
            albumArtistTextView.setText(currentAlbum.getArtist().getArtistName());
            // Find the TextView in the activity_album.xml layout with the ID album_date_text_view
            TextView albumDateTextView = albumItemView.findViewById(R.id.album_date_text_view);
            // Get the album date from the current Album object and set this text on the TextView
            albumDateTextView.setText(currentAlbum.getAlbumDate());
        }
        // return activity_album layout
        return albumItemView;
    }
}
