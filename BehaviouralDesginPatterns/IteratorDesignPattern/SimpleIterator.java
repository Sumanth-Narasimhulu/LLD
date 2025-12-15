package BehaviouralDesginPatterns.IteratorDesignPattern;

public class SimpleIterator implements Iterator{
     private PlayList playList;
     private int index;
     public SimpleIterator(PlayList playList) {
            this.playList = playList;
            this.index = 0;
     }
        @Override
        public boolean hasNext() {
            return index < playList.songs.size();
        }
        @Override
        public String next() {
            Song song = playList.songs.get(index++);
            return song.songName;
        }

} 
