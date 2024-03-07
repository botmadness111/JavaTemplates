package _6.Builder;

public class Builder {
    private String color="black";
    private int age=10;

    void setColor(String color){
        this.color = color;
    }

    void setAge(int age){
        this.age = age;
    }

    Dog build(){
        return new Dog(age, color);
    }
}
