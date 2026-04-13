package CursoJava.aExercicios200.capitulo7Exercicio128;

public class ContaBancaria {
    String numeroDaConta;
    double saldo;

    public ContaBancaria(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public  void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Saldo: " + saldo);
        }else{
            System.out.println("Valor menor que zero");
        }
    }

    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("909129384", 291.00 );

        conta1.depositar(10);

    }
}
