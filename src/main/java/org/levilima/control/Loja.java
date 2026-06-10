package org.levilima.control;

/**
 *
 * @author levi
 */
import java.util.ArrayList;
import org.levilima.model.Produto;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static int CODIGO = 1;
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public ArrayList<Produto> getProduto() {
        return this.produtos;
    }
}