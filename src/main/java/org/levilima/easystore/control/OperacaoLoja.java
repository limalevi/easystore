package org.levilima.easystore.control;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* @author levi
*/
public abstract class OperacaoLoja {
    private final String dataHora;
    
    public OperacaoLoja() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        dataHora = formato.format(new Date());
    }
    
    public String getDataHora() {
        return dataHora;
    }
    
    public abstract String gerarTextoLog();
}