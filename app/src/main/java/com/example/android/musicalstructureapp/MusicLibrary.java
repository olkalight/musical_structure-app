package com.example.android.musicalstructureapp;


import java.util.ArrayList;
import java.util.List;

// Class with getInstance() methods as a source of data for the Music Structure App
public class MusicLibrary {

    private static MusicLibrary INSTANCE = null;

    //init of the ArrayList of Artists
    public List<Artist> artists = new ArrayList<>();

    //init of the ArrayList of Albums
    public List<Album> albums = new ArrayList<>();

    //init of the ArrayList of Songs
    public List<Song> songs = new ArrayList<>();

    // private constructor for this class
    private MusicLibrary() {
        // artist add
        artists.add(new Artist("Pink Floyd", R.drawable.pinkfloyd));
        artists.add(new Artist("Gentleman", R.drawable.gentleman));
        artists.add(new Artist("Babyshambles", R.drawable.babyshambles));
        artists.add(new Artist("In Flames", R.drawable.inflames));
        // album add
        // first artist first album and more
        albums.add(new Album("Atom Heart Mother", "1970", R.drawable.atomheartmother, artists.get(0)));
        albums.add(new Album("The Dark Side Of The Moon", "1973", R.drawable.thedarksideofthemoon, artists.get(0)));
        // second artist first album and more
        albums.add(new Album("Journey To Jah", "2002", R.drawable.journeytojah, artists.get(1)));
        // third artist first album and more
        albums.add(new Album("Shotter\'s Nation", "2007", R.drawable.shottersnation, artists.get(2)));
        // fourth artist first album and more
        albums.add(new Album("Lunar Strain", "1994", R.drawable.lunarstrain, artists.get(3)));
        albums.add(new Album("Come Clarity", "2006", R.drawable.comeclarity, artists.get(3)));
        // song add
        // first artist first album songs list_view
        songs.add(new Song("Atom Heart Mother Suite", artists.get(0), albums.get(0)));
        songs.add(new Song("If", artists.get(0), albums.get(0)));
        songs.add(new Song("Summer \'68", artists.get(0), albums.get(0)));
        songs.add(new Song("Fat Old Sun", artists.get(0), albums.get(0)));
        songs.add(new Song("Alan\'s Psychedelic Breakfast", artists.get(0), albums.get(0)));
        // first artist second album songs list_view
        songs.add(new Song("Speak To Me", artists.get(0), albums.get(1)));
        songs.add(new Song("Breathe (In The Air)", artists.get(0), albums.get(1)));
        songs.add(new Song("On The Run", artists.get(0), albums.get(1)));
        songs.add(new Song("Time", artists.get(0), albums.get(1)));
        songs.add(new Song("The Great Gig In The Sky", artists.get(0), albums.get(1)));
        songs.add(new Song("Money", artists.get(0), albums.get(1)));
        songs.add(new Song("Us And Them", artists.get(0), albums.get(1)));
        songs.add(new Song("Any Colour You Like", artists.get(0), albums.get(1)));
        songs.add(new Song("Brain Damage", artists.get(0), albums.get(1)));
        songs.add(new Song("Eclipse", artists.get(0), albums.get(1)));
        // second artist first album songs list_view
        songs.add(new Song("Dem Gone", artists.get(1), albums.get(2)));
        songs.add(new Song("In a Different Time (feat. Jahmali & Daddy Rings)", artists.get(1), albums.get(2)));
        songs.add(new Song("Runaway", artists.get(1), albums.get(2)));
        songs.add(new Song("Man A Rise (feat. Bounty Killer)", artists.get(1), albums.get(2)));
        songs.add(new Song("Love Chant", artists.get(1), albums.get(2)));
        songs.add(new Song("See Dem Coming", artists.get(1), albums.get(2)));
        songs.add(new Song("Man Of My Own (feat. Morgan Heritage)", artists.get(1), albums.get(2)));
        songs.add(new Song("Leave Us Alone", artists.get(1), albums.get(2)));
        songs.add(new Song("Long Face", artists.get(1), albums.get(2)));
        songs.add(new Song("Younger Generation (feat. Luciano & Mikey General)", artists.get(1), albums.get(2)));
        songs.add(new Song("Dangerzone (feat. Junior Kelly)", artists.get(1), albums.get(2)));
        songs.add(new Song("Empress", artists.get(1), albums.get(2)));
        songs.add(new Song("Fire Ago Bun Dem (feat. Capleton)", artists.get(1), albums.get(2)));
        songs.add(new Song("Jah Ina Yuh Life", artists.get(1), albums.get(2)));
        songs.add(new Song("Children Of Tomorrow (feat. Jack Radics)", artists.get(1), albums.get(2)));
        // third artist first album songs list_view
        songs.add(new Song("Carry on Up the Morning", artists.get(2), albums.get(3)));
        songs.add(new Song("Delivery", artists.get(2), albums.get(3)));
        songs.add(new Song("You Talk", artists.get(2), albums.get(3)));
        songs.add(new Song("Unbilotitled", artists.get(2), albums.get(3)));
        songs.add(new Song("Side of the Road", artists.get(2), albums.get(3)));
        songs.add(new Song("Crumb Begging Baghead", artists.get(2), albums.get(3)));
        songs.add(new Song("Unstookie Titled", artists.get(2), albums.get(3)));
        songs.add(new Song("French Dog Blues", artists.get(2), albums.get(3)));
        songs.add(new Song("There She Goes", artists.get(2), albums.get(3)));
        songs.add(new Song("Baddie's Boogie", artists.get(2), albums.get(3)));
        songs.add(new Song("Deft Left Hand", artists.get(2), albums.get(3)));
        songs.add(new Song("Lost Art of Murder", artists.get(2), albums.get(3)));
        // fourth artist first album songs list_view
        songs.add(new Song("Behind Space", artists.get(3), albums.get(4)));
        songs.add(new Song("Lunar Strain", artists.get(3), albums.get(4)));
        songs.add(new Song("Starforsaken", artists.get(3), albums.get(4)));
        songs.add(new Song("Dreamscape", artists.get(3), albums.get(4)));
        songs.add(new Song("Everlost (Part I)", artists.get(3), albums.get(4)));
        songs.add(new Song("Everlost (Part II)", artists.get(3), albums.get(4)));
        songs.add(new Song("Hårgalåten", artists.get(3), albums.get(4)));
        songs.add(new Song("In Flames", artists.get(3), albums.get(4)));
        songs.add(new Song("Upon an Oaken Throne", artists.get(3), albums.get(4)));
        songs.add(new Song("Clad in Shadows", artists.get(3), albums.get(4)));
        // fourth artist second album songs list_view
        songs.add(new Song("Take This Life", artists.get(3), albums.get(5)));
        songs.add(new Song("Leeches", artists.get(3), albums.get(5)));
        songs.add(new Song("Reflect the Storm", artists.get(3), albums.get(5)));
        songs.add(new Song("Dead End", artists.get(3), albums.get(5)));
        songs.add(new Song("Scream", artists.get(3), albums.get(5)));
        songs.add(new Song("Come Clarity", artists.get(3), albums.get(5)));
        songs.add(new Song("Vacuum", artists.get(3), albums.get(5)));
        songs.add(new Song("Pacing Death\'s Trail", artists.get(3), albums.get(5)));
        songs.add(new Song("Crawl Through Knives", artists.get(3), albums.get(5)));
        songs.add(new Song("Versus Terminus", artists.get(3), albums.get(5)));
        songs.add(new Song("Our Infinite Struggle", artists.get(3), albums.get(5)));
        songs.add(new Song("Vanishing Light", artists.get(3), albums.get(5)));
        songs.add(new Song("Your Bedtime Story Is Scaring Everyone", artists.get(3), albums.get(5)));
    }

    static MusicLibrary getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MusicLibrary();
        }
        return (INSTANCE);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
