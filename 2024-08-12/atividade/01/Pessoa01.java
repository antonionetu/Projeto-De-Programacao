public class Pessoa01 {
    private String Nome;
    private int Idade;
    private double Altura;

    public void imprimeNome()
    {
        System.out.println("Nome: " + this.Nome + "\nIdade: " + this.Idade + "\nAltura: " + this.Altura);
    }

    public void setNome(String nomePessoa)
    {
        this.Nome = nomePessoa;
    }

    public void setIdade(int idadePessoa)
    {
        this.Idade = idadePessoa;
    }

    public void setAltura(double alturaPessoa)
    {
        this.Altura = alturaPessoa;
    }

    public String getNome()
    {
        return Nome;
    }

    public int getIdade()
    {
        return Idade;
    }

    public double getAltura()
    {
        return Altura;
    }

}
