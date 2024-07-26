
import java.util.Scanner;



public class Palindromo {
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);

       String palabra;

       System.out.println("Dame una palabra: ");
       palabra=teclado.nextLine();

       String  palindromo="";
       

       for (int i=palabra.length()-1;i>=0;i--){
         palindromo=palindromo+palabra.charAt(i);  
       }
       if(palabra.equals(palindromo)){
        System.out.println("Es un palindromo");
       } else {
        System.out.println("No es un palindromo");
       }
    }
}
