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

public class AlbumAdapter extends ArrayAdapter<Album> {

    AlbumAdapter(Activity context, List<Album> albums) {
        // Initialized AlbumAdapter internal storage for the context and the list_view
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, View albumItemView, @NonNull ViewGroup parent) {
        // Initialise the holder
        ViewHolder holder;
        // If there is no existing view being reused
        if (albumItemView == null) {
            // Inflate the view
            albumItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_album, parent, false);
            // Setup the holder
            holder = new ViewHolder(albumItemView);
            // Store the holder tag with the albumItemView
            albumItemView.setTag(holder);
        } else {
            // otherwise use the holder instead of calling findViewById()
            holder = (ViewHolder) albumItemView.getTag();
        }
        // Get the Album object located at this position in the list_view
        Album currentAlbum = getItem(position);
        // Assign values if the object currentAlbum is not null
        if (currentAlbum != null) {
            // Get the album picture from the current Album object and set this picture on the ImageView
            holder.albumDrawableId.setImageResource(currentAlbum.getAlbumDrawableId());
            // make sure that picture is visible
            holder.albumDrawableId.setVisibility(View.VISIBLE);
            // Get the album title from the current Album object and set this text on the TextView
            holder.albumTextView.setText(currentAlbum.getAlbumName());
            // Get the artist name from the current Album object and set this text on the TextView
            holder.albumArtistTextView.setText(currentAlbum.getArtist().getArtistName());
            // Get the album date from the current Album object and set this text on the TextView

            holder.albumDateTextView.setText(currentAlbum.getAlbumDate());
        }
        // return activity_album layout
        return albumItemView;
    }

    /**
     * Create a class {@link ViewHolder} to hold/cache the exact set of views that we need.
     * A {@link ViewHolder} object stores each of the component views inside the tag field of the
     * Layout, so it can immediately be accessed without the need to look them up repeatedly.
     */
    static class ViewHolder {

        // Find the ImageView in the activity_album.xml layout with the ID album_picture_image_view
        @BindView(R.id.album_picture_image_view)
        ImageView albumDrawableId;
        // Find the TextView in the activity_album.xml layout with the ID album_title_text_view
        @BindView(R.id.album_title_text_view)
        TextView albumTextView;
        // Find the TextView in the activity_album.xml layout with the ID album_artist_name_text_view
        @BindView(R.id.album_artist_name_text_view)
        TextView albumArtistTextView;
        // Find the TextView in the activity_album.xml layout with the ID album_date_text_view
        @BindView(R.id.album_date_text_view)
        TextView albumDateTextView;

        ViewHolder(View view) {
            // Pass the view to ButterKnife to bind it
            ButterKnife.bind(this, view);
        }
    }
}
