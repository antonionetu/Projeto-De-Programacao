public class Pessoa {
    private Universidade Universidade;
    private String Nome;
    private String CPF;
    private String DataNascimento;

    public void setNome(String nome)
    {
        this.Nome = nome;
    }

    public void setCPF(String cpf)
    {
        this.CPF = cpf;
    }

    public void setDataNasc(String dataNasc)
    {
        this.DataNascimento = dataNasc;
    }

    public void setUniversidade(Universidade universidade)
    {
        this.Universidade = universidade;
    }


    public String getNome()
    {
        return this.Nome;
    }

    public String getCPF()
    {
        return this.CPF;
    }

    public String getDataNasc()
    {
        return this.DataNascimento;
    }

    public Universidade getUniversidade()
    {
        return this.Universidade;
    }
}
