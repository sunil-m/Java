package Duck;

public class Mute implements QuackBehaviour
{
    @Override
    public void quack()
    {
        System.out.println("NO QUACK");
    }

}
