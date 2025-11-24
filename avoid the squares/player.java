import greenfoot.*;

public class player extends Actor
{
    public void act()
    {
        // movement
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 10, getY());
        }
        
        if(Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 10, getY());
        }

        // touch rain... go to lose screen
        if (isTouching(rain.class)) {
            Greenfoot.setWorld(new losescreen());
        }
    }
}
