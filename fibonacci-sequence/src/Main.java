import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a limit for the fibonacci sequence:");
        int termsToGenerate = scanner.nextInt();

        if (termsToGenerate <=0){
            System.out.println("Please insert a positive number.");
            return;
        }

        int firstReference = 0;
        int secondReference = 1;

        List<Integer> fibonacciSequence = new ArrayList<>(Arrays.asList(firstReference, secondReference));

        for (int i = 0; i < termsToGenerate; i++) {

            int insertion = firstReference + secondReference;

            fibonacciSequence.add(insertion);

            firstReference = secondReference;
            secondReference = insertion;
        }

        System.out.println("***********************");
        System.out.println(fibonacciSequence);
        System.out.println("***********************");
    }
}