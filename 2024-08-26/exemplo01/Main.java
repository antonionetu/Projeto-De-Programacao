package exemplo01;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Antonio", "Fernandes");
        System.out.println(funcionario.getSalario());

        funcionario.AumentaSalario(2000.50);
        System.out.println(funcionario.getSalario());
    }
}

