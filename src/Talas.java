import java.util.Arrays;

public class Talas extends Locality {
    public Talas(String[] place) {
        super(place);
    }
    @Override
    String searchDirector() {
        return "Губернатор города Талас";
    }
    @Override
    public String toString() {
        return "Talas {" +
                "районы = " + Arrays.toString(place);
    }
}
