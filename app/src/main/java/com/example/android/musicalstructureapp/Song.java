package com.example.android.musical_structure_app;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    // song title
    private String mSongTitle;
    // artist object to look for artist name
    private Artist mArtist;
    // album object to look for album name
    private Album mAlbum;

    /**
     * Create a new Song object
     *
     * @param songTitle is the song title
     * @param artist    is the artist object
     * @param album     is the album object
     *                  album.addSong() - adding song to the album view
     */
    Song(String songTitle, Artist artist, Album album) {
        mSongTitle = songTitle;
        mArtist = artist;
        mAlbum = album;
        album.addSong(this);
    }

    Song(Parcel in) {
        mSongTitle = in.readString();
        mArtist = in.readParcelable(Artist.class.getClassLoader());
        mAlbum = in.readParcelable(Album.class.getClassLoader());
    }

    // get the song title
    public String getSongTitle() {
        return mSongTitle;
    }

    // get the Artist object
    public Artist getArtist() {
        return mArtist;
    }

    // get the name of the artist from Artist object
    public String getArtistName() {
        return getArtist().getArtistName();
    }

    // get the Album object
    public Album getAlbum() {
        return mAlbum;
    }

    // get the album title that song belongs to from Album object
    public String getAlbumName() {
        return getAlbum().getAlbumName();
    }

    // drawable ID of the cover image from the Album object
    int getAlbumDrawableId() {
        return getAlbum().getAlbumDrawableId();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSongTitle);
        parcel.writeParcelable(mArtist, i);
        parcel.writeParcelable(mAlbum, i);
    }
}

