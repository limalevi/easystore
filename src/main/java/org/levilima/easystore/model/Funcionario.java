package org.levilima.easystore.model;

import java.io.Serializable;
import org.levilima.easystore.control.Funcionarios;

/**
*
* @author levi
*/
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome, email;
    private int id = 1, cpf, telefone;
    
    public Funcionario(int id, String nome, String email,  int cpf, int telefone) {
        setId(Funcionarios.ID);
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
        setTelefone(telefone);
        ++Funcionarios.ID;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }
}