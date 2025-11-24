import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rain here.
 * this is the rain class, doesn nothing much
 * leon
 * 1.1
 */
public class rain extends Actor
{
    /**
     * Act - do whatever the rain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        turnTowards(getX(),getY()+1);
        move(1);
    }
}
