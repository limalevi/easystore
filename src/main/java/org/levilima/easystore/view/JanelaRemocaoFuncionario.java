package org.levilima.easystore.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import org.levilima.easystore.control.Funcionarios;
import org.levilima.easystore.model.Funcionario;
import org.levilima.easystore.control.OperacaoRemocaoFuncionario;

/**
 *
 * @author levi
 */
public class JanelaRemocaoFuncionario extends javax.swing.JFrame {
    
    private final Funcionarios gerFuncionarios;
    private final JanelaPrincipal janelaPrincipal;
    private final Funcionario funcionarioAlvo;
    
    public JanelaRemocaoFuncionario(Funcionarios gerFuncionarios, JanelaPrincipal janelaPrincipal, Funcionario funcionarioAlvo) {
        this.gerFuncionarios = gerFuncionarios;
        this.janelaPrincipal = janelaPrincipal;
        this.funcionarioAlvo = funcionarioAlvo;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pergunta = new JLabel();
        botoes = new JPanel();
        btnCancelar = new JButton();
        btnRemover = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remova um produto");
        setResizable(false);

        pergunta.setHorizontalAlignment(SwingConstants.CENTER);
        pergunta.setText("<html>\nDeseja realmente remover esse<br>\nfuncionário?\n\n<br>\n<br>\n\nEstá ação não pode ser desfeita!\n</html>");
        pergunta.setHorizontalTextPosition(SwingConstants.CENTER);

        botoes.setPreferredSize(new Dimension(292, 39));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnRemover.setBackground(new Color(255, 0, 0));
        btnRemover.setText("Remover");
        btnRemover.setPreferredSize(new Dimension(84, 22));
        btnRemover.addActionListener(this::btnRemoverActionPerformed);

        GroupLayout botoesLayout = new GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        botoesLayout.setHorizontalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
        );
        botoesLayout.setVerticalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRemover, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(botoes, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(pergunta))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pergunta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botoes, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRemoverActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        boolean sucesso = gerFuncionarios.removerFuncionario(funcionarioAlvo.getId());
        
        if(sucesso) {
            JOptionPane.showMessageDialog(this, "Funcionário removido com sucesso!");
            gerFuncionarios.salvarDados();
            janelaPrincipal.gerRelatorios.registrarOperacao(new OperacaoRemocaoFuncionario(funcionarioAlvo.getNome()));
            janelaPrincipal.gerRelatorios.salvarRelatorio();
            janelaPrincipal.atualizarTextoRelatorio();
            janelaPrincipal.atualizarTabelaFuncionarios();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro: Funcionário não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel botoes;
    private JButton btnCancelar;
    private JButton btnRemover;
    private JLabel pergunta;
    // End of variables declaration//GEN-END:variables
}
