import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int speed = 5;
    public int vspeed = 2;
    public int level = 1;
    public int tePort = 0;
    public int tePort2 = 0;
    public int tePort3 = 0;
    public int tePort4 = 0;
    public int walking = 0;
    public int down = 1;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        Actor ground = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
        Actor finish = getOneObjectAtOffset(0,getImage().getHeight()/2, Finish.class);
        Actor wall = getOneObjectAtOffset(0,getImage().getHeight()/2, Wall.class);
        Actor teleporter = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter.class);
        Actor teleporter2 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter2.class);
        Actor teleporter3 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter3.class);
        Actor teleporter4 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter4.class);
        Actor teleporter5 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter5.class);
        Actor teleporterEnd = getOneObjectAtOffset(0,getImage().getHeight()/2, TeleporterEnd.class);
        Actor deathTeleporter = getOneObjectAtOffset(0,getImage().getHeight()/2, DeathTeleporter.class);
        Actor slide = getOneObjectAtOffset(0,getImage().getHeight()/2, Slide.class);
        Actor platform = getOneObjectAtOffset(0,getImage().getHeight()/2, Platform.class);
        if((ground != null ||  finish != null || teleporter != null || platform != null))
        {
            vspeed = 0;

        }else{
            fall();
        }
        if((slide != null ))
        {
            vspeed = 0;
            move(3);
            setImage("roll.png");

        }

        if((platform != null ))
        {

            setLocation(getX(), getY() - 2);

        }
        if(vspeed == 0 && !Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("down") && slide == null && (ground != null || platform != null))
        {
            setImage("stand.png");
        }
        Actor enemy = getOneObjectAtOffset(0, 0, Enemy.class);
        Actor enemy2 = getOneObjectAtOffset(0,0, Enemy2.class);
        Actor enemy3 = getOneObjectAtOffset(0,0, Enemy3.class);
        Actor enemy4 = getOneObjectAtOffset(0,0, Enemy4.class);
        Actor enemy5 = getOneObjectAtOffset(0,0, Enemy5.class);
        Actor enemy6 = getOneObjectAtOffset(0,0, Enemy6.class);
        Actor wallH = getOneObjectAtOffset(0,0, WallH.class);
        if(wall != null || (getY() > 790) || enemy != null || enemy2 != null || wallH != null || enemy3 != null || enemy4 != null || enemy5 != null)
        {
            die();
        }
        nextLevel();

        if(teleporter != null)
        {
            tPort();
        }
        if(teleporter2 != null || teleporter3 != null ||  deathTeleporter != null)
        {
            tPort2();
        }
        if(teleporter4 != null)
        {
            setLocation(220, 350);
        }
        if(teleporter5 != null)
        {
            setLocation(1130,436);
        }
        if(teleporterEnd != null)
        {
            tPort4();
        }
        
    }

    public void checkKeys() 
    {
        Actor slide = getOneObjectAtOffset(0,getImage().getHeight()/2, Slide.class);
        if((Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) && slide == null)
        {
            setLocation(getX() - speed, getY());
            if(walking > 10)
            {
                setImage("walk1.png");
            }
            if(walking > 25)
            {
                setImage("walk3.png");
            }

            if(walking > 40)
            {
                walking = 0;
            }
            walking = walking + 1;
        }
        if((Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) && slide == null)
        {
            setLocation(getX() + speed, getY());
            if(walking > 10)
            {
                setImage("walk1.png");
            }
            if(walking > 25)
            {
                setImage("walk3.png");
            }

            if(walking > 40)
            {
                walking = 0;
            }
            walking = walking + 1;
        }
        Actor ground = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
        Actor finish = getOneObjectAtOffset(0,getImage().getHeight()/2, Finish.class);
        Actor platform = getOneObjectAtOffset(0,getImage().getHeight()/2, Platform.class);
        if ((Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("w")) && (ground!= null || finish != null || platform != null))

        {
            vspeed = -15;
            fall();
        }
        if((Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) && slide == null)
        {
            setImage("duck.png");
            down = 2;
        }
        if(Greenfoot.isKeyDown("up"))
        {
            down = 1;
        }
    } 

    public void die()
    {
        
        setLocation(97,61);
        
            
        
        
        tePort2 = 0;
        tePort = 0;
        if (level == 1)
        {
            Level01 thisWorld = (Level01) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 2)
        {
            Level02 thisWorld = (Level02) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 3)
        {
            Level03 thisWorld = (Level03) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 4)
        {
            Level04 thisWorld = (Level04) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 5)
        {
            Level05 thisWorld = (Level05) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 6)
        {
            Level06 thisWorld = (Level06) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 7)
        {
            Level07 thisWorld = (Level07) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 8)
        {
            Level08 thisWorld = (Level08) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
        }
        else if (level == 9)
        {
            Level09 thisWorld = (Level09) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 10)
        {
            Level10 thisWorld = (Level10) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }
        }
        else if (level == 11)
        {
            Level11 thisWorld = (Level11) getWorld();
            Counter theScore = thisWorld.getCounter();
            theScore.bumpCount(-1);
            if(theScore.totalScore < 1)
            {
                theScore.totalScore = 3;
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level01(this));
                level = 1;
                tePort = 0;
                tePort2 = 0;
            }        
        }
        
    }

    public void fall() 
    {
        setLocation(getX(), getY()+vspeed);
        vspeed = vspeed + 1;
        setImage("fall.png");
    }

    public void nextLevel()
    {
        Actor finish = getOneObjectAtOffset(0,getImage().getHeight()/2, Finish.class);

        if(finish != null)
        {
            if(level == 1)
            {
                getWorld().removeObjects(getWorld().getObjects(null));
                Greenfoot.setWorld(new Level02(this));
                level = 2;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 2)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level03(this));
                level = 3;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 3)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level04(this));
                level = 4;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 4)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level05(this));
                level = 5;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 5)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level06(this));
                level = 6;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 6)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level07(this));
                level = 7;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 7)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level08(this));
                level = 8;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 8)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level09(this));
                level = 9;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 9)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level10(this));
                level = 10;
                tePort = 0;
                tePort2 = 0;
            }
            else if(level == 10)
            {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new Level11(this));
                level = 11;
                tePort = 0;
                tePort2 = 0;
            }
        }
    }

    public void tPort()
    {
        Actor player;
        if(tePort == 0)     
        {
            setLocation(1157, 431);
            vspeed = 0;
            tePort = 1;
        }
        else if(tePort == 1)
        {
            setLocation(79, 721);
            vspeed = 0;
            tePort = 2;
        }
        else if(tePort == 2)
        {
            setLocation(1096,31);
            vspeed = 0;
            tePort = 3;
        }

    }

    public void tPort2()
    {
        Actor player;
        Actor teleporter3 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter3.class);
        Actor teleporter4 = getOneObjectAtOffset(0,getImage().getHeight()/2, Teleporter4.class);
        Actor deathTeleporter = getOneObjectAtOffset(0,getImage().getHeight()/2, DeathTeleporter.class);
        if(tePort2 == 0)     
        {
            setLocation(37,339);
            vspeed = 0;
            tePort2 = 1;
        }
        else if(tePort2 == 1)
        {
            setLocation(52,743);
            vspeed = 0;
            tePort2 = 2;
        }
        else if(tePort2 == 2)
        {
            setLocation(1158,31);
            vspeed = 0;
            tePort2 = 3;
        }
        if(teleporter3 != null)     
        {
            setLocation(74,750);
            vspeed = 0;

        }
        if(deathTeleporter != null)     
        {
            setLocation(80,697);
            vspeed = 0;

        }
    }

    void tPort4()
    {
        if(tePort4 == 0)
        {
            setLocation(224,684);
            vspeed = 0;
            tePort4 = 1;
        }
        else if(tePort4 == 1)
        {
            setLocation(373,685);
            vspeed = 0;
            tePort4 = 2;
        }
        else if(tePort4 == 2)
        {
            setLocation(523,685);
            vspeed = 0;
            tePort4 = 3;
        }else if(tePort4 == 3)
        {
            setLocation(673,686);
            vspeed = 0;
            tePort4 = 4;
        }else if(tePort4 == 4)
        {
            setLocation(822,686);
            vspeed = 0;
            tePort4 = 5;
        }else if(tePort4 == 5)
        {
            setLocation(970,685);
            vspeed = 0;
            tePort4 = 7;
        }else if(tePort4 == 6)
        {
            setLocation(1118,685);
            vspeed = 0;
            tePort4 = 7;
        }else if(tePort4 == 7)
        {
            setLocation(74,683);
            vspeed = 0;
            tePort4 = 0;
        }
    }
}
