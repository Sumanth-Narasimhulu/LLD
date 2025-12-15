package BehaviouralDesginPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<Song>songs;

    public PlayList(){
        this.songs = new ArrayList<>();

    }
    public void addSong(Song song){
        songs.add(song);
    }
    public Iterator getIterator(String type){
        if(type.equalsIgnoreCase("simple")){
            return new SimpleIterator(this);
        }
        else if(type.equalsIgnoreCase("favourite")){
            return new FavouriteIterator(this);
        }
        return null;

    }
}
