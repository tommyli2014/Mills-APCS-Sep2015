
/**
 * This program prints a hour glass.
 * 
 * Tommy Li
 * 9/17/2015
 */
public class HourGlass
{
    public static void main(String[] args) {
        printQuote();
        for(int line = 1; line <= 4; line++){
            for(int i = 0; i <= (line - 1); i++) {
            System.out.print(" ");
        }
        printBackSlash();
            for(int i = 1; i <= (10-2*line); i++) {
            System.out.print(":");
        }
        printSlash();
        System.out.println();
        }
        System.out.println("     ||");
        for(int lineAgain = 5; lineAgain >= 2; lineAgain--){
            for(int j = 1; j <= (lineAgain - 1); j++) {
                System.out.print(" ");
            }
            printSlash();
            for(int j = 1; j <= (12 - 2 * lineAgain); j++) {
               System.out.print(":");
            }
            printBackSlash();
            System.out.println();
        }
    
        printQuote();
    }
    
    public static void printQuote() {
         System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
    
    public static void printBackSlash() {
        System.out.print("\\");
    }
    
    public static void printSlash() {
        System.out.print("/");
    }
}
