import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<Music> musicList;

    public MusicOrganizer() {
        musicList = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musicList.add(music);
        System.out.println(music.getTitle() + " by " + music.getArtist() + " has been added.");
    }

    public void removeMusic(String title) {
        boolean found = false;
        for (Music music : musicList) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                musicList.remove(music);
                System.out.println(title + " has been removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(title + " not found in the list.");
        }
    }

    public void displayMusicList() {
        System.out.println("Music List:");
        if (musicList.isEmpty()) {
            System.out.println("The music list is empty.");
        } else {
            for (int i = 0; i < musicList.size(); i++) {
                System.out.println((i + 1) + ". " + musicList.get(i));
            }
        }
    }
}
