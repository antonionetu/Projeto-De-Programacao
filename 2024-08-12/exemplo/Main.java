public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";
        pessoa1.idade = 22;

        pessoa1.getNome();
        pessoa1.getIdade();
        pessoa1.fala();

        pessoa1.setNome("Maria");
        pessoa1.setIdade(45);

        pessoa1.getNome();
        pessoa1.getIdade();
        pessoa1.fala();
    }
}
