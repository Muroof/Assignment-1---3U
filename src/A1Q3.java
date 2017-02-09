
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        // creating city for robot to roam
             City kitchener = new City();
        
        // creating a robot
            Robot jerrycan = new Robot(kitchener, 3, 0, Direction.EAST);
   
        // creating mountain
            new Wall(kitchener, 3, 2, Direction.WEST);
            new Wall(kitchener, 3, 2, Direction.NORTH);
            new Wall(kitchener, 2, 3, Direction.WEST);
            new Wall(kitchener, 1, 3, Direction.WEST);
            new Wall(kitchener, 1, 3, Direction.NORTH);
            new Wall(kitchener, 1, 3, Direction.EAST);
            new Wall(kitchener, 2, 4, Direction.NORTH);
            new Wall(kitchener, 2, 4, Direction.EAST);
            new Wall(kitchener, 3, 4, Direction.EAST);
            
        // spawning flag
            
            new Thing(kitchener, 3, 1);
          
        
        // navigating the robot to climb mountain and place flag at peak
        
            jerrycan.move();
            
            jerrycan.pickThing();           // picking up flag
            
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            
            jerrycan.putThing();            // placing flag at peak
            
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
    }
}
