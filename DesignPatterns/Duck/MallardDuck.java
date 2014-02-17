package Duck;

public class MallardDuck extends MyDuck
{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    
    public void display() {
    	System.out.println(" I M mallard");
    }
}
