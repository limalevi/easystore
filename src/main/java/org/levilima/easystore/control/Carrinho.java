package org.levilima.easystore.control;

import org.levilima.easystore.model.Produto;
import org.levilima.easystore.model.ItemCarrinho;
import java.util.ArrayList;

/**
*
* @author levi
*/
public class Carrinho {
    private ArrayList<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
    
    public void adicionarProduto(Produto produto, int quantidade) {
        for(ItemCarrinho item : itens) {
            if(item.getProdutos().getCodigo() == produto.getCodigo()) {
                item.setQuantidadeSelecionada(item.getQuantidadeSelecionada() + quantidade);
                return;
            }
        }
        
        itens.add(new ItemCarrinho(produto, quantidade));
    }
}