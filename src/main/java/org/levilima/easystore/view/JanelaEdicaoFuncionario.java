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
import org.levilima.easystore.control.Funcionarios;
import org.levilima.easystore.control.Loja;
import org.levilima.easystore.model.Produto;
import org.levilima.easystore.control.OperacaoEdicao;
import org.levilima.easystore.model.Funcionario;

/**
 *
 * @author levi
 */
public class JanelaEdicaoFuncionario extends javax.swing.JFrame {
    
    private final Funcionarios gerFuncionarios;
    private final JanelaPrincipal janelaPrincipal;
    private final Funcionario funcionarioAlvo;
    
    public JanelaEdicaoFuncionario(Funcionarios gerFuncionarios, JanelaPrincipal janelaPrincipal, Funcionario funcionarioAlvo) {
        this.gerFuncionarios = gerFuncionarios;
        this.janelaPrincipal = janelaPrincipal;
        this.funcionarioAlvo = funcionarioAlvo;
        
        initComponents();
        preencherCampos();
    }
    
    private void preencherCampos() {
        setTitle("Editar dados do funcionário - ID: " + funcionarioAlvo.getId());
        txtNome.setText(funcionarioAlvo.getNome());
        txtEmail.setText(funcionarioAlvo.getEmail());
        txtCpf.setText(String.valueOf(funcionarioAlvo.getCpf()));
        txtTelefone.setText(String.valueOf(funcionarioAlvo.getTelefone()));
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
        lblEmail = new JLabel();
        txtEmail = new JTextField();
        lblCpf = new JLabel();
        txtCpf = new JTextField();
        lblTelefone = new JLabel();
        txtTelefone = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar dados");
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

        lblEmail.setText("E-Mail");

        lblCpf.setText("CPF");

        lblTelefone.setText("Telefone");

        GroupLayout ContainerLayout = new GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCpf)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(txtCpf, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(txtTelefone, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
        );
        ContainerLayout.setVerticalGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContainerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            String email = txtEmail.getText();
            int cpf = Integer.parseInt(txtCpf.getText());
            int telefone = Integer.parseInt(txtTelefone.getText());
            
            boolean sucesso = gerFuncionarios.editarFuncionario(funcionarioAlvo.getId(), nome, email, cpf, telefone);
            
            if(sucesso) {
                JOptionPane.showMessageDialog(this, "Dados do funcionário editado com sucesso!");
                gerFuncionarios.salvarDados();
                //janelaPrincipal.gerRelatorios.registrarOperacao(new OperacaoEdicao(produtoAlvo.getCodigo()));
                //janelaPrincipal.gerRelatorios.salvarRelatorio();
                //janelaPrincipal.atualizarTextoRelatorio();
                janelaPrincipal.atualizarTabelaFuncionarios();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro: Funcionário não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro: Insira valores válidos para o cpf e o Nº de telefone!", "Erro de formatação", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel Container;
    private JPanel botoes;
    private JButton btnCancelar;
    private JButton btnEditar;
    private JLabel lblCpf;
    private JLabel lblEmail;
    private JLabel lblNome;
    private JLabel lblTelefone;
    private JTextField txtCpf;
    private JTextField txtEmail;
    private JTextField txtNome;
    private JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
