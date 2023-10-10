package Act4;

import Act4.Song;

public class Song {
    String title;
    String artist;
    int year;
    String country;
    
    public Song() {
        this("Dancing Queen", "ABBA", 1978, "스웨덴");
    }
    
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    
    public void show() {
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }
    
    public static void main(String[] args) {
        Song song = new Song();
        Song newSong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        song.show();
        newSong.show();
    }
}
