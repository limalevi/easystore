package org.levilima.easystore.view;

import com.formdev.flatlaf.FlatLightLaf;
import org.levilima.easystore.model.Produto;
import org.levilima.easystore.control.Loja;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author levi
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private Loja loja = new Loja();
    
    public JanelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        loja.carregarDados();
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEasyStore = new JLabel();
        menuSuperior = new JPanel();
        btnAdicionarProduto = new JButton();
        btnEditarProduto = new JButton();
        btnExcluirProduto = new JButton();
        separador1 = new JSeparator();
        menuLateral = new JPanel();
        btnProdutos = new JButton();
        btnCarrinho = new JButton();
        btnClientes = new JButton();
        btnRelatorios = new JButton();
        btnSair = new JButton();
        conteudoPrincipal = new JPanel();
        msgBoasVindas = new JPanel();
        lblBoasVindas = new JLabel();
        produtos = new JPanel();
        scrollPane = new JScrollPane();
        tabelaProdutos = new JTable();
        relatorios = new JPanel();
        scrollPane2 = new JScrollPane();
        txtRelatorios = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyStore");
        setBounds(new Rectangle(180, 50, 0, 0));
        setMinimumSize(new Dimension(1000, 560));
        setName("frame"); // NOI18N
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblEasyStore.setFont(new Font("Liberation Sans", 0, 24)); // NOI18N
        lblEasyStore.setForeground(new Color(0, 51, 255));
        lblEasyStore.setText("EasyStore");
        lblEasyStore.setVerticalAlignment(SwingConstants.TOP);

        btnAdicionarProduto.setIcon(new ImageIcon("/home/levi/NetBeansProjects/EasyStore/img/icons8-add-24.png")); // NOI18N
        btnAdicionarProduto.setToolTipText("Adicionar um produto");
        btnAdicionarProduto.addActionListener(this::btnAdicionarProdutoActionPerformed);

        btnEditarProduto.setIcon(new ImageIcon("/home/levi/NetBeansProjects/EasyStore/img/icons8-edit-24.png")); // NOI18N
        btnEditarProduto.setToolTipText("Editar um produto");
        btnEditarProduto.addActionListener(this::btnEditarProdutoActionPerformed);

        btnExcluirProduto.setIcon(new ImageIcon("/home/levi/NetBeansProjects/EasyStore/img/icons8-delete-24.png")); // NOI18N
        btnExcluirProduto.setToolTipText("Excluir um produto");
        btnExcluirProduto.addActionListener(this::btnExcluirProdutoActionPerformed);

        separador1.setOrientation(SwingConstants.VERTICAL);

        GroupLayout menuSuperiorLayout = new GroupLayout(menuSuperior);
        menuSuperior.setLayout(menuSuperiorLayout);
        menuSuperiorLayout.setHorizontalGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuSuperiorLayout.createSequentialGroup()
                .addComponent(btnAdicionarProduto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProduto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirProduto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuSuperiorLayout.setVerticalGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuSuperiorLayout.createSequentialGroup()
                .addGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(separador1, GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarProduto, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirProduto, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProduto, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(this::btnProdutosActionPerformed);

        btnCarrinho.setText("Carrinho");

        btnClientes.setText("Clientes");

        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(this::btnRelatoriosActionPerformed);

        btnSair.setBackground(new Color(255, 0, 0));
        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        GroupLayout menuLateralLayout = new GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(menuLateralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnProdutos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCarrinho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorios, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLateralLayout.setVerticalGroup(menuLateralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(btnProdutos, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarrinho, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorios, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        );

        conteudoPrincipal.setPreferredSize(new Dimension(635, 326));
        conteudoPrincipal.setLayout(new CardLayout());

        msgBoasVindas.setLayout(new GridBagLayout());

        lblBoasVindas.setFont(new Font("Liberation Sans", 0, 48)); // NOI18N
        lblBoasVindas.setForeground(new Color(204, 204, 204));
        lblBoasVindas.setText("EasyStore");
        msgBoasVindas.add(lblBoasVindas, new GridBagConstraints());

        conteudoPrincipal.add(msgBoasVindas, "msgBoasVindas");

        tabelaProdutos.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Categoria", "Validade", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, Integer.class, Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(tabelaProdutos);

        GroupLayout produtosLayout = new GroupLayout(produtos);
        produtos.setLayout(produtosLayout);
        produtosLayout.setHorizontalGroup(produtosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        produtosLayout.setVerticalGroup(produtosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, produtosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );

        conteudoPrincipal.add(produtos, "produtos");

        txtRelatorios.setEditable(false);
        txtRelatorios.setColumns(20);
        txtRelatorios.setRows(5);
        scrollPane2.setViewportView(txtRelatorios);

        GroupLayout relatoriosLayout = new GroupLayout(relatorios);
        relatorios.setLayout(relatoriosLayout);
        relatoriosLayout.setHorizontalGroup(relatoriosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        relatoriosLayout.setVerticalGroup(relatoriosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        conteudoPrincipal.add(relatorios, "relatorios");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEasyStore, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLateral, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(conteudoPrincipal, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(menuSuperior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblEasyStore)
                    .addComponent(menuSuperior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conteudoPrincipal, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuLateral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        CardLayout cardLayout = (CardLayout) conteudoPrincipal.getLayout();
        
        cardLayout.show(conteudoPrincipal, "produtos");
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnSairActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionarProdutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        JanelaAdicaoProduto janelaAdicaoProduto = new JanelaAdicaoProduto(loja, this);
        janelaAdicaoProduto.setLocationRelativeTo(this);
        janelaAdicaoProduto.setVisible(true);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int linhaSelecionada = tabelaProdutos.getSelectedRow();
        
        if(linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um produto!");
            return;
        }
        
        int codigo = (int) tabelaProdutos.getValueAt(linhaSelecionada, 0);
        
        Produto produtoSelecionado = null;
        for(Produto produto : loja.getProduto()) {
            if(codigo == produto.getCodigo()) {
                produtoSelecionado = produto;
                break;
            }
        }
        
        JanelaRemocaoProduto janelaRemocaoProduto = new JanelaRemocaoProduto(loja, this, produtoSelecionado);
        janelaRemocaoProduto.setLocationRelativeTo(this);
        janelaRemocaoProduto.setVisible(true);
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        int linhaSelecionada = tabelaProdutos.getSelectedRow();
        
        if(linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um produto!");
            return;
        }
        
        int codigo = (int) tabelaProdutos.getValueAt(linhaSelecionada, 0);
        
        Produto produtoSelecionado = null;
        for(Produto produto : loja.getProduto()) {
            if(codigo == produto.getCodigo()) {
                produtoSelecionado = produto;
                break;
            }
        }
        
        JanelaEdicaoProduto janelaEdicaoProduto = new JanelaEdicaoProduto(loja, this, produtoSelecionado);
        janelaEdicaoProduto.setLocationRelativeTo(this);
        janelaEdicaoProduto.setVisible(true);
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        loja.salvarDados();
    }//GEN-LAST:event_formWindowClosing

    private void btnRelatoriosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        CardLayout cardLayout = (CardLayout) conteudoPrincipal.getLayout();
        
        cardLayout.show(conteudoPrincipal, "relatorios");
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> new JanelaPrincipal().setVisible(true));
    }
    
    public void atualizarTabela() {
        javax.swing.table.DefaultTableModel tabela = (javax.swing.table.DefaultTableModel) tabelaProdutos.getModel();
        
        tabela.setRowCount(0);
        
        for(Produto produto : loja.getProduto()) {
            tabela.addRow(new Object[]{
                produto.getCodigo(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getValidade(),
                produto.getQuantidade(),
                produto.getPreco()
            });
        }
    }
    
    public String gerarData() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date data = new Date();
        String dataHora = formatoData.format(data);
        
        return dataHora + "\n";
    }
    
    String conteudo = "";
    
    public void gerarRelatorio(String nome, int quantidade) {
        conteudo += gerarData() + "Adicionado " + quantidade + " " + nome + ".\n\n";
        
        txtRelatorios.setText(conteudo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAdicionarProduto;
    private JButton btnCarrinho;
    private JButton btnClientes;
    private JButton btnEditarProduto;
    private JButton btnExcluirProduto;
    private JButton btnProdutos;
    private JButton btnRelatorios;
    private JButton btnSair;
    private JPanel conteudoPrincipal;
    private JLabel lblBoasVindas;
    private JLabel lblEasyStore;
    private JPanel menuLateral;
    private JPanel menuSuperior;
    private JPanel msgBoasVindas;
    private JPanel produtos;
    private JPanel relatorios;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane2;
    private JSeparator separador1;
    private JTable tabelaProdutos;
    private JTextArea txtRelatorios;
    // End of variables declaration//GEN-END:variables
}