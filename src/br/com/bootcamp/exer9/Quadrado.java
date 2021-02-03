package br.com.bootcamp.exer9;

public class Quadrado extends FiguraGeometrica {

    public Quadrado (double lado1,double lado2){
        super(lado1,lado2);
    }

    @Override
    public void getArea() {
        System.out.println(" area total do quadrado é = "+getLado1()*getLado2());
    }
}
