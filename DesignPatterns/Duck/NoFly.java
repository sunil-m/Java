package Duck;
public class NoFly implements FlyBehaviour
{
    @Override
    public void fly()
    {
        System.out.println("NO FLYING");
    }

}
