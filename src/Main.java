import java.util.Scanner;

public class Main {

    public static void Soma(Scanner input){

        try{
            System.out.print("pode começar\n digite os numeros para soma.");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float soma;

            soma = num1 + num2;
            System.out.println("primeiro numero "+num1+" segundo numero "+num2+" a soma é "+soma);

        } catch (Exception e) {
            System.out.println("você não colocou um numero.");
            input.nextLine();

        }
    }

    public static void Multiplicacao(Scanner input){


        try{
            System.out.print("pode começar\n digite os numeros para multiplicação.");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float multiplicacao;

            multiplicacao = num1 * num2;
            System.out.println("primeiro numero "+num1+" segundo numero "+num2+" a multiplicação é "+multiplicacao);

        } catch (Exception e) {
            System.out.println("você não colocou um numero.");
            input.nextLine();
        }
    }

    public static void Divisao(Scanner input){


        try{
            System.out.print("pode começar\n digite os numeros para divisão.");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float divisao;

            divisao = num1 / num2;
            System.out.println("primeiro numero "+num1+" segundo numero "+num2+" a divisão é "+divisao);

        } catch (Exception e) {
            System.out.println("você não colocou um numero.");
            input.nextLine();
        }
    }

    public static void Subtracao(Scanner input){

        try{
            System.out.print("pode começar\n digite os numeros para Subtração.");
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float Subtracao;

            Subtracao = num1 - num2;
            System.out.println("primeiro numero " + num1 + " segundo numero " + num2 + " a Subtração é " + Subtracao);

        } catch (Exception e) {
            System.out.println("você não colocou um numero.");
            input.nextLine();
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("    Calculadora.    ");
        System.out.println("--------------------");

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("qual tipo de resultado vai escolher");

            System.out.print("soma digite 1, multiplicação digite 2, ");
            System.out.println("divisão digite 3, subtração digite 4.");
            int tipo = input.nextInt();


            switch (tipo){
                case 1:
                    System.out.println("você escolheu a Soma");
                    Soma(input);

                    break;
                case 2:
                    System.out.println("você escolheu a Multiplicação");
                    Multiplicacao(input);

                    break;
                case 3:
                    System.out.println("você escolheu a divisão");
                    Divisao(input);

                    break;
                case 4:
                    System.out.println("você escolheu a Subtração");
                    Subtracao(input);

                    break;
                default:
                    System.out.println("essa opção não exister");
                    break;

            }

            System.out.print("Você quer fechar a calculadora? (1) para sim (2) para não: ");
            int fechar = input.nextInt();

            if(fechar == 1){
                System.out.print("ESTAMOS FECHANDO O PROGRAMA!");
                break;
            }

        }

    }

}