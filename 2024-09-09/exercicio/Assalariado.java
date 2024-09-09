public class Assalariado extends Funcionario {
    private String cargo;

    public Assalariado(String nome, String cpf, LocalDate dataNascimento, String matricula, String cargo) {
        super(nome, cpf, dataNascimento, matricula);
        this.cargo = cargo;
    }

    @Override
    public double calcularSalario() {
        double salarioMinimo = 1212;
        if ("assistente".equalsIgnoreCase(cargo)) {
            return salarioMinimo;
        } else if ("supervisor".equalsIgnoreCase(cargo)) {
            return 2 * salarioMinimo;
        }
        return 0;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}

