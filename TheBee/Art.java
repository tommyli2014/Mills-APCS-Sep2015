
/**
 * Prints ART
 * 
 * Tommy 
 * 10/2/15
 */
public class Art
{
    public static void main(String[] args){
        space(10);
        letterA(4);
        System.out.println();
        
        space(9);
        letterA(6);
        System.out.println();
        
        space(7);
        letterA(3);
        space(4);
        letterA(3);
        space(4);
        letterR(4);
        space(5);
        letterR(2);
        space(5);
        System.out.println();
        
        space(7);
        letterA(3);
        space(4);
        letterA(3);
        space(3);
        letterR(12);
        space(5);
        letterT(3);
        System.out.println();
        
        fiveNsix();
        fiveNsix();
        
        sevenNeight();
        
        nineTothirteen();
        nineTothirteen();
        
        fourteenTosixteen();
        fourteenTosixteen();
        
        seventeenTonineteen();
        seventeenTonineteen();
        
        lastTwo();
        lastTwo();
    }
    
    public static void letterA(int letters){
        for(int i=1; i<=letters; i++){
            System.out.print("A");
        }
    }
    
    public static void letterR(int letters){
        for(int i=1; i<=letters; i++){
            System.out.print("R");
        }
    }
    
    public static void letterT(int letters){
        for(int i=1; i<=letters; i++){
            System.out.print("T");
        }
    }
    
    public static void space(int spaces){
        for(int i=1; i<=spaces; i++){
            System.out.print(" ");
        }
    }
    
    public static void fiveNsix(){
        space(7);
        letterA(3);
        space(4);
        letterA(3);
        space(3);
        letterR(2);
        space(2);
        letterR(2);
        space(11);
        letterT(3);
        System.out.println();
    }
    
    public static void sevenNeight(){
        space(6);
        letterA(3);
        space(6);
        letterA(3);
        space(2);
        letterR(12);
        space(5);
        letterT(3);
        System.out.println();
    }
    
    public static void nineTothirteen(){
        space(6);
        letterA(3);
        space(6);
        letterA(3);
        space(19);
        letterT(3);
        System.out.println();
    }
    
    public static void fourteenTosixteen(){
        space(5);
        letterA(14);
        space(18);
        letterT(3);
        System.out.println();
    }
    
    public static void seventeenTonineteen(){
        space(5);
        letterA(3);
        space(8);
        letterA(3);
        space(18);
        letterT(3);
        System.out.println();
    }
    
    public static void lastTwo(){
        space(4);
        letterA(4);
        space(8);
        letterA(4);
        space(11);
        letterT(15);
        System.out.println();
    }
}
