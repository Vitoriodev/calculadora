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

                    try{
                        System.out.print("pode começar\n digite os numeros para soma.");
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        int soma;

                        soma = num1 + num2;
                        System.out.println("primeiro numero "+num1+" segundo numero"+num2+" a soma é "+soma);

                    } catch (Exception e){
                        System.out.println("você não colocou um numero.");

                    }

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

            // frecha o programa em construção...

        }

    }

}