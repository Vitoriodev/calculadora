import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora");

        while (true){

            Scanner input = new Scanner(System.in);

            System.out.println("qual tipo de resultado vai escolher");

            System.out.print("soma digite 1, multiplicação digite 2, ");

            System.out.println("divisão digite 3, subtração digite 4.");
            int tipo = input.nextInt();

            switch (tipo){
                case 1:
                    System.out.println("você escolheu a Soma");
                    // Em construção...
                    break;
                case 2:
                    System.out.println("você escolheu a Multiplicação");
                    // Em construção...
                    break;
                case 3:
                    System.out.println("você escolheu a divisão");
                    // Em construção...
                    break;
                case 4:
                    System.out.println("você escolheu a Subtração");
                    // Em construção...
                    break;
                default:
                    System.out.println("essa opção não exister");
                    break;

            }

        }

    }

}