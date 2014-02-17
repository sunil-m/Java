package Duck;

public class DuckSim {
    public static void main(String args[]) {
    	MyDuck mall = new MallardDuck();
    	mall.performFly();
    	mall.performQuack();
    	
    	MyDuck model = new ModelDuck();
    	model.performFly();
    	model.setFlyBehaviour(new RocketFly());
    	model.performFly();
    }
}
