package br.com.bootcamp.exer11;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Exer11 {
    public static void main(String[] args) {
        Proprietario ronaldo = new Proprietario("Ronaldo","113463",
                777,"ADALIAS",179,"novo horizonte","pato branco","2929378","casa");
       Carro relampagoMarquinhos = new Carro(51,220,
               5,7,"golzim",
               "preto", LocalDate.of(1997, Month.APRIL,1),"volks","33h3h3h2",2,ronaldo);
   relampagoMarquinhos.acelera(relampagoMarquinhos);
   relampagoMarquinhos.trocaMarcha(relampagoMarquinhos);
        relampagoMarquinhos.trocaMarcha(relampagoMarquinhos);
        relampagoMarquinhos.trocaMarcha(relampagoMarquinhos);
        relampagoMarquinhos.trocaMarcha(relampagoMarquinhos);
        relampagoMarquinhos.trocaMarcha(relampagoMarquinhos);

    }
}
