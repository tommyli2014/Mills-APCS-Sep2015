
/**
 * Write a description of class DistanceAndAngle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceAndAngle
{
    public static void main(String[] args){
        
    }
    
    public static double distanceNangle(int x1, int y1, int x2, int y2, int x3, int y3){
        double firstNsecond;
        double secondNthird;
        double firstNthird;
        double cityAangle;
        double cityBangle;
        double cityCangle;
        
        firstNsecond = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        secondNthird = Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2));
        firstNthird = Math.sqrt(Math.pow(x3-x1,2)+ Math.pow(y3-y1,2));
        
        cityAangle = Math.toDegrees(Math.acos((Math.pow(firstNsecond,2)+Math.pow(firstNthird,2)-Math.pow(secondNthird,2))/(2*firstNsecond*firstNthird)));
        cittBangle = Math.toDegrees(Math.acos((Math.pow(firstNsecond,2)+Math.pow(secondNthird,2)-Math.pow(firstNthird,2))/(2*firstNsecond*secondNthird)));
        cityCangle = Math.toDegrees(Math.acos((Math.pow(secondNthird,2)+Math.pow(firstNthird,2)-Math.pow(firstNsecond,2))/(2*secondNthird*firstNthird)));
        
        System.out.println("The distance between first and second destination is " + firstNsecond + ".");
        System.out.println("The distance between second and third destination is " + secondNthird + ".");
        System.out.println("The distance between first and third destination is " + firstNthird + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
