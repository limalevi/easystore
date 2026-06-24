package org.levilima.easystore.model;

/**
*
* @author levi
*/
public class ItemCarrinho {
    private final Produto produto;
    private int quantidadeSelecionada;
    
    public ItemCarrinho(Produto produto, int quantidadeSelecionada) {
        this.produto = produto;
        this.quantidadeSelecionada = quantidadeSelecionada;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidadeSelecionada() {
        return quantidadeSelecionada;
    }
    
    public void setQuantidadeSelecionada(int quantidadeSelecionada) {
        this.quantidadeSelecionada = quantidadeSelecionada;
    }
    
    public double getSubTotal() {
        return produto.getPreco() * quantidadeSelecionada;
    }
}