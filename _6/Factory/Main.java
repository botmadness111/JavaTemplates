package _6.Factory;

public class Main {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

        Person person = factory.createPerson("Gosha");
        Person person1 = factory.createPerson("Stepa");
        person.getName();
        person1.getName();
    }
}
