package org.levilima.easystore.control;

import org.levilima.easystore.model.Produto;
import org.levilima.easystore.model.ItemCarrinho;
import java.util.LinkedList;

/**
*
* @author levi
*/
public class Carrinho {
    private LinkedList<ItemCarrinho> itens = new LinkedList<ItemCarrinho>();
    
    public void adicionarProduto(Produto produto, int quantidade) {
        for(ItemCarrinho item : itens) {
            if(item.getProduto().getCodigo() == produto.getCodigo()) {
                item.setQuantidadeSelecionada(item.getQuantidadeSelecionada() + quantidade);
                return;
            }
        }
        
        itens.add(new ItemCarrinho(produto, quantidade));
    }
    
    public void removerItem(int codigoProduto) {
        itens.removeIf(item -> item.getProduto().getCodigo() == codigoProduto);
    }
    
    public void limparCarrinho() {
        itens.clear();
    }
    
    public double calcularTotal() {
        double total = 0;
        
        for(ItemCarrinho item : itens)
            total += item.getSubTotal();
        
        return total;
    }
    
    public LinkedList<ItemCarrinho> getItens() {
        return itens;
    }
}