public class Elevador {
    int andar_atual;
    int total_andares;

    int pessoas_atual;
    int capacidade_maxima;

    Elevador(int total_andares, int capacidade_maxima){
        this.andar_atual = 0;
        this.total_andares = total_andares;

        this.pessoas_atual = 0;
        this.capacidade_maxima = capacidade_maxima;
    }

    public void sobeAndar() {
        if (this.andar_atual < this.total_andares){
            this.andar_atual += 1;
        } else {
            System.out.println("Voce ja esta no andar maximo.");
        }
    }

    public void desceAndar(){
        if (this.andar_atual > 0) {
            this.andar_atual -= 1;
        } else {
            System.out.println("Voce ja esta no Terreo.");
        }
    }

    public void entraPessoas(int qtd_pessoas){
        if (this.pessoas_atual + qtd_pessoas <= capacidade_maxima){
            this.pessoas_atual += qtd_pessoas;
        } else {
            System.out.println("Isso excede a quantidade maxima de pessoas");
        }
    }

    public void saiPessoas(int qtd_pessoas){
        if (this.pessoas_atual - qtd_pessoas <= 0) {
            this.pessoas_atual = 0;
        } else {
            this.pessoas_atual -= qtd_pessoas;
        }
    }
}

