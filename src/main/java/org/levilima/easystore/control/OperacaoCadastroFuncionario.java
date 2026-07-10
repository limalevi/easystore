package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoCadastroFuncionario extends OperacaoLoja {
    private final String nomeFuncionario;
    
    public OperacaoCadastroFuncionario(String nomeFuncionario) {
        super();
        this.nomeFuncionario = nomeFuncionario;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\n" + nomeFuncionario + " foi adicionado a lista de funcionários.\n\n";
    }
}