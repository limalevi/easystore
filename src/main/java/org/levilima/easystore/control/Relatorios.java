package org.levilima.easystore.control;

<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;

=======
>>>>>>> parent of 7f975ca (updated: métodos gerar data e gerar relatório movidos para a classe relatórios)
/**
*
* @author levi
*/
public class Relatorios {
<<<<<<< HEAD
    String conteudo = "";
    
    public String gerarData() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date data = new Date();
        String dataHora = formatoData.format(data);
        
        return dataHora + "\n";
    }
    
    public String gerarRelatorio(String nome, int quantidade) {
        conteudo += gerarData() + "Adicionado " + quantidade + " " + nome + ".\n\n";
        
        return conteudo;
    }
=======

>>>>>>> parent of 7f975ca (updated: métodos gerar data e gerar relatório movidos para a classe relatórios)
}