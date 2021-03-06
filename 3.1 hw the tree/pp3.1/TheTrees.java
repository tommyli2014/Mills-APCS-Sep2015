
/**
 * print out Christmas trees with desired height and segments
 * 
 * Tommy Li 
 * 9/29/15
 * 
 * 
 * Comment: you can print out any tree with the desire segments and heights for each segment by making another drawTree method in the main method
 * for example: you can print out a tree with 3 segment and a height of 4 per segment by typing drawTree(3,4); as shown in the main method
 */ 
public class TheTrees
{
   public static void main(String[] args){
        drawTree(3,4);
        drawTree(2,5);
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