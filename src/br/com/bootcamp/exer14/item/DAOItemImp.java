package br.com.bootcamp.exer14.item;

import br.com.bootcamp.exer14.Pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DAOItemImp implements DAOItem {

    List<Item> sqlListItem = new ArrayList<>();

    @Override
    public List<Item> buscarTodos() {
        return sqlListItem;
    }

    @Override
    public Item read(Integer id) {
        for ( Item item : sqlListItem){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    @Override
    public Item create(Item item) {
        item.setId(sqlListItem.size()+ 1);
        sqlListItem.add(item);
        return item;
    }

    @Override
    public boolean delete(Integer id) {
        for (int i = 0; i < sqlListItem.size(); i++) {
            if (sqlListItem.get(i).getId().equals(id)) {
                sqlListItem.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Item upDate(Item item) {
        for (int i = 0; i < sqlListItem.size(); i++) {
            if (sqlListItem.get(i).getId().equals(item.getId())) {
                sqlListItem.set(i, item);
                return item;
            }
        }
        return null;
    }
}
