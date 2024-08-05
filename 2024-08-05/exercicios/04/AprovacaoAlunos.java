public class AprovacaoAlunos {
    public static void main(String[] args){
        double nota1Aluno1 = 10.0;
        double nota2Aluno1 = 6.0;

        double nota1Aluno2 = 6.0;
        double nota2Aluno2 = 4.0;

        if (Aprovado(nota1Aluno1, nota2Aluno1)) {
            System.out.println("O Aluno 1 está APROVADO");
        } else {
            System.out.println("O Aluno 1 está REPROVADO");
        }

        if (Aprovado(nota1Aluno2, nota2Aluno2)) {
            System.out.println("O Aluno 2 está APROVADO");
        } else {
            System.out.println("O Aluno 2 está REPROVADO");
        }
    }

    public static boolean Aprovado(double nota1, double nota2){
        return (nota1 + nota2)/2 > 6;
    }
}

