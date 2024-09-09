public class Comissionado extends Funcionario {
    private double valorVendasVestuario;
    private double valorVendasCalcado;

    public Comissionado(String nome, String cpf, LocalDate dataNascimento, String matricula,
                        double valorVendasVestuario, double valorVendasCalcado) {
        super(nome, cpf, dataNascimento, matricula);
        this.valorVendasVestuario = valorVendasVestuario;
        this.valorVendasCalcado = valorVendasCalcado;
    }

    @Override
    public double calcularSalario() {
        double comissaoVestuario = 0.05 * valorVendasVestuario;
        double comissaoCalcado = 0.07 * valorVendasCalcado;
        return comissaoVestuario + comissaoCalcado;
    }

    public double getValorVendasVestuario() { return valorVendasVestuario; }
    public void setValorVendasVestuario(double valorVendasVestuario) { this.valorVendasVestuario = valorVendasVestuario; }

    public double getValorVendasCalcado() { return valorVendasCalcado; }
    public void setValorVendasCalcado(double valorVendasCalcado) { this.valorVendasCalcado = valorVendasCalcado; }
}

