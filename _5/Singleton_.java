package _5;

public class Singleton_ {
    private static Singleton_ instance;
    public static synchronized Singleton_ getInstance() {
        if(instance == null) {
            instance = new Singleton_();
            return instance;
        }
        return instance;
    }

}
