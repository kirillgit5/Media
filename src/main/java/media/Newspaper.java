package media;

import media.Media;

public class Newspaper implements Media {
    private final static String name = "Newspaper";

    @Override
    public String getName() {
        return name;
    }
}
