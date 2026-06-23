package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoEdicao extends OperacaoLoja {
    private final int codigoProduto;
    
    public OperacaoEdicao(int codigoProduto) {
        super();
        this.codigoProduto = codigoProduto;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\nO produto de código " + codigoProduto + " foi editado.\n\n";
    }
}