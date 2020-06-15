package com.example.android.musicalstructureapp;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(Activity context, List<Song> songs) {
        // Initialized SongsAdapter internal storage for the context and the list_view
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View songItemView = convertView;
        if (songItemView == null) {
            songItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_songs, parent, false);
        }
        // Get the Song object located at this position in the list_view
        final Song currentSong = getItem(position);

        if (currentSong != null) {
            // Find the TextView in the activity_songs.xml layout with the ID song_title_text_view
            TextView songTextView = songItemView.findViewById(R.id.song_title_text_view);
            // Get the song title from the current Song object and set this text on the TextView
            songTextView.setText(currentSong.getSongTitle());
            // Find the TextView in the activity_songs.xml layout with the ID song_artist_name_text_view
            TextView artistTextView = songItemView.findViewById(R.id.song_artist_name_text_view);
            // Get the artist name from the current Song object and set this text on the TextView
            artistTextView.setText(currentSong.getArtistName());
            // Find the TextView in the activity_songs.xml layout with the ID song_album_title_text_view
            TextView albumTextView = songItemView.findViewById(R.id.song_album_title_text_view);
            // Get the album title from the current Song object and set this text on the TextView
            albumTextView.setText(currentSong.getAlbumName());
            // Find the ImageView in the activity_songs.xml layout with the ID album_cover_picture
            ImageView albumImageView = songItemView.findViewById(R.id.album_cover_picture);
            // Get the album cover picture from the current song object and set this picture on the PictureView
            albumImageView.setImageResource(currentSong.getAlbumDrawableId());
            // make sure that picture is visible
            albumImageView.setVisibility(View.VISIBLE);
        }
        // return activity_artist layout
        return songItemView;
    }
}
