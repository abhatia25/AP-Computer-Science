import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    public int totalScore = 3;
    public int score = totalScore;
    public Counter()
    {
        setImage(new GreenfootImage("lives: " + totalScore + " ", 20, Color.GREEN, Color.RED));
    }
    
    public void bumpCount(int amount)
    {
        totalScore = totalScore + amount;
        setImage(new GreenfootImage("Lives: " + totalScore + " ", 20, Color.GREEN, Color.RED));
    }
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }    
}
