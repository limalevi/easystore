package org.levilima.easystore.control;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* @author levi
*/
public class Relatorios {
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
}