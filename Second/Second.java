package Second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>(List.of(
                new Human(19, "Andrey", "Korolev", LocalDate.now(), 66),
                new Human(20, "Egor", "Bekasov", LocalDate.now(), 10),
                new Human(21, "Vanya", "Terentev", LocalDate.now(), 100),
                new Human(22, "Gosha", "Aleks", LocalDate.now(), 87),
                new Human(23, "Stepa", "Gorohov", LocalDate.now(), 0)
        ));

        Integer ans = people.stream()
                .sorted(Comparator.comparing(human ->
                        human.getFirstName().charAt(human.getFirstName().length() - 2)))
                .filter(human -> human.getWeight() > 60)
                .sorted(Comparator.comparing(human -> human.getAge()))
                .mapToInt(Human::getAge)
                .reduce((a, b) -> a * b).getAsInt();

        System.out.println(ans);
    }
}
