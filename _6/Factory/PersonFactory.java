package _6.Factory;

public class PersonFactory {
    public Person createPerson(String name) {
        switch (name) {
            case "Gosha":
                return new Gosha();
            case "Stepa":
                return new Stepa();
            default:
                return null;
        }
    }
}
