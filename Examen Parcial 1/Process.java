import java.util.Scanner;

public class Process {
    public void iniciarPrograma() {
        Palabras palabras1 = new Palabras("hasta luego cocodrilo");
        Palabras palabras2 = new Palabras("anita lava la tina");

        System.out.println("Operaciones para 'hasta luego cocodrilo':");
        palabras1.primeraMayuscula();
        palabras1.invertirCadena();
        palabras1.vocalesMayuscula();
        palabras1.palindromo();

        System.out.println("\nOperaciones para 'anita lava la tina':");
        palabras2.primeraMayuscula();
        palabras2.invertirCadena();
        palabras2.vocalesMayuscula();
        palabras2.palindromo();

        Extra extra = new Extra();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n¿Quiere ejecutar el método FizzBuzz? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            extra.fizzBuzz();
        }
        scanner.close();
    }
}

