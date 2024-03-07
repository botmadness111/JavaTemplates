package _6.Builder;

public record Dog(int age, String color) {
    public void inf() {
        System.out.println("age: " + Integer.toString(age) + ", color: " + color);
    }
}
