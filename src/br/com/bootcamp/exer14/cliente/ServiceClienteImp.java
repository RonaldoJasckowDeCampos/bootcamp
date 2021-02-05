package br.com.bootcamp.exer14.cliente;

import java.util.List;

public class ServiceClienteImp implements ServiceCliente {

    private DAOCliente daoCliente;

    @Override
    public List<Cliente> buscarTodos() {
        return daoCliente.buscarTodos();
    }

    @Override
    public Cliente read(Integer id) {
        return daoCliente.read(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return daoCliente.create(cliente);
    }

    @Override
    public boolean delete(Integer id) {
        return daoCliente.delete(id);
    }

    @Override
    public Cliente upDate(Cliente cliente) {
        return daoCliente.upDate(cliente);
    }
}
