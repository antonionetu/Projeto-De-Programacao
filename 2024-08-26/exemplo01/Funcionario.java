package exemplo01;

public class Funcionario{
    private String nome;
    private String sobrenome;
    private double salario;

    Funcionario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = 0;
    }

    public void AumentaSalario(double aumento){
        this.salario += aumento;
    }

    public double getSalario(){
        return this.salario;
    }
}

