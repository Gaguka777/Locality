import java.util.Arrays;

public class OrtoSai extends Locality {
    public OrtoSai(String[] place) {
        super(place);
    }

    @Override
    String searchDirector() {
        return "Айыл окмоту села Орто Сай";
    }

    @Override
    public String toString() {
        return Arrays.toString(place);
    }
}
