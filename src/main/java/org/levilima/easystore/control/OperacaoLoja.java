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
        this.dataHora = formato.format(new Date());
    }
    
    public String getDataHora() {
        return this.dataHora;
    }
    
    public abstract String gerarTextoLog();
}