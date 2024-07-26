
import java.util.Scanner;

public class Cambiodecaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String Palabra;
        
        char acambiar, nueva;
        
        System.out.println("Dame una palabra: ");
        Palabra=teclado.nextLine();

        System.out.println("Que letra quieres cambiar: ");
        acambiar=teclado.next().charAt(0);

        System.out.println("por que letra la cambiaras: ");
        nueva=teclado.next().charAt(0);

        System.out.println(Palabra.replace(acambiar, nueva));

    }
}
