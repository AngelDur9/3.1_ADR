
import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Dame el prmer numero: ");
        num1 = teclado.nextInt();

        System.out.println("Dame el segundo numero: ");
        num2 = teclado.nextInt();

        while (num2!=0){
            int N = num2; 
            num2 = num1 % num2;
            num1 = N;
        }
        System.out.println("El MCD es "+num1);
    }
}
