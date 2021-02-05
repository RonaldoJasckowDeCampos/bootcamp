package br.com.bootcamp.exer14.vendedor;

import br.com.bootcamp.exer14.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DAOVendedorImp implements DAOVendedor{

    List<Vendedor> sqlVendedor = new ArrayList<>();

    @Override
    public List<Vendedor> buscarTodos() {
        return sqlVendedor;
    }

    @Override
    public Vendedor read(Integer id) {
        for (Vendedor vendedor : sqlVendedor){
            if(vendedor.getId().equals(id)){
                return vendedor;
            }
        }
        return null;
    }

    @Override
    public Vendedor create(Vendedor vendedor) {
        vendedor.setId(sqlVendedor.size()+ 1);
        sqlVendedor.add(vendedor);
        return vendedor;
    }

    @Override
    public boolean delete(Integer id) {
        for (int i = 0; i < sqlVendedor.size(); i++) {
            if (sqlVendedor.get(i).getId().equals(id)) {
                sqlVendedor.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Vendedor upDate(Vendedor vendedor) {
        for (int i = 0; i < sqlVendedor.size(); i++) {
            if (sqlVendedor.get(i).getId().equals(vendedor.getId())) {
                sqlVendedor.set(i, vendedor);
                return vendedor;
            }
        }
        return null;
    }
}
