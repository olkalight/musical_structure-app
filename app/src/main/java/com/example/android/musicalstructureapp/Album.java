package com.example.android.musical_structure_app;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class Album implements Parcelable {

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };
    // album name
    private String mAlbumName;
    // album date
    private String mAlbumDate;
    // Drawable ID of cover picture
    private int mAlbumDrawableId;
    // artist object to search for artist name
    private Artist mArtist;
    // list_view of songs
    private List<Song> mSongs;

    /**
     * Create a new album object
     *
     * @param albumName       is the name of the album
     * @param albumDate       is the year of the album
     * @param albumDrawableId is the id of the corresponding drawable
     * @param artist          is the artist object
     *                        artist.addAlbum(); adding albums to the artist view
     */
    Album(String albumName, String albumDate, int albumDrawableId, Artist artist) {
        mAlbumName = albumName;
        mAlbumDate = albumDate;
        mAlbumDrawableId = albumDrawableId;
        mArtist = artist;
        mSongs = new ArrayList<>();
        artist.addAlbum(this);
    }

    Album(Parcel in) {
        mAlbumName = in.readString();
        mAlbumDate = in.readString();
        mAlbumDrawableId = in.readInt();
        mArtist = in.readParcelable(Artist.class.getClassLoader());
    }

    // get the name of the album
    public String getAlbumName() {
        return mAlbumName;
    }

    // get the album year
    public String getAlbumDate() {
        return mAlbumDate;
    }

    // get the drawable id
    public int getAlbumDrawableId() {
        return mAlbumDrawableId;
    }

    // get the object Artist
    Artist getArtist() {
        return mArtist;
    }

    // get the list_view of songs
    List<Song> getSongs() {
        return mSongs;
    }

    // add the song object
    void addSong(Song song) {
        mSongs.add(song);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mAlbumName);
        parcel.writeString(mAlbumDate);
        parcel.writeInt(mAlbumDrawableId);
        parcel.writeParcelable(mArtist, i);
    }
}
