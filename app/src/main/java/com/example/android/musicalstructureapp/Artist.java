package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class Artist implements Parcelable {

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };
    // artist name
    private String mArtistName;
    // Drawable ID of the artist
    private int mArtistDrawableId;
    // list_view of albums
    private List<Album> mAlbums;

    /**
     * Create a new artist object
     *
     * @param artistName       is the name of the item
     * @param artistDrawableId is the id of the corresponding drawable
     */
    Artist(String artistName, int artistDrawableId) {
        mArtistName = artistName;
        mArtistDrawableId = artistDrawableId;
        mAlbums = new ArrayList<>();
    }

    private Artist(Parcel in) {
        mArtistName = in.readString();
        mArtistDrawableId = in.readInt();
    }

    // get the artist's name
    public String getArtistName() {
        return mArtistName;
    }

    // get the drawable id
    public int getArtistDrawableId() {
        return mArtistDrawableId;
    }

    // get the list_view of albums
    List<Album> getAlbums() {
        return mAlbums;
    }

    // add the album object
    void addAlbum(Album album) {
        mAlbums.add(album);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mArtistName);
        parcel.writeInt(mArtistDrawableId);
    }
}