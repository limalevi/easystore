package org.levilima.easystore.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
*
* @author levi
*/
public class Relatorios {
    private static final String ARQUIVO = "relatorio.txt";
    String conteudo = "";
    
    public String gerarData() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date data = new Date();
        String dataHora = formatoData.format(data);
        
        return dataHora + "\n";
    }
    
    public void gerarAdição(String nome, int quantidade) {
        conteudo += gerarData() + "Adicionado " + quantidade + " " + nome + ".\n\n";
    }
    
    public void gerarRemocao(String nome, int quantidade) {
        conteudo += gerarData() + "Removido " + quantidade + " " + nome + ".\n\n";
    }
    
    public void gerarEdicao(int codigo) {
        conteudo += gerarData() + "Produto de código " + codigo + " editado.\n\n";
    }
    
    public String getText() {
        return this.conteudo;
    }
    
    public void salvarRelatorios() {
        try {
            FileWriter arquivo = new FileWriter(ARQUIVO);
            arquivo.write(conteudo);
            arquivo.close();
            System.out.println("Relatórios salvo com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao salvar os relatórios: " + e.getMessage());
        }
    }
    
    public void carregarRelatorios() {
        try {
            FileReader arquivo = new FileReader(ARQUIVO);
            conteudo = arquivo.readAllAsString();
            arquivo.close();
            System.out.println("Relatório carregado com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao carregar o relatório: " + e.getMessage());
        }
    }
}