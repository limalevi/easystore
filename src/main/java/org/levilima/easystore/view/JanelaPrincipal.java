package org.levilima.easystore.view;

import org.levilima.easystore.model.Produto;
import org.levilima.easystore.control.Loja;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author levi
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName());

    private Loja loja = new Loja();
    
    public JanelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEasyStore = new JLabel();
        menuSuperior = new JPanel();
        btnAdicionarProduto = new JButton();
        btnExcluirProduto = new JButton();
        menuLateral = new JPanel();
        btnProdutos = new JButton();
        btnVendas = new JButton();
        btnClientes = new JButton();
        btnRelatorios = new JButton();
        btnSair = new JButton();
        conteudoPrincipal = new JPanel();
        msgBoasVindas = new JPanel();
        lblBoasVindas = new JLabel();
        produtos = new JPanel();
        scrollPane = new JScrollPane();
        tabelaProdutos = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyStore");
        setBounds(new Rectangle(180, 50, 0, 0));
        setMinimumSize(new Dimension(1000, 560));
        setName("frame"); // NOI18N

        lblEasyStore.setFont(new Font("Liberation Sans", 0, 24)); // NOI18N
        lblEasyStore.setForeground(new Color(0, 51, 255));
        lblEasyStore.setText("EasyStore");
        lblEasyStore.setVerticalAlignment(SwingConstants.TOP);

        btnAdicionarProduto.setIcon(new ImageIcon("/home/levi/NetBeansProjects/EasyStore/img/icons8-add-24.png")); // NOI18N
        btnAdicionarProduto.setToolTipText("Adicionar um produto");
        btnAdicionarProduto.addActionListener(this::btnAdicionarProdutoActionPerformed);

        btnExcluirProduto.setIcon(new ImageIcon("/home/levi/NetBeansProjects/EasyStore/img/icons8-delete-24.png")); // NOI18N
        btnExcluirProduto.setToolTipText("Excluir um produto");
        btnExcluirProduto.addActionListener(this::btnExcluirProdutoActionPerformed);

        GroupLayout menuSuperiorLayout = new GroupLayout(menuSuperior);
        menuSuperior.setLayout(menuSuperiorLayout);
        menuSuperiorLayout.setHorizontalGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuSuperiorLayout.createSequentialGroup()
                .addComponent(btnAdicionarProduto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirProduto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuSuperiorLayout.setVerticalGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuSuperiorLayout.createSequentialGroup()
                .addGroup(menuSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarProduto)
                    .addComponent(btnExcluirProduto))
                .addGap(0, 0, 0))
        );

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(this::btnProdutosActionPerformed);

        btnVendas.setText("Vendas");

        btnClientes.setText("Clientes");

        btnRelatorios.setText("Relatórios");

        btnSair.setBackground(new Color(255, 0, 0));
        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        GroupLayout menuLateralLayout = new GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(menuLateralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnProdutos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVendas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorios, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLateralLayout.setVerticalGroup(menuLateralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(btnProdutos, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVendas, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
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
                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        conteudoPrincipal.add(produtos, "produtos");

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
                        .addComponent(conteudoPrincipal, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuLateral, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) conteudoPrincipal.getLayout();
        
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
        JanelaRemocaoProduto janelaRemocaoProduto = new JanelaRemocaoProduto(loja, this);
        janelaRemocaoProduto.setLocationRelativeTo(this);
        janelaRemocaoProduto.setVisible(true);
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAdicionarProduto;
    private JButton btnClientes;
    private JButton btnExcluirProduto;
    private JButton btnProdutos;
    private JButton btnRelatorios;
    private JButton btnSair;
    private JButton btnVendas;
    private JPanel conteudoPrincipal;
    private JLabel lblBoasVindas;
    private JLabel lblEasyStore;
    private JPanel menuLateral;
    private JPanel menuSuperior;
    private JPanel msgBoasVindas;
    private JPanel produtos;
    private JScrollPane scrollPane;
    private JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}