import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level10 extends World
{
    private Counter ourScore;
    public Counter getCounter()
    {
        return ourScore;
    }
    /**
     * Constructor for objects of class Level10.
     * 
     */
    public Level10()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public Level10(Player player)
    {
        super(1200, 800, 1); 
        player.vspeed = 0;
        prepare();


        addObject(player,97,25);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ourScore = new Counter();
        addObject(ourScore,66,17);;
        Ground ground = new Ground();
        addObject(ground,640,787);
        Ground ground2 = new Ground();
        addObject(ground2,782,787);
        Wall wall = new Wall();
        addObject(wall,882,772);
        Ground ground3 = new Ground();
        addObject(ground3,984,788);
        Wall wall2 = new Wall();
        addObject(wall2,1035,774);
        Platform platform = new Platform();
        addObject(platform,1094,781);
        Finish finish = new Finish();
        addObject(finish,985,159);
        finish.setLocation(861,262);

        Slide slide = new Slide();
        addObject(slide,25,200);
        Slide slide2 = new Slide();
        addObject(slide2,50,225);
        Slide slide3 = new Slide();
        addObject(slide3,75,250);
        Slide slide4 = new Slide();
        addObject(slide4,100,275);
        Slide slide5 = new Slide();
        addObject(slide5,125,300);
        Slide slide6 = new Slide();
        addObject(slide6,150,325);
        Slide slide7 = new Slide();
        addObject(slide7,175,350);
        Slide slide8 = new Slide();
        addObject(slide8,200,375);
        Slide slide9 = new Slide();
        addObject(slide9,225,400);
        Slide slide10 = new Slide();
        addObject(slide10,250,425);
        Slide slide11 = new Slide();
        addObject(slide11,275,450);
        Slide slide12 = new Slide();
        addObject(slide12,300,475);
        Slide slide13 = new Slide();
        addObject(slide13,325, 500);
        Slide slide14 = new Slide();
        addObject(slide14,350,525);
        Slide slide15 = new Slide();
        addObject(slide15,375,550);
        Slide slide16 = new Slide();
        addObject(slide16,400,575);
        Slide slide17 = new Slide();
        addObject(slide17,425,600);
        Slide slide18 = new Slide();
        addObject(slide18,450,625);
        Slide slide19 = new Slide();
        addObject(slide19,475,650);
        Slide slide20 = new Slide();
        addObject(slide20,500,675);
        Slide slide21 = new Slide();
        addObject(slide21,525,700);
        Color color = new Color();
        addObject(color,99,701);
        Color color2 = new Color();
        addObject(color2,299,701);
        Color color3 = new Color();
        addObject(color3,407,705);
        color3.setLocation(482,780);
        Color color4 = new Color();
        addObject(color4,482,780);
        Color color5 = new Color();
        addObject(color5,98,505);
        Color color6 = new Color();
        addObject(color6,6,306);
        color5.setLocation(106,408);
        Color color7 = new Color();
        addObject(color7,106,408);
        Color color8 = new Color();
        addObject(color8,231,537);
        Color color9 = new Color();
        addObject(color9,280,628);
        color5.setLocation(69,502);
        Color color10 = new Color();
        addObject(color10,69,502);
        Color color11 = new Color();
        addObject(color11,365,713);
        removeObject(wall);
        removeObject(wall2);
        Wall wall3 = new Wall();
        addObject(wall3,884,798);

        platform.setLocation(1124,797);
    }
}
