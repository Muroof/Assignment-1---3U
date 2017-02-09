
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.HashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creating city for robots to roam
             City kitchener = new City();
        
        // creating some robots
            Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
            Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
            
        // labeling karel and maria 
            
            karel.setLabel("K");
            maria.setLabel("M");

        
        // creating obstacle
            new Wall(kitchener, 2, 3, Direction.WEST);
            new Wall(kitchener, 2, 3, Direction.NORTH);
            new Wall(kitchener, 2, 3, Direction.EAST);
            new Wall(kitchener, 3, 3, Direction.EAST);
            new Wall(kitchener, 3, 3, Direction.SOUTH);
            
        // spawning dropped groceries
            
            new Thing(kitchener, 0, 0);
            new Thing(kitchener, 1, 0);
            new Thing(kitchener, 1, 1);
            new Thing(kitchener, 1, 2);
            new Thing(kitchener, 2, 2);
            
            
        // navigating maria and karel
            
            maria.move();
            maria.pickThing();
            
            karel.turnLeft();
            karel.turnLeft();
            karel.move(); 
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.pickThing();   
            
            maria.turnLeft();
            maria.move();
            maria.pickThing();
            
            karel.move();  
            karel.pickThing();
            karel.turnLeft();
            
            maria.turnLeft();
            maria.move();
            maria.pickThing();
            
            
            
            
            
        
        
        
        
        
        
        
        
        
    }
}
