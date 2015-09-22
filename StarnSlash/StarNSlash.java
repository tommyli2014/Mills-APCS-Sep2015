
/**
 * This program prints the output for PP 2.1
 * 
 * Tommy Li 
 * 9/21/15
 */
public class StarNSlash
{
    
    public static void main(String[] args){
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7-i; j++){
           System.out.print("*");
        }
            for(int space=1; space<= i; space++){
            System.out.print(" ");
        }
        for(int k=1; k<=15-i*2; k++){
            System.out.print("/");
        }
        for(int l= 1; l<=i-1; l++){
            System.out.print("\\\\");
        }
        for(int space=1; space<= i; space++){
            System.out.print(" ");
        }
        for(int j=1; j<=7-i; j++){
           System.out.print("*");
        }
        System.out.println();
    }
}


   
}

