package br.com.bootcamp.exer14.item;

public class ValidarPedidoItem implements ValidarItem {
    @Override
    public boolean valorUnitario(Item item) {
        if (item.getValorUnitario() == 0){
            System.out.println("ERROR,Adicione um valor Unitario");
            return false;
        }
        return true;
    }

    @Override
    public boolean itemInativo(Item item) {
        return item.isInativo();
    }

    @Override
    public boolean QuantidadeEstoque(Item item) {
        if(item.getQuantidadeEstoque().equals(0)){
        return true;
        }
        return false;
    }

}
