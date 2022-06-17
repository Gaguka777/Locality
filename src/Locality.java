import java.util.Arrays;

public abstract class Locality {
    String[] place;

    public Locality(String[] place) {
        this.place = place;
    }

    abstract String searchDirector();
}
