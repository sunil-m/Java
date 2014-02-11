package Duck;

public class MyDuck
{
    static QuackBehaviour quackBehaviour;
    static FlyBehaviour flyBehaviour;

    public static void display() {
        System.out.println("DISPLAY");
    }

    public static void performFly() {
        flyBehaviour.fly();
    }
    public static void performQuack() {
        quackBehaviour.quack();
    }

    public static void swim() {
        System.out.println("Swimming");
    }
}
