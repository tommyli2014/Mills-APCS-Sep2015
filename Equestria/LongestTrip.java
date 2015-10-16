
/**
 * Write a description of class LongestTrip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongestTrip
{
    public static void main(String[] args){
        longestTrip(0,0,1,1,3,4,7,8);
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
