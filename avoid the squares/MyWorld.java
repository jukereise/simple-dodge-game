import greenfoot.*;

public class MyWorld extends World
{
    private int rainTimer = 0;

    public MyWorld()
    {    
        super(600, 400, 1);

        addObject(new player(), 300, 350);
    }

    public void act()
    {
        rainTimer++;

        // spawn every 10 seconds (600 frames)
        if (rainTimer >= 600) {
            spawnRain();
            rainTimer = 0;
        }
    }

    private void spawnRain()
    {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;

        addObject(new rain(), x, y);
    }
}
