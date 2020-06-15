package com.example.android.musicalstructureapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    ArtistAdapter(Activity context, List<Artist> artists) {
        // Initialized ArtistAdapter internal storage for the context and the list_view
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, View artistItemView, @NonNull ViewGroup parent) {
        // Initialise the holder
        ViewHolder holder;
        // If there is no existing view being reused
        if (artistItemView == null) {
            // Inflate the view
            artistItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_artist, parent, false);
            // Setup the holder
            holder = new ArtistAdapter.ViewHolder(artistItemView);
            // Store the holder tag with the artistItemView
            artistItemView.setTag(holder);
        } else {
            // otherwise use the holder instead of calling findViewById()
            holder = (ArtistAdapter.ViewHolder) artistItemView.getTag();
        }
        // Get the Artist object located at this position in the list_view
        final Artist currentArtist = getItem(position);

        if (currentArtist != null) {
            // Get the artist picture from the current artist object and set this picture on the PictureView
            holder.artistPictureImageView.setImageResource(currentArtist.getArtistDrawableId());
            // make sure that picture is visible
            holder.artistPictureImageView.setVisibility(View.VISIBLE);
            // Get the artist name from the current Artist object and set this text on the TextView
            holder.artistTextView.setText(currentArtist.getArtistName());
        }
        // return activity_artist layout
        return artistItemView;
    }

    /**
     * Create a class {@link ArtistAdapter.ViewHolder} to hold/cache the exact set of views that we need.
     * A {@link ArtistAdapter.ViewHolder} object stores each of the component views inside the tag field of the
     * Layout, so it can immediately be accessed without the need to look them up repeatedly.
     */
    static class ViewHolder {

        // Find the ImageView in the activity_artist.xml layout with the ID artist_picture_image_view
        @BindView(R.id.artist_picture_image_view)
        ImageView artistPictureImageView;
        // Find the TextView in the activity_artist.xml layout with the ID artist_name_text_view
        @BindView(R.id.artist_name_text_view)
        TextView artistTextView;

        ViewHolder(View view) {
            // Pass the view to ButterKnife to bind it
            ButterKnife.bind(this, view);
        }
    }
}