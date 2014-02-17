package Duck;

public class MyDuck
{
    static QuackBehaviour quackBehaviour;
    static FlyBehaviour flyBehaviour;

    public static QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public static void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		MyDuck.quackBehaviour = quackBehaviour;
	}

	public static FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public static void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		MyDuck.flyBehaviour = flyBehaviour;
	}

	public void display() {
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
