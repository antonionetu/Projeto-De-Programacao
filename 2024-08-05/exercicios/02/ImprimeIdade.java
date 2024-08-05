import java.util.Scanner;

public class ImprimeIdade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade:");

        int idade;
        idade = scanner.nextInt();

        System.out.println("Voce tem " + idade + " anos.");
    }
}
