package org.levilima.easystore.control;

import java.util.LinkedList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
*
* @author levi
*/
public class GerenciadorRelatorios {
    private static final String ARQUIVO = "relatorio.txt";
    private final LinkedList<OperacaoLoja> historico = new LinkedList<OperacaoLoja>();
    private String textoAcumulado = "";
    
    public void registrarOperacao(OperacaoLoja operacao) {
        historico.add(operacao);
        textoAcumulado += operacao.gerarTextoLog();
    }
    
    public String getTextoRelatorio() {
        return textoAcumulado;
    }
    
    public void limparHistorico() {
        historico.clear();
        textoAcumulado = "";
    }
    
    public void salvarRelatorio() {
        try {
            FileWriter arquivo = new FileWriter(ARQUIVO);
            arquivo.write(textoAcumulado);
            arquivo.close();
            System.out.println("Relatório salvo com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao salvar o relatório: " + e.getMessage());
        }
    }
    
    public void carregarRelatorio() {
        File arq = new File(ARQUIVO);
        
        if(!arq.exists())
            return;
        
        try {
            FileReader arquivo = new FileReader(ARQUIVO);
            textoAcumulado = arquivo.readAllAsString();
            arquivo.close();
            System.out.println("Relatório carregado com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao carregar o relatório: " + e.getMessage());
        }
    }
}