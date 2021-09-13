package media;
import java.util.ArrayList;
import java.util.List;

public class MediaManagerGeneric<T> {
    private final List<T> mediaList = new ArrayList<>();

    public void addElement(T element) {
        mediaList.add(element);
    }

    public void  removeElement(int index) throws Exception {
        if (index < 0 || index > mediaList.stream().count() - 1) {
            throw new Exception("invalid index");
        } else {
            mediaList.remove(index);
        }
    }

    public void showMediaList() throws Exception {
        for (T t : mediaList) {
            try {
                Media media = (Media)t;
                System.out.println(media.getName() + "\n");
            } catch (ClassCastException e) {
                throw e;
            }
        }
    }
}
