package CursoJava.aExercicios200.capitulo7Exercicio128.exercicio134;

public class Retangulo {
    double largura;
    double altura;

    public void area(){
        double area = largura * altura;
        System.out.println("Área: " + area);
    }

    public void perimetro(){
        double perimetro = largura + largura + altura + altura;
        System.out.println("Perimetro: " + perimetro);
    }

    public static void main(String[] args){
        Retangulo retangulo1 =new Retangulo();
        retangulo1.altura = 9;
        retangulo1.largura = 19;

        retangulo1.area();

        retangulo1.perimetro();
    }
}
