package Homework2;

public class Song {
    String Title;
    String Artist;

    public Song(String Title, String Artist){
        this.Artist= Artist;
        this.Title= Title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Title='" + Title + '\'' +
                ", Artist='" + Artist + '\'' +
                '}';
    }

}
