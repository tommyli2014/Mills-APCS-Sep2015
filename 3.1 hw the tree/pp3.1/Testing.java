
/**
 * Write a description of class Testing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testing
{
    public static void main(String[] args){
        drawTree(6,4);
        drawTree(6,6);
    }
    
    public static void drawTree(int segment, int line){
        for(int a = 1; a <= segment; a++){
            for(int b = 1; b <= line; b++){
                for(int i = 1; i <= (segment+line-a-b); i++){
                    System.out.print(" ");
                }
                
                for(int j = 1; j <= ((b-1)*2+1+2*(a-1)); j++){
                   System.out.print("*");
                }
                System.out.println();
            }
        }
        bottom(segment, line);
    }
    
    public static void bottom(int segment, int line){
        for(int i=1; i <= ((line-1)*2+1+2*(segment-1))/2; i++){
         System.out.print(" ");
        }
        System.out.println("*");
        for(int j=1; j <= ((line-1)*2+1+2*(segment-1))/2; j++){
         System.out.print(" ");
        }
        System.out.println("*");
        for(int l=1; l <= ((line-1)*2+1+2*(segment-1))/2-3; l++){
         System.out.print(" ");
        }
        System.out.println("*******");
    }
}
