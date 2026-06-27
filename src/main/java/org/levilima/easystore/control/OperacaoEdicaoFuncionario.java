package org.levilima.easystore.control;

/**
*
* @author levi
*/
public class OperacaoEdicaoFuncionario extends OperacaoLoja {
    private final int idFuncionario;
    
    public OperacaoEdicaoFuncionario(int idFuncionario) {
        super();
        this.idFuncionario = idFuncionario;
    }
    
    @Override
    public String gerarTextoLog() {
        return getDataHora() + "\nOs dados do funcionário ID " + idFuncionario + " foram editados.\n\n";
    }
}