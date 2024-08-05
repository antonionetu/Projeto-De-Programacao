class GaloesEmLitros {
    public static void main(String[] args) {
        int galoes = 10;
        System.out.println(galoes + " em litros sao: " + Converte(galoes));
    }
    
    public static double Converte(double galoes){
        return galoes * 3.7854;
    }
}
