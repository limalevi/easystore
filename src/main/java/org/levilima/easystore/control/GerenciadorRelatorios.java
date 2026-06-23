package org.levilima.easystore.control;

import java.util.ArrayList;

/**
*
* @author levi
*/
public class GerenciadorRelatorios {
    private final ArrayList<OperacaoLoja> historico = new ArrayList<OperacaoLoja>();
    private String textoAcumulado = "";
    
    public void registrarOperacao(OperacaoLoja operacao) {
        historico.add(operacao);
        this.textoAcumulado += operacao.gerarTextoLog();
    }
    
    public String getTextoRelatorio() {
        return this.textoAcumulado;
    }
    
    public void limparHistorico() {
        this.historico.clear();
        this.textoAcumulado = "";
    }
}