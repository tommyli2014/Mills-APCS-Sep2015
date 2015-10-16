
/**
 * This program contains the solutions for the four Equestria exercises.
 * 
 * Tommy Li
 * 10/13/15
 */
public class Equestria
{
    public static void main(String[] args){
        
    }
    
     public static void distance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The distance between the two cities is " + distance);
    }
    
     public static void roadTrip(int diameter){
        double distance;
        distance = diameter * Math.PI;
        System.out.println("The roadtrip distance is " + distance);
    }
    
     public static void distanceNangle(int x1, int y1, int x2, int y2, int x3, int y3){
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
        cityBangle = Math.toDegrees(Math.acos((Math.pow(firstNsecond,2)+Math.pow(secondNthird,2)-Math.pow(firstNthird,2))/(2*firstNsecond*secondNthird)));
        cityCangle = Math.toDegrees(Math.acos((Math.pow(secondNthird,2)+Math.pow(firstNthird,2)-Math.pow(firstNsecond,2))/(2*secondNthird*firstNthird)));
        
        System.out.println("The distance between first and second destination is " + firstNsecond + ".");
        System.out.println("The distance between second and third destination is " + secondNthird + ".");
        System.out.println("The distance between first and third destination is " + firstNthird + ".");
        System.out.println("The angle formed by the first city with the other two cities is " + cityAangle + ".");
        System.out.println("The angle formed by the first city with the other two cities is " + cityBangle + ".");
        System.out.println("The angle formed by the first city with the other two cities is " + cityCangle + ".");        
    }
    
    public static void longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
       //The following variables are distance between the indicated cities
       double firstNsecond;
       double firstNthird;
       double firstNfourth;
       double secondNthird;
       double secondNfourth;
       double thirdNfourth;
       
       firstNsecond = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
       firstNthird = Math.sqrt(Math.pow(x3-x1,2)+ Math.pow(y3-y1,2));
       firstNfourth = Math.sqrt(Math.pow(x4-x1,2)+ Math.pow(y4-y1,2));
       secondNthird = Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2));
       secondNfourth = Math.sqrt(Math.pow(x4-x2,2)+ Math.pow(y4-y2,2));
       thirdNfourth = Math.sqrt(Math.pow(x4-x3,2)+ Math.pow(y4-y3,2));
       
       double compare1and2 = Math.max(firstNsecond,firstNthird);
       double compare3and4 = Math.max(firstNfourth,secondNthird);
       double compare5and6 = Math.max(secondNfourth,thirdNfourth);
       
       System.out.println("The longest distance between any pair of destinations is " + Math.max(Math.max(compare1and2,compare3and4),compare5and6));
    }
}
