package br.com.bootcamp.exer14.Pedido;

import br.com.bootcamp.exer14.Pedido.DAOImplementos;
import br.com.bootcamp.exer14.Pedido.Pedido;
import br.com.bootcamp.exer14.Pedido.ServicePedido;

import java.util.List;

public class ServicePedidoImp implements ServicePedido {

    private DAOImplementos dao;
    //private ValidarValorMaximoDesconto validarValorMaximoDesconto;

    public void ServicePedido(DAOImplementos dao) {
        this.dao = dao;
    }

    public ServicePedidoImp(DAOImplementos dao) {
        this.dao = dao;
    }

    @Override
    public List<Pedido> buscarTodos() {

        return dao.buscarTodos();
    }

    @Override
    public Pedido read(Integer id) {

        return dao.read(id);
    }

    @Override
    public Pedido create(Pedido pedido) {
        validar(pedido);
        return dao.create(pedido);
    }

    @Override
    public boolean delete(Integer id) {
        return dao.delete(id);
    }

    @Override
    public Pedido upDate(Pedido pedido) {

        return dao.upDate(pedido);
    }
    public void validar(Pedido pedido){
        new ValidarValorMaximoDesconto().validar(pedido);
    }

}
