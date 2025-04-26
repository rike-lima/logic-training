import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int number = scanner.nextInt();

       boolean prime = true;

       if (number <=1){
           prime = false;
       } else {
           for (int i = 2; i <= Math.sqrt(number); i++) {
               if (number % i == 0){
                   prime = false    ;
                   break;
               }
           }

           if (prime){
               System.out.println(number + " é um número primo.");
           } else {
               System.out.println(number + " não é um número primo");
           }
       }
    }
}