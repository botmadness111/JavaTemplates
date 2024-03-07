package _6.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new WhiteCreature();
        abstractFactory.createDog().getName();

    }
}
