package org.levilima.easystore.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import org.levilima.easystore.control.Loja;
import org.levilima.easystore.model.Produto;
import org.levilima.easystore.control.OperacaoEdicao;

/**
 *
 * @author levi
 */
public class JanelaEdicaoProduto extends javax.swing.JFrame {
    
    private final Loja loja;
    private final JanelaPrincipal janelaPrincipal;
    private Produto produtoAlvo;
    
    public JanelaEdicaoProduto(Loja loja, JanelaPrincipal janelaPrincipal, Produto produtoAlvo) {
        this.loja = loja;
        this.janelaPrincipal = janelaPrincipal;
        this.produtoAlvo = produtoAlvo;
        
        initComponents();
        preencherCampos();
    }
    
    private void preencherCampos() {
        setTitle("Editar Produto - Código: " + produtoAlvo.getCodigo());
        txtNome.setText(produtoAlvo.getNome());
        txtCategoria.setText(produtoAlvo.getCategoria());
        txtVencimento.setText(produtoAlvo.getValidade());
        txtQuantidade.setText(String.valueOf(produtoAlvo.getQuantidade()));
        txtPreco.setText(String.valueOf(produtoAlvo.getPreco()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoes = new JPanel();
        btnCancelar = new JButton();
        btnEditar = new JButton();
        Container = new JPanel();
        lblNome = new JLabel();
        txtNome = new JTextField();
        lblCategoria = new JLabel();
        txtCategoria = new JTextField();
        lblVencimento = new JLabel();
        txtVencimento = new JTextField();
        lblQuantidade = new JLabel();
        txtQuantidade = new JTextField();
        lblPreco = new JLabel();
        txtPreco = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar um produto");
        setResizable(false);

        botoes.setPreferredSize(new Dimension(292, 39));

        btnCancelar.setBackground(new Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new Dimension(84, 22));
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        GroupLayout botoesLayout = new GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        botoesLayout.setHorizontalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botoesLayout.setVerticalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnEditar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblNome.setText("Nome");

        lblCategoria.setText("Categoria");

        lblVencimento.setText("Vencimento");

        lblQuantidade.setText("Quantidade");

        lblPreco.setText("Preço");

        GroupLayout ContainerLayout = new GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(lblNome)
                    .addComponent(lblVencimento)
                    .addComponent(lblQuantidade)
                    .addComponent(lblPreco))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtCategoria, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtVencimento, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtQuantidade, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtPreco, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
        );
        ContainerLayout.setVerticalGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVencimento)
                    .addComponent(txtVencimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(botoes, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Container, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            String nome = txtNome.getText();
            String categoria = txtCategoria.getText();
            String vencimento = txtVencimento.getText();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            double preco = Double.parseDouble(txtPreco.getText());
            
            boolean sucesso = loja.editarProduto(produtoAlvo.getCodigo(), nome, categoria, vencimento, quantidade, preco);
            
            if(sucesso) {
                JOptionPane.showMessageDialog(this, "Produto editado com sucesso!");
                loja.salvarDados();
                janelaPrincipal.gerRelatorios.registrarOperacao(new OperacaoEdicao(produtoAlvo.getCodigo()));
                janelaPrincipal.gerRelatorios.salvarRelatorio();
                janelaPrincipal.atualizarTextoRelatorio();
                janelaPrincipal.atualizarTabela();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro: Produto não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro: Insira valores válidos para a quantidade e preço!", "Erro de formatação", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel Container;
    private JPanel botoes;
    private JButton btnCancelar;
    private JButton btnEditar;
    private JLabel lblCategoria;
    private JLabel lblNome;
    private JLabel lblPreco;
    private JLabel lblQuantidade;
    private JLabel lblVencimento;
    private JTextField txtCategoria;
    private JTextField txtNome;
    private JTextField txtPreco;
    private JTextField txtQuantidade;
    private JTextField txtVencimento;
    // End of variables declaration//GEN-END:variables
}
