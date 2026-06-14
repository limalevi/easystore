package org.levilima.easystore.control;

/**
 *
 * @author levi
 */
import java.util.ArrayList;
import org.levilima.easystore.model.Produto;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static int CODIGO = 1;
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public ArrayList<Produto> getProduto() {
        return this.produtos;
    }
    
    public boolean removerProduto(int codigo) {
        return produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }
    
    public void editarProduto(int codigo) {
        for(Produto produto : produtos) {
            if(codigo == produto.getCodigo()) {
                System.out.println("O produto existe!");
            } else {
                System.out.println("O produto não existe!");
                return;
            }
        }
    }
}