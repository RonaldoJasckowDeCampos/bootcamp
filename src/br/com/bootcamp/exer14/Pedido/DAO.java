package br.com.bootcamp.exer14.Pedido;

import br.com.bootcamp.exer14.Pedido.Pedido;

import java.util.List;

public interface DAO {
    List<Pedido> buscarTodos();
    Pedido read( Integer id );
    Pedido create(Pedido pedido);
    boolean delete(Integer id);
    Pedido upDate(Pedido pedido);

}
