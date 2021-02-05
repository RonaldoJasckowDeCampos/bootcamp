package br.com.bootcamp.exer14.Pedido;

import br.com.bootcamp.exer14.item.Item;

import java.util.List;

public class PedidoItem  {
     private Integer id;
     private Item item;
     private Integer quantidade;
     private double valorUnitario;
     private double valorDesconto;

     public double getValorTotal(){
        return (quantidade*valorUnitario-valorDesconto);
     }
     public double getValorTotalSemDesconto(){
         return(quantidade*valorUnitario);
     }

     public Integer getQuantidade() {
          return quantidade;
     }

     public double getValorUnitario() {
          return valorUnitario;
     }

     public double getValorDesconto() {
          return valorDesconto;
     }

     public PedidoItem(Integer id, Item item, Integer quantidade, double valorUnitario, double valorDesconto) {
          this.id = id;
          this.item = item;
          this.quantidade = quantidade;
          this.valorUnitario = valorUnitario;
          this.valorDesconto = valorDesconto;
     }
}
