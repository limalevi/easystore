package org.levilima.easystore.control;

import java.util.LinkedList;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;

/**
*
* @author levi
*/
public class Funcionarios {
    private static final long serialVersionUID = 1L;
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    public static int CODIGO = 1;
    private static final String ARQUIVO_DADOS = "funcionarios.dat";
}