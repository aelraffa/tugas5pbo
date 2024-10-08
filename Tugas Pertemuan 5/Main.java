import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Music");
            System.out.println("2. Remove Music");
            System.out.println("3. Display Music List");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter music title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    Music music = new Music(title, artist);
                    organizer.addMusic(music);
                    break;
                case 2:
                    System.out.print("Enter the title of the music to remove: ");
                    String removeTitle = scanner.nextLine();
                    organizer.removeMusic(removeTitle);
                    break;
                case 3:
                    organizer.displayMusicList();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
