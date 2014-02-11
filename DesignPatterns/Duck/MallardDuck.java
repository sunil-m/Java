package Duck;

public class MallardDuck extends MyDuck
{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
