package _6.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.build().inf();
        builder.setAge(11);
        builder.setColor("white");
        builder.build().inf();
    }
}
