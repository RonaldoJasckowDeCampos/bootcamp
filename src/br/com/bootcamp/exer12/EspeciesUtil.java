package br.com.bootcamp.exer12;

import java.util.List;

public interface EspeciesUtil {
    List<Animal> filtrar(List<Animal> animais, Especies especieFiltrar);
    List<Especies> classificar(List<Animal> animais);
}
