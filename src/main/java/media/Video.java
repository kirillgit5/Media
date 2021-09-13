package media;

import media.Media;

public class Video implements Media {
    private final static String name = "Video";

    @Override
    public String getName() {
        return name;
    }
}
