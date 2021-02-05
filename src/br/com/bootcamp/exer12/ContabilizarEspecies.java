package br.com.bootcamp.exer12;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {
    public void saveiro(List<Animal> animalList, EspeciesUtil objeto) {// nao é void
        //List<Resultado> resultado = new ArrayList<>();
        Integer contadorAves=0;
        Integer contadorPeixes=0;
        Integer contadorMamiferos=0;
        Integer contadorRepteis=0;
        List<Resultado> resultados = new ArrayList<>();
        List<Especies> listaEspecies =objeto.classificar(animalList);
        for(int i = 0; i< listaEspecies.size();i++) {
            objeto.filtrar(animalList, listaEspecies.get(i));
            if(listaEspecies.get(i).equals(animalList.get(i).getEspecies())){
                //return listaEspecies.get(i).getInformacao().equals(animalList.get(i).getEspecies());

            }
//            Resultado.(animalList.get(i).);
        }


    }
}
