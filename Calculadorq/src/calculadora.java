import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        double resultado = 0;

        System.out.print("Calculadora\n");

        System.out.println("\nDigite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Operação (+, -, *, /, %): ");
        char operacao = sc.next().charAt(0);

        System.out.println("\nDigite o segundo número: ");
        num2 = sc.nextInt();

        switch (operacao){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado " + resultado);
    }
}
