package br.com.levilima.easystore;

/**
 *
 * @author levi
 */

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    public static int CODIGO = 1;
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
}