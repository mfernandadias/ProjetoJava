package CursoJava.aExercicios200.capitulo6MetodosEFuncoes105;

public class Exercicio123 {
    /*
    conversão de moedas
    crie um método converterRealParaDolar() que receba um valor em reais e
    retorne o valor convertido em dólares. No método main()< exiba o valor convertido.
    Considere a taxa de câmbio fixa 1 dólar = 5,00 reais
     */
    public static double converterRealParaDolar(double valorReal){
        double taxaCambio = 5.0;
        return valorReal / taxaCambio; //retorna o valor convertido
    }
    public static void main(String[] args){

    }
}
