import media.*;

public class Main {
    public static void main(String[] args) {
        Media book = new Book();
        Media newspaper = new Newspaper();
        Media video = new Video();

        MediaManager manager = new MediaManager();
        manager.addElement(book);
        manager.addElement(newspaper);
        manager.addElement(video);

        manager.showMediaList();

        MediaManagerGeneric mediaManager = new MediaManagerGeneric<Media>();
        mediaManager.addElement(book);
        mediaManager.addElement(newspaper);
        mediaManager.addElement(video);
        try {
        mediaManager.showMediaList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}