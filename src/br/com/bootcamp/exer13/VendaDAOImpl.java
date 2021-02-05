//package br.com.bootcamp.exer13;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class VendaDAOImpl {
//    private final List<Venda> vendas = new ArrayList<>();
//
//    public List<Venda> buscarTodos(){return vendas;}
//
//    public Venda buscar(Long id){
//        for(Venda venda : vendas){
//           if (vendas.getId().equals(id)){
//                return venda;
//            }
//        }
//        return null;
//    }
//    public Venda inserir(Venda objeto){
//        objeto.setId(Long.valueOf(vendas.size()+1));
//        vendas.add(objeto);
//        return objeto;
//    }
//    public Venda alterar(Venda objeto){
//        for (int j = 0; j < vendas.size();j++){
//            if(vendas.get(i).getId().equals(objeto.getId())){
//            vendas.set(i,objeto);
//            return objeto;
//            }
//        }
//        return null;
//    }
//    public void excluir(long id){
//        for( int i = 0; i < vendas.size();i++){
//            if(vendas.get(i)).getId().equals(id);{
//                vendas.remove(i);
//                break;
//            }
//        }
//    }
//    public Long totalVendas(LocalDate dataInicial, LocalDate dataFinal){
//        return vendas.stream().filter(venda -> LocalDateUtil.between(venda.getData()),dataInicial,dataFinal)).cout();
//
//    }
//
//}
