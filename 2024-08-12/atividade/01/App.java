import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        Pessoa01 pessoa1 = new Pessoa01();
        System.out.println("Digite o nome da pessoa: ");
        String nomePessoa = entrada.nextLine(); 
        pessoa1.setNome(nomePessoa);

        System.out.println("Digite a idade da pessoa: ");
        int idadePessoa = entrada.nextInt(); 
        pessoa1.setIdade(idadePessoa);

        System.out.println("Digite a altura da pessoa: ");
        double alturaPessoa = entrada.nextDouble(); 
        pessoa1.setAltura(alturaPessoa);

        pessoa1.imprimeNome();
    }
}
