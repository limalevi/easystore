package org.levilima.easystore.control;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
*
* @author levi
*/
public class GerenciadorRelatorios {
    private static final String ARQUIVO = "relatorios.txt";
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
            arquivo.readAllLines();
            arquivo.close();
            System.out.println("Relatório carregado com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao carregar o relatório: " + e.getMessage());
        }
    }
}