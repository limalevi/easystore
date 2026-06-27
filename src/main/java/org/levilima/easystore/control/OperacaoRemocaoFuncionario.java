package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoRemocaoFuncionario extends OperacaoLoja {
    private final String nomeFuncionario;
    
    public OperacaoRemocaoFuncionario(String nomeFuncionario) {
        super();
        this.nomeFuncionario = nomeFuncionario;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\n" + nomeFuncionario + " foi removido da lista de funcionários.\n\n";
    }
}