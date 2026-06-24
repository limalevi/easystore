package org.levilima.easystore.model;

import org.levilima.easystore.control.Loja;
import java.io.Serializable;

/**
 *
 * @author levi
 */
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codigo = 1, quantidade;
    private double preco;
    private String nome, categoria, validade;
    
    public Produto(String nome, String categoria, int quantidade, String validade, double preco) {
        setNome(nome);
        setCategoria(categoria);
        setQuantidade(quantidade);
        setValidade(validade);
        setPreco(preco);
        setCodigo(Loja.CODIGO);
        ++Loja.CODIGO;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0)
            this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }
}