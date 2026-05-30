package br.com.levilima.easystore;

/**
 *
 * @author levi
 */
public class Produto {
    private int codigo = 1, quantidade;
    double preco;
    private String nome, descricao, categoria, validade;
    
    public Produto(String nome, String descricao, String categoria, int quantidade, String validade, double preco) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setQuantidade(quantidade);
        this.setValidade(validade);
        this.setPreco(preco);
        this.setCodigo(Loja.CODIGO);
        ++Loja.CODIGO;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0) this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValidade() {
        return this.validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        if(preco > 0) this.preco = preco;
    }
    
    public String exibirProduto() {
        String conteudo = "Código: " + this.codigo + " Nome: " + this.nome + " Descrição: " + this.descricao + " Categoria: " + this.categoria + " Validade: " + this.validade + " Preço: " + this.preco;
    
        return conteudo;
    }
}