package br.com.bootcamp.exer14.cliente;

import br.com.bootcamp.exer14.item.Item;

import java.util.ArrayList;
import java.util.List;

public class DAOClienteImp implements  DAOCliente{

    List<Cliente> sqlCliente = new ArrayList<>();

    @Override
    public List<Cliente> buscarTodos() {
        return sqlCliente;
    }

    @Override
    public Cliente read(Integer id) {
        for ( Cliente cliente : sqlCliente){
            if(cliente.getId().equals(id)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente create(Cliente cliente) {
        cliente.setId(sqlCliente.size()+ 1);
        sqlCliente.add(cliente);
        return cliente;
    }

    @Override
    public boolean delete(Integer id) {
        for (int i = 0; i < sqlCliente.size(); i++) {
            if (sqlCliente.get(i).getId().equals(id)) {
                sqlCliente.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Cliente upDate(Cliente cliente) {
        for (int i = 0; i < sqlCliente.size(); i++) {
            if (sqlCliente.get(i).getId().equals(cliente.getId())) {
                sqlCliente.set(i, cliente);
                return cliente;
            }
        }
        return null;
    }
}
