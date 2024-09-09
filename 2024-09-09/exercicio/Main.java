import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[]{
            new Assalariado("Ana", "12345678901", LocalDate.of(1980, 5, 20), "001", "assistente"),
            new Comissionado("Pedro", "23456789012", LocalDate.of(1990, 7, 15), "002", 10000, 5000),
            new Horista("Maria", "34567890123", LocalDate.of(1985, 8, 25), "003", 160)
        };

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println();
        }
    }
}

