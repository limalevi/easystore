package org.levilima.easystore.control;

/**
 *
 * @author levi
 */
import java.util.LinkedList;
import org.levilima.easystore.model.Produto;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;

public class Loja implements Serializable {
    private static final long serialVersionUID = 1L;
    private LinkedList<Produto> produtos = new LinkedList<Produto>();
    public static int CODIGO = 1;
    private static final String ARQUIVO_DADOS = "dados_loja.dat";
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public LinkedList<Produto> getProduto() {
        return produtos;
    }
    
    public boolean removerProduto(int codigo) {
        return produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }
    
    public boolean editarProduto(int codigo, String nome, String categoria, String vencimento, int quantidade, double preco) {
        for(Produto produto : produtos) {
            if(codigo == produto.getCodigo()) {
                produto.setNome(nome);
                produto.setCategoria(categoria);
                produto.setValidade(vencimento);
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                
                return true;
            }
        }
        
        return false;
    }
    
    public void salvarDados() {
        try(FileOutputStream fos = new FileOutputStream(ARQUIVO_DADOS);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(produtos);
            oos.writeInt(CODIGO);
            
            System.out.println("Dados salvos com sucesso!");
        } catch(IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public void carregarDados() {
        File arquivo = new File(ARQUIVO_DADOS);
        
        if(!arquivo.exists())
            return;
        
        try(FileInputStream fis = new FileInputStream(ARQUIVO_DADOS);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            produtos = (LinkedList<Produto>) ois.readObject();
            CODIGO = ois.readInt();
            
            System.out.println("Dados carregados com sucesso!");
        } catch(IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }
}