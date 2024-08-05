public class PrecoMaca {
    public static void main(String[] args) {
        int macasJoao = 9;
        System.out.println(
            "Joao comprou " + macasJoao + " macas e isso custou: R$" + CalculaPreco(macasJoao)
        );

        int macasMaria = 16;
        System.out.println(
            "Maria comprou " + macasMaria + " macas e isso custou: R$" + CalculaPreco(macasMaria)
        );
    }

    public static double CalculaPreco(int macas) {
        if (macas < 12) {
            return macas * 0.3;
        }
        return macas * 0.25;
    }
}
