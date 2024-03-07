package First;

import java.util.function.Predicate;

//10) Имплементировать интерфейс Predicate, определяющий, является ли данная строка email-адресом, используя регулярное выражение.

public class FirstTask {
    public static void main(String[] args) {
        Predicate<String> predicate = email ->
                email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$");

        System.out.println(predicate.test("user@example.com"));
    }
}
