package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoAdicao extends OperacaoLoja {
    private final String nomeProduto;
    private final int quantidade;
    
    public OperacaoAdicao(String nomeProduto, int quantidade) {
        super();
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\nAdicionado " + quantidade + " unidade(s) de " + nomeProduto + "\n\n";
    }
}