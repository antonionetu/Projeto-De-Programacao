public class Horista extends Funcionario {
    private int horasTrabalhadas;

    public Horista(String nome, String cpf, LocalDate dataNascimento, String matricula, int horasTrabalhadas) {
        super(nome, cpf, dataNascimento, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        double valorHora = 55.00;
        return horasTrabalhadas * valorHora;
    }

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
}

