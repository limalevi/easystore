/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.levilima.easystore;

/**
 *
 * @author levi
 */
public class JanelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName());

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEasyStore = new javax.swing.JLabel();
        menuSuperior = new javax.swing.JPanel();
        btnAdicionarProduto = new javax.swing.JButton();
        menuLateral = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        conteudoPrincipal = new javax.swing.JPanel();
        msgBoasVindas = new javax.swing.JPanel();
        lblBoasVindas = new javax.swing.JLabel();
        produtos = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EasyStore");
        setMinimumSize(new java.awt.Dimension(1000, 560));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 560));

        lblEasyStore.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lblEasyStore.setForeground(new java.awt.Color(0, 51, 255));
        lblEasyStore.setText("EasyStore");
        lblEasyStore.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addActionListener(this::btnAdicionarProdutoActionPerformed);

        javax.swing.GroupLayout menuSuperiorLayout = new javax.swing.GroupLayout(menuSuperior);
        menuSuperior.setLayout(menuSuperiorLayout);
        menuSuperiorLayout.setHorizontalGroup(
            menuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSuperiorLayout.createSequentialGroup()
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuSuperiorLayout.setVerticalGroup(
            menuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btnProdutos.setText("Produtos");
        btnProdutos.addActionListener(this::btnProdutosActionPerformed);

        btnVendas.setText("Vendas");

        btnClientes.setText("Clientes");

        btnRelatorios.setText("Relatórios");

        btnSair.setBackground(new java.awt.Color(255, 0, 0));
        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        conteudoPrincipal.setPreferredSize(new java.awt.Dimension(635, 326));
        conteudoPrincipal.setLayout(new java.awt.CardLayout());

        msgBoasVindas.setLayout(new java.awt.GridBagLayout());

        lblBoasVindas.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        lblBoasVindas.setForeground(new java.awt.Color(204, 204, 204));
        lblBoasVindas.setText("EasyStore");
        msgBoasVindas.add(lblBoasVindas, new java.awt.GridBagConstraints());

        conteudoPrincipal.add(msgBoasVindas, "msgBoasVindas");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Descrição", "Categoria", "Validade", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
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

        javax.swing.GroupLayout produtosLayout = new javax.swing.GroupLayout(produtos);
        produtos.setLayout(produtosLayout);
        produtosLayout.setHorizontalGroup(
            produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        produtosLayout.setVerticalGroup(
            produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        conteudoPrincipal.add(produtos, "produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEasyStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conteudoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(menuSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEasyStore)
                    .addComponent(menuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conteudoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) conteudoPrincipal.getLayout();
        
        cardLayout.show(conteudoPrincipal, "produtos");
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        new JanelaAdicaoProduto().setVisible(true);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendas;
    private javax.swing.JPanel conteudoPrincipal;
    private javax.swing.JLabel lblBoasVindas;
    private javax.swing.JLabel lblEasyStore;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel menuSuperior;
    private javax.swing.JPanel msgBoasVindas;
    private javax.swing.JPanel produtos;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
