package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoVenda extends OperacaoLoja {
    private final String nomeProduto;
    private final int quantidade;
    
    public OperacaoVenda(String nomeProduto, int quantidade) {
        super();
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\nVendido " + quantidade + " unidade(s) de " + nomeProduto + ".\n\n";
    }
}