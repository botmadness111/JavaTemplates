package _5;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);

        Singleton__ singleton__1 = Singleton__.instance;
        Singleton__ singleton__2 = Singleton__.instance;
        System.out.println(singleton__1 == singleton__2);

        Singleton__ value = Singleton__.instance;
        Singleton__ value2 = Singleton__.instance;
        System.out.println(value == value2);
        //sfes
    }
}
