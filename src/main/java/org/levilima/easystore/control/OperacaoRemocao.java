package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoRemocao extends OperacaoLoja {
    private final String nomeProduto;
    
    public OperacaoRemocao(String nomeProduto) {
        super();
        this.nomeProduto = nomeProduto;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\n" + nomeProduto + " foi removido do catálogo\n\n";
    }
}