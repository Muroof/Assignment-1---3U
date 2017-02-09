
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         // creating city for robot to roam
             City kitchener = new City();
        
        // creating some robots
            Robot jerrycan = new Robot(kitchener, 0, 0, Direction.SOUTH);
            Robot will = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
            // creating obstacle
            new Wall(kitchener, 0, 1, Direction.WEST);
            new Wall(kitchener, 1, 1, Direction.WEST);
            new Wall(kitchener, 1, 1, Direction.SOUTH);
            
            // navigating jerrycan and will
            
            jerrycan.move();
            will.move();
            will.turnLeft();
            will.move();
            will.turnLeft();
            will.turnLeft();
            will.turnLeft();
            will.move();
            will.turnLeft();
            will.turnLeft();
            will.turnLeft();
            jerrycan.move(); 
            jerrycan.turnLeft();
            will.move();
            jerrycan.move();
            
           
            
            
    }
}
