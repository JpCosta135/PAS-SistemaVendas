package Service;

import Modelo.Pagamento.Pagamento;

public class PagamentoService {





    public void efetuarPagamento(double valorRecebido, int tipoPagamento){

        FactoryPagamento fabrica = new FactoryPagamento();
        Pagamento p = fabrica.obterFormaPagamento(tipoPagamento, valorRecebido);
        p.autorizar();

    }









}
