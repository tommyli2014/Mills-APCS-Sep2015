
/**
 * Write a description of class TheBee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheBee
{
    public static void main(String[] args){
        spaces(17);
        score(13);
        System.out.println();
        spaces(16);
        System.out.println("/      |      \\");
        spaces(15);
        System.out.println("|       |       |");
        spaces(15);
        System.out.println("|       |       |");
        spaces(6);
        System.out.print("/   /");
        spaces(7);
        System.out.println("|      |      |");
        spaces(5);
        System.out.print("/      \\");
        spaces(6);
        System.out.println("|       |       |");
        spaces(4);
        System.out.println("/        \\");
        spaces(6);
        System.out.println("\\       /");
    }
    
    public static void spaces(int space){
        for(int i = 1; i<=space; i++){
            System.out.print(" ");
        }
    }
    
    public static void slashes(int slash){
        for(int i = 1; i<=slash; i++){
            System.out.print("/");
        }
    }
    
    public static void backSlashes(int backslash){
        for(int i = 1; i<=backslash; i++){
            System.out.print("\\");
        }
    }
    
    public static void score(int underscore){
        for(int i=1; i<=underscore; i++){
            System.out.print("_");
        }
    }
   
    
}
