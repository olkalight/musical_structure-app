package com.example.android.musical_structure_app;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(Activity context, List<Artist> artists) {
        // Initialized ArtistAdapter internal storage for the context and the list_view
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View artistItemView = convertView;
        if (artistItemView == null) {
            artistItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_artist, parent, false);
        }
        // Get the Artist object located at this position in the list_view
        final Artist currentArtist = getItem(position);

        if (currentArtist != null) {
            // Find the ImageView in the activity_artist.xml layout with the ID artist_picture_image_view
            ImageView artistPictureImageView = artistItemView.findViewById(R.id.artist_picture_image_view);
            // Get the artist picture from the current artist object and set this picture on the PictureView
            artistPictureImageView.setImageResource(currentArtist.getArtistDrawableId());
            // make sure that picture is visible
            artistPictureImageView.setVisibility(View.VISIBLE);
            // Find the TextView in the activity_artist.xml layout with the ID artist_name_text_view
            TextView artistTextView = artistItemView.findViewById(R.id.artist_name_text_view);
            // Get the artist name from the current Artist object and set this text on the TextView
            artistTextView.setText(currentArtist.getArtistName());
        }
        // return activity_artist layout
            return artistItemView;
        }

}