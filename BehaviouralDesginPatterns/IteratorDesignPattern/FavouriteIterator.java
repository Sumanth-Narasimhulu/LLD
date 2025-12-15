package BehaviouralDesginPatterns.IteratorDesignPattern;

public class FavouriteIterator implements Iterator{
    private PlayList playList;
    private int index;
    public FavouriteIterator(PlayList playList) {
           this.playList = playList;
           this.index = 0;
    }
       @Override
       public boolean hasNext() {
           while(index < playList.songs.size()) {
               if(playList.songs.get(index).isFavorite) {
                   return true;
               } else {
                   index++;
               }
           }
           return false;
       }
       @Override
       public String next() {
           Song song = playList.songs.get(index++);
           return song.songName;
       }
    
}
