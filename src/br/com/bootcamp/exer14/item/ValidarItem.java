package br.com.bootcamp.exer14.item;

import java.util.List;

public interface ValidarItem {
    boolean valorUnitario(Item item);
    boolean itemInativo(Item item);
    boolean QuantidadeEstoque(Item item);

}
