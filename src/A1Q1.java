
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creating city for robot to roam
             City kitchener = new City();
        
        // creating a robot
            Robot jerrycan = new Robot(kitchener, 1, 3, Direction.WEST);
   
        // creating sqaure
            new Wall(kitchener, 2, 2, Direction.NORTH);
            new Wall(kitchener, 2, 2, Direction.WEST);
            new Wall(kitchener, 3, 2, Direction.WEST);
            new Wall(kitchener, 3, 2, Direction.SOUTH);
            new Wall(kitchener, 3, 3, Direction.SOUTH);
            new Wall(kitchener, 3, 3, Direction.EAST);
            new Wall(kitchener, 2, 3, Direction.EAST);
            new Wall(kitchener, 2, 3, Direction.NORTH);
        
        // navigating the robot around the sqaure
        
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            jerrycan.move();
            jerrycan.move();
            jerrycan.turnLeft();
            jerrycan.move();
            
            
            
            
    }       
}
