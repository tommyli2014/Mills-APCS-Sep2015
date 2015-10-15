
/**
 * Write a description of class RoadTrip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoadTrip
{
    public static void main(String[] args){
        System.out.println("distance is " + roadTrip(10));
    }
    
    public static double roadTrip(int diameter){
        double distance;
        distance = diameter * Math.PI;
        return distance;
    }
}
