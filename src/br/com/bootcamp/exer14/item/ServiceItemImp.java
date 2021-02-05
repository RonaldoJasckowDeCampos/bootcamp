package br.com.bootcamp.exer14.item;

import java.util.List;

public class ServiceItemImp implements DAOItem {
    private DAOItem daoItem;
    @Override
    public List<Item> buscarTodos() {
        return daoItem.buscarTodos();
    }

    @Override
    public Item read(Integer id) {
        return daoItem.read(id);
    }

    @Override
    public Item create(Item item) {
        return daoItem.create(item);
    }

    @Override
    public boolean delete(Integer id) {
        return daoItem.delete(id);
    }

    @Override
    public Item upDate(Item item) {
        return daoItem.upDate(item);
    }
}
