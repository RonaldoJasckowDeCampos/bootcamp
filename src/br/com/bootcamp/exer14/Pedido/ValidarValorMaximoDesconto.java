package br.com.bootcamp.exer14.Pedido;

public class ValidarValorMaximoDesconto implements ValidarPedido{

    @Override
    public void validar(Pedido pedido) {
        double totalPedido = pedido.getTotal();
        double totalDesconto = pedido.getTotalDesconto();
        double valorDescontoMaximo = totalPedido*pedido.getVendedor().getDescontoMax()/100;
        if(totalDesconto > valorDescontoMaximo ){
            System.out.println("valor de desconto maior do q podia");
        }
    }
}

