package org.levilima.easystore.view;

/**
 *
 * @author levi
 */
import java.awt.Color;
import java.awt.Rectangle;
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
import org.levilima.easystore.control.OperacaoCadastroFuncionario;
import org.levilima.easystore.model.Funcionario;

public class JanelaCadastroFuncionario extends javax.swing.JFrame {
    
    private final Funcionarios gerFuncionarios;
    private final JanelaPrincipal janelaPrincipal;
    
    public JanelaCadastroFuncionario(Funcionarios gerFuncionarios, JanelaPrincipal janelaPrincipal) {
        this.gerFuncionarios = gerFuncionarios;
        this.janelaPrincipal = janelaPrincipal;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dica = new JLabel();
        container = new JPanel();
        lblNome = new JLabel();
        txtNome = new JTextField();
        lblEmail = new JLabel();
        txtEmail = new JTextField();
        lblCpf = new JLabel();
        txtCpf = new JTextField();
        lblTelefone = new JLabel();
        txtTelefone = new JTextField();
        botoes = new JPanel();
        btnCancelar = new JButton();
        btnCadastrar = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de funcionário");
        setBounds(new Rectangle(300, 180, 0, 0));
        setResizable(false);

        dica.setText("Campos de preenchimento obrigatório (*)");

        lblNome.setText("Nome*");

        lblEmail.setText("E-Mail*");

        lblCpf.setText("CPF*");

        lblTelefone.setText("Telefone*");

        GroupLayout containerLayout = new GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpf, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefone, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCpf)
                    .addComponent(txtNome)
                    .addGroup(GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        GroupLayout botoesLayout = new GroupLayout(botoes);
        botoes.setLayout(botoesLayout);
        botoesLayout.setHorizontalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
        );
        botoesLayout.setVerticalGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(botoesLayout.createSequentialGroup()
                .addGroup(botoesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(dica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(botoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dica)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        int cpf, telefone;
        
        if(nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do funcionário!");
            return;
        }
        
        if(email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o e-mail do funcionário!");
            return;
        }
        
        try {
            cpf = Integer.parseInt(txtCpf.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira o CPF do funcionário!");
            return;
        }

        try {
            telefone = Integer.parseInt(txtTelefone.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Insira o Nº de telefone do funcionário!");
            return;
        }
        
        Funcionario funcionario = new Funcionario(nome, email, cpf, telefone);
        
        gerFuncionarios.addFuncionario(funcionario);
        gerFuncionarios.salvarDados();
        janelaPrincipal.gerRelatorios.registrarOperacao(new OperacaoCadastroFuncionario(funcionario.getNome()));
        janelaPrincipal.gerRelatorios.salvarRelatorio();
        janelaPrincipal.atualizarTextoRelatorio();
        janelaPrincipal.atualizarTabelaFuncionarios();
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel botoes;
    private JButton btnCadastrar;
    private JButton btnCancelar;
    private JPanel container;
    private JLabel dica;
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