package br.com.bootcamp.exer14.vendedor;

import java.util.List;

public interface DAOVendedor {
    List<Vendedor> buscarTodos();
    Vendedor read( Integer id );
    Vendedor create(Vendedor vendedor);
    boolean delete(Integer id);
    Vendedor upDate(Vendedor vendedor);

}
