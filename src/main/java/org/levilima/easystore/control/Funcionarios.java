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
    
    public boolean editarFuncionario(int id, String nome, String email,  int cpf, int telefone) {
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == id) {
                funcionario.setId(id);
                funcionario.setNome(nome);
                funcionario.setEmail(email);
                funcionario.setCpf(cpf);
                funcionario.setTelefone(telefone);
                
                return true;
            }
        }
        
        return false;
    }
    
    public LinkedList<Funcionario> getFuncionario() {
        return funcionarios;
    }
    
    public void salvarDados() {
        try(FileOutputStream fos = new FileOutputStream(ARQUIVO_DADOS);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(funcionarios);
            oos.writeInt(ID);
            
            System.out.println("Lista de funcionários salvo com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao salvar a lista de funcionários: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public void carregarDados() {
        File arquivo = new File(ARQUIVO_DADOS);
        
        if(!arquivo.exists())
            return;
        
        try(FileInputStream fis = new FileInputStream(ARQUIVO_DADOS);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            funcionarios = (LinkedList<Funcionario>) ois.readObject();
            ID = ois.readInt();
            
            System.out.println("Lista de funcionários carregado com sucesso!");
        } catch(IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar a lista de funcionários: " + e.getMessage());
        }
    }
}