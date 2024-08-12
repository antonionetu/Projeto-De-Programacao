public class App {
    public static void main(String[] args) throws Exception {        
        Universidade universidade1 = new Universidade();
        universidade1.setNome("Princeton");

        Universidade universidade2 = new Universidade();
        universidade2.setNome("Cambridge");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro");
        pessoa1.setCPF("06190881205");
        pessoa1.setUniversidade(universidade1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Antonio");
        pessoa2.setCPF("06190881805");
        pessoa2.setUniversidade(universidade2);

        System.out.println(pessoa1.getUniversidade().NomeUniversidade);
        System.out.println(pessoa2.getUniversidade().NomeUniversidade);

    }
}
