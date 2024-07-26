
import java.util.Scanner;

public class Raiz_cuadrada {
   public static void main(String[] args) {
      
    int numero;
    double raiz;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Dame un numero entero: ");
    numero=teclado.nextInt();

    raiz=Math.sqrt(numero);

    System.out.println("La raiz de "+numero+" es igual a "+raiz);
   }
    
}