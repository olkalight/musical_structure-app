package com.example.android.musicalstructureapp;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(Activity context, List<Song> songs) {
        // Initialized SongsAdapter internal storage for the context and the list_view
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View songItemView, ViewGroup parent) {
        // Initialise the holder
        ViewHolder holder;
        // Check if the existing view is being reused, otherwise inflate the view
        if (songItemView == null) {
            // Inflate the view
            songItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_songs, parent, false);
            // Setup the holder
            holder = new SongsAdapter.ViewHolder(songItemView);
            // Store the holder tag with the artistItemView
            songItemView.setTag(holder);
        } else {
            // otherwise use the holder instead of calling findViewById()
            holder = (SongsAdapter.ViewHolder) songItemView.getTag();
        }
        // Get the Song object located at this position in the list_view
        final Song currentSong = getItem(position);

        if (currentSong != null) {
            // Get the song title from the current Song object and set this text on the TextView
            holder.songTextView.setText(currentSong.getSongTitle());
            // Get the artist name from the current Song object and set this text on the TextView
            holder.artistTextView.setText(currentSong.getArtistName());
            // Get the album title from the current Song object and set this text on the TextView
            holder.albumTextView.setText(currentSong.getAlbumName());
            // Get the album cover picture from the current song object and set this picture on the PictureView
            holder.albumImageView.setImageResource(currentSong.getAlbumDrawableId());
            // make sure that picture is visible
            holder.albumImageView.setVisibility(View.VISIBLE);
        }
        // return activity_artist layout
        return songItemView;
    }

    static class ViewHolder {

        // Find the TextView in the activity_songs.xml layout with the ID song_title_text_view
        @BindView(R.id.song_title_text_view)
        TextView songTextView;
        // Find the TextView in the activity_songs.xml layout with the ID song_artist_name_text_view
        @BindView(R.id.song_artist_name_text_view)
        TextView artistTextView;
        // Find the TextView in the activity_songs.xml layout with the ID song_album_title_text_view
        @BindView(R.id.song_album_title_text_view)
        TextView albumTextView;
        // Find the ImageView in the activity_songs.xml layout with the ID album_cover_picture
        @BindView(R.id.album_cover_picture)
        ImageView albumImageView;

        ViewHolder(View view) {
            // Pass the view to ButterKnife to bind it
            ButterKnife.bind(this, view);
        }
    }
}
