import java.util.Arrays;

public class Bishkek extends Locality{
    public Bishkek(String[] place) {
        super(place);
    }

    @Override
    String searchDirector() {
        return "Мэр города Бишкек";
    }

    @Override
    public String toString() {
        return "Bishkek {" +
                "районы = " + Arrays.toString(place) ;
    }
}
