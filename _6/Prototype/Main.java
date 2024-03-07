package _6.Prototype;

public class Main {
    public static void main(String[] args) {
        Sheep blackPrototype = new BlackSheep("Baa Baa");
        Sheep whitePrototype = new WhiteSheep("Fleecy");

        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();

        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    }
}
