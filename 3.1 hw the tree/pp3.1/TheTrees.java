
/**
 * print out Christmas trees with desired height and segments
 * 
 * Tommy Li 
 * 9/29/15
 */
public class TheTrees
{
    public static void main(String[] args){
        drawTree(3,4);
        bottom();
        drawTree(2,5);
        bottom();
    }
    
    public static void drawTree(int segment, int line){
        for(int a = 1; a <= segment; a++){
            for(int b = 1; b <= line; b++){
                for(int i = 1; i <= (7-a-b); i++){
                    System.out.print(" ");
                }
                
                for(int j = 1; j <= ((b-1)*2+1+2*(a-1)); j++){
                   System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    public static void bottom(){
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  ******* ");
    }
}
