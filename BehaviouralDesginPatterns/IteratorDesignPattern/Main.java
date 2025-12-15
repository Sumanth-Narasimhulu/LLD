package BehaviouralDesginPatterns.IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        PlayList myPlayList = new PlayList();
        Song song1 = new Song();
        song1.songName = "Song A";
        song1.artistName = "Artist 1";
        song1.lyrics = "La la la...";
        song1.isFavorite = true;

        Song song2 = new Song();
        song2.songName = "Song B";
        song2.artistName = "Artist 2";
        song2.lyrics = "Na na na...";
        song2.isFavorite = false;

        Song song3 = new Song();
        song3.songName = "Song C";
        song3.artistName = "Artist 3";
        song3.lyrics = "Da da da...";
        song3.isFavorite = true;

        Song song4 = new Song();
        song4.songName = "Song D";
        song4.artistName = "Artist 4";
        song4.lyrics = "Ta ta ta...";
        song4.isFavorite = false;
        myPlayList.addSong(song1);
        myPlayList.addSong(song2);
        myPlayList.addSong(song3);
        myPlayList.addSong(song4);
        System.out.println("All Songs in Playlist:");
        Iterator iterator = myPlayList.getIterator("simple");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nFavorite Songs in Playlist:");
        Iterator favIterator = myPlayList.getIterator("favourite");
        while(favIterator.hasNext()) {
            System.out.println(favIterator.next());
        }
    }
}
