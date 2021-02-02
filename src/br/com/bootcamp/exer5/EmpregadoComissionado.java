package br.com.bootcamp.exer5;

public class EmpregadoComissionado extends Empregado{

    private double valorProdutoVendido;
    private double percentualComissao;
    private double valorComissao;

    public EmpregadoComissionado(String nome,
                                 String cpf,
                                 double valorSalarioBase,
                                 double valorImpostos,
                                 double valorProdutoVendido,
                                 double percentualComissao){
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutoVendido = valorProdutoVendido;
        this.percentualComissao = percentualComissao;
        this.valorComissao = valorProdutoVendido * percentualComissao / 100;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public double getValorProdutoVendido() {
        return valorProdutoVendido;
    }

    @Override
    public double calculValorTotalSalario() {
        return getValorSalarioBase() + valorComissao - getValorImpostos();
    }

//    @Override
//    public double getValorSalarioBase() {
//        return super.getValorSalarioBase();
//    }
}
