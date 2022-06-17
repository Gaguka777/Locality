import java.util.Arrays;

public class Pokrovka extends Locality {
    public Pokrovka(String[] place) {
        super(place);
    }

    @Override
    String searchDirector() {
        return "Айыл окмоту села Покровки";
    }

    @Override
    public String toString() {
        return Arrays.toString(place);
    }
}
