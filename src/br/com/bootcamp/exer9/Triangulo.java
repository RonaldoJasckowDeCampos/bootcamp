package br.com.bootcamp.exer9;

public class Triangulo extends FiguraGeometrica {

    public Triangulo (double lado1,double lado2){
        super(lado1,lado2);
    }

    @Override
    public void getArea() {
        System.out.println("area total do triangulo é = "+getLado1() *getLado2() / 2);
    }
}
