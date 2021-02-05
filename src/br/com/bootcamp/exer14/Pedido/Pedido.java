package br.com.bootcamp.exer14.Pedido;

import br.com.bootcamp.exer14.cliente.Cliente;
import br.com.bootcamp.exer14.cliente.FormasDePagamento;
import br.com.bootcamp.exer14.item.Item;
import br.com.bootcamp.exer14.vendedor.Vendedor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataDeCadastro;
    private LocalDate dataDeValidade;
    private LocalDate dataDePrevisãoDeEntrega;
    private String endereçodeEntrega;
    private String  observação;
    private FormasDePagamento formasDePagamento;
    private Item item;
    private List<PedidoItem> pedidoItemList = new ArrayList<>();

    public Pedido(Cliente cliente, Vendedor vendedor, LocalDateTime dataDeCadastro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataDeCadastro = dataDeCadastro;
    }
    public void resumo (Pedido pedido){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDate getDataDePrevisãoDeEntrega() {
        return dataDePrevisãoDeEntrega;
    }

    public void setDataDePrevisãoDeEntrega(LocalDate dataDePrevisãoDeEntrega) {
        this.dataDePrevisãoDeEntrega = dataDePrevisãoDeEntrega;
    }

    public String getEndereçodeEntrega() {
        return endereçodeEntrega;
    }

    public void setEndereçodeEntrega(String endereçodeEntrega) {
        this.endereçodeEntrega = endereçodeEntrega;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public FormasDePagamento getFormasDePagamento() {
        return formasDePagamento;
    }

    public void setFormasDePagamento(FormasDePagamento formasDePagamento) {
        this.formasDePagamento = formasDePagamento;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<PedidoItem> getPedidoItemList() {
        return pedidoItemList;
    }

    public void setPedidoItemList(List<PedidoItem> pedidoItemList) {
        this.pedidoItemList = pedidoItemList;
    }

    public double getTotal(){
        double contador=0;
        for (int i = 0; i <pedidoItemList.size();i++){
            contador += pedidoItemList.get(i).getValorTotal();
        }
            return contador;
    }
    public double getTotalDesconto(){
        double contador=0;
        for (int i = 0; i <pedidoItemList.size();i++){
            contador += pedidoItemList.get(i).getValorDesconto();
        }
        return contador;

    }
}
