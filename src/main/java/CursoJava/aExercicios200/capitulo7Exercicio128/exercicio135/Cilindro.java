package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio135;

public class Cilindro {
    double raio;
    double altura;

    public void calcularVolume(){
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume: " + volume);


    }

    public static void main(String[] args){
        Cilindro cilindro1 = new Cilindro();

        cilindro1.altura = 2;
        cilindro1.raio = 3;

        cilindro1.calcularVolume();
    }
}
