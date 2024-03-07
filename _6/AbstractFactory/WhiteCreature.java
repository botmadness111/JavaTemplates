package _6.AbstractFactory;


public class WhiteCreature implements AbstractFactory {
    @Override
    public Dog createDog() {
        return new WhiteDog();
    }

    @Override
    public Person createPerson() {
        return new WhitePerson();
    }
}
