package br.com.bootcamp.exer14.cliente;
import java.util.List;

public interface DAOCliente {
    List<Cliente> buscarTodos();
    Cliente read( Integer id );
    Cliente create(Cliente cliente);
    boolean delete(Integer id);
    Cliente upDate(Cliente cliente);
}
