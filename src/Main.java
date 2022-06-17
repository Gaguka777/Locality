import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите руководителя");

        Scanner scan = new Scanner(System.in);
        String findDirector = scan.nextLine();

        Talas talas = new Talas(new String[]{"Манасский,Бакай-Атинский,Кара-Буринский"});
        Bishkek bishkek = new Bishkek(new String[]{"Первомайский,Алпмединский,Ленинский"});
        Pokrovka pokrovka = new Pokrovka(new String[]{"Село Покровка"});
        OrtoSai ortoSai = new OrtoSai(new String[]{"Село Орто Сай"});


        if (talas.searchDirector().equals(findDirector)) {
            System.out.println(talas);
        } else if (bishkek.searchDirector().equals(findDirector)) {
            System.out.println(bishkek);
        } else if (pokrovka.searchDirector().equals(findDirector)) {
            System.out.println(pokrovka);
        } else if (ortoSai.searchDirector().equals(findDirector)) {
            System.out.println(ortoSai);
        } else {
            System.out.println("Введите инициалы правильно !");
        }
    }
}
