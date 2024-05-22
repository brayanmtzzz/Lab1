import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escoge el número incial");
        int numeroInicial = in.nextInt();

        System.out.println("Escoge el número máximo");
        int numeroMaximo = in.nextInt();

        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz(); 
        fizzBuzz.print(numeroInicial, numeroMaximo);
    }
}
