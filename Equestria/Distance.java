
/**
 * Write a description of class Distance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Distance
{
    public static void main(String[] args){
        System.out.println("distance 1 = " + distance(0,2,0,2));
        
    }
    
    public static double distance(int x1, int x2, int y1, int y2){
        double d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        return d;
    }
}
