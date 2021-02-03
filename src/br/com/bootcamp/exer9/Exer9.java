package br.com.bootcamp.exer9;

public class Exer9 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5, 5);
        Relatorio relatorio = new Relatorio();
        relatorio.gerando(quadrado);
       Retangulo retangulo = new Retangulo(5,7);
       Relatorio relatorio1 = new Relatorio();
       relatorio1.gerando(retangulo);
       Triangulo triangulo = new Triangulo(5,7);
       Relatorio relatorio2 = new Relatorio();
       relatorio2.gerando(triangulo);

    }
}
