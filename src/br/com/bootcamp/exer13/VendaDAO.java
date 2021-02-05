package br.com.bootcamp.exer13;

import java.time.LocalDate;

public interface VendaDAO {
    Venda buscar(long id);
    Venda inserir(Venda objeto);
    Venda alterar(Venda objeto);
    void excluir(long id);

    Long totalVendas(LocalDate dataInicial,LocalDate dataFinal);

}
