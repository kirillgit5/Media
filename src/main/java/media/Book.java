package media;

public class Book implements Media {
    private final static String name = "Book";

    @Override
    public String getName() {
        return name;
    }
}
