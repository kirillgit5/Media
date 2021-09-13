package media;
import java.util.ArrayList;
import java.util.List;

public class MediaManager {
    private final List<Media> mediaList = new ArrayList<>();

    public void addElement(Media element) {
        mediaList.add(element);
    }

    public void  removeElement(int index) throws Exception {
        if (index < 0 || index > mediaList.stream().count() - 1) {
            throw new Exception("invalid index");
        } else {
            mediaList.remove(index);
        }
    }

    public void showMediaList() {
        for (Media t : mediaList) {
                System.out.println(t.getName() + "\n");
        }
    }
}
