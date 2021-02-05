package br.com.bootcamp.exer14.vendedor;

import java.util.List;

public class ServiceVendedorImp implements  DAOVendedor{

    private DAOVendedor daoVendedor;

    @Override
    public List<Vendedor> buscarTodos() {
        return daoVendedor.buscarTodos();
    }

    @Override
    public Vendedor read(Integer id) {
        return daoVendedor.read(id);
    }

    @Override
    public Vendedor create(Vendedor vendedor) {
        return daoVendedor.create(vendedor);
    }

    @Override
    public boolean delete(Integer id) {
        return daoVendedor.delete(id);
    }

    @Override
    public Vendedor upDate(Vendedor vendedor) {
        return daoVendedor.upDate(vendedor);
    }
}
