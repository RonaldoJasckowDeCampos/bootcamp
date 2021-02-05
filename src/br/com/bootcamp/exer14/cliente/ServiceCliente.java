package br.com.bootcamp.exer14.cliente;

import br.com.bootcamp.exer14.item.Item;

import java.util.List;

public interface ServiceCliente {

    List<Cliente> buscarTodos();

    Cliente read(Integer id);

    Cliente create(Cliente cliente);

    boolean delete(Integer id);

    Cliente upDate(Cliente cliente);



}
