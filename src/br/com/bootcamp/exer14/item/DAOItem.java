package br.com.bootcamp.exer14.item;

import br.com.bootcamp.exer14.Pedido.Pedido;

import java.util.List;

public interface DAOItem {
    List<Item> buscarTodos();
    Item read( Integer id );
    Item create(Item item);
    boolean delete(Integer id);
    Item upDate(Item item);
}
