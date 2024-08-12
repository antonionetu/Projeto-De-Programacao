public class Main {
    public static void main(String[] args){
        Elevador elevador = new Elevador(10, 5);
        
        System.out.println(elevador.andar_atual);
        elevador.sobeAndar();
        System.out.println(elevador.andar_atual);
    }
}

