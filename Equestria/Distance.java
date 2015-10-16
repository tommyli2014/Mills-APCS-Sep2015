
/**
 * Write a description of class Distance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Distance
{
    public static void main(String[] args){
        distance(0,0,3,4);
    }
    
    public static void distance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The distance between the two cities is " + distance);
    }
}
