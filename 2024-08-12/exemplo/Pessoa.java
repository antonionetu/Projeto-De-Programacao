public class Pessoa {
    String nome;
    int idade;

    public void fala(){
        System.out.println("Meu nome e: " + this.nome + " e eu tenho "+ this.idade + " anos!");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
}

