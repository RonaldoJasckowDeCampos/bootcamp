package br.com.bootcamp.exer14.Pedido;

import br.com.bootcamp.exer14.Pedido.DAO;
import br.com.bootcamp.exer14.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DAOImplementos implements DAO {

 List<Pedido> sqlPedidos = new ArrayList<>();

    @Override
    public List<Pedido> buscarTodos() {

        return sqlPedidos;
    }

    @Override
    public Pedido read(Integer id) {
        for (Pedido pedido : sqlPedidos){
            if(pedido.getId().equals(id)){
                return pedido;
            }
        }
        return null;
    }

    @Override
    public Pedido create(Pedido pedido) {
        pedido.setId(sqlPedidos.size()+ 1);
        sqlPedidos.add(pedido);
        return pedido;
    }

    @Override
    public boolean delete(Integer id) {
        for (int i = 0; i < sqlPedidos.size(); i++) {
            if (sqlPedidos.get(i).getId().equals(id)) {
                sqlPedidos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Pedido upDate(Pedido pedido) {
        for (int i = 0; i < sqlPedidos.size(); i++) {
            if (sqlPedidos.get(i).getId().equals(pedido.getId())) {
                sqlPedidos.set(i, pedido);
                return pedido;
            }
        }
        return null;
    }

}