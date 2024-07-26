import java.util.Scanner;

public class Numeros_primos {
    public static void main(String[] args) {
         int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        numero=teclado.nextInt();


        if (numero <=1) {
            System.out.println("false");
        }
            for (int i=2;i<=Math.sqrt(numero);i++){
                if(numero%i==0){
                    System.out.println("false");
                } 
            }
            System.out.println("true");
    }
}
