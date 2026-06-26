package org.levilima.easystore.control;

import java.util.LinkedList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import org.levilima.easystore.model.Funcionario;

/**
*
* @author levi
*/
public class Funcionarios {
    private static final long serialVersionUID = 1L;
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    public static int ID = 1;
    private static final String ARQUIVO_DADOS = "funcionarios.dat";
    
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public boolean removerFuncionario(int id) {
        return funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }
}