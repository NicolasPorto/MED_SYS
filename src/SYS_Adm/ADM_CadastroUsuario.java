package SYS_Adm;

import Conexao_Banco.med_sys;
import SYS_Inicio.TelaCancel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;


public class ADM_CadastroUsuario extends javax.swing.JDialog {

 
    public ADM_CadastroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        senha_erro.setVisible(false);
        tipoUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tipoUsuario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboBox_Tipo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        senhaUsuario = new javax.swing.JPasswordField();
        senhaRepetir = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        loginUsuario = new javax.swing.JTextField();
        nomeCompleto = new javax.swing.JTextField();
        senha_erro = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 116, 88), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 237, 225));

        tipoUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 430, 120));

        jPanel5.setBackground(new java.awt.Color(255, 237, 225));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 160, 400));

        jPanel6.setBackground(new java.awt.Color(255, 237, 225));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 240, 100));

        jLabel7.setBackground(new java.awt.Color(244, 116, 88));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 116, 88));
        jLabel7.setText("Med.Sys");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Cadastrar Usuário");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Nome Completo*");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Senha*");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Repetir Senha*");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Perfil de Acesso*");

        ComboBox_Tipo.setBackground(new java.awt.Color(244, 116, 88));
        ComboBox_Tipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ComboBox_Tipo.setForeground(new java.awt.Color(244, 116, 88));
        ComboBox_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Usuário" }));
        ComboBox_Tipo.setBorder(null);
        ComboBox_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_TipoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(244, 116, 88));
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBlimpar.setBackground(new java.awt.Color(204, 204, 204));
        jBlimpar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBlimpar.setForeground(new java.awt.Color(244, 116, 88));
        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        senhaUsuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senhaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        senhaUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        senhaUsuario.setCaretColor(new java.awt.Color(0, 0, 0));
        senhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaUsuarioKeyTyped(evt);
            }
        });

        senhaRepetir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senhaRepetir.setForeground(new java.awt.Color(0, 0, 0));
        senhaRepetir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        senhaRepetir.setCaretColor(new java.awt.Color(0, 0, 0));
        senhaRepetir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaRepetirKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("User*");

        loginUsuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        loginUsuario.setForeground(new java.awt.Color(0, 0, 0));
        loginUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        loginUsuario.setCaretColor(new java.awt.Color(0, 0, 0));
        loginUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginUsuarioKeyTyped(evt);
            }
        });

        nomeCompleto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        nomeCompleto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        nomeCompleto.setCaretColor(new java.awt.Color(0, 0, 0));
        nomeCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeCompletoKeyTyped(evt);
            }
        });

        senha_erro.setBackground(new java.awt.Color(244, 116, 88));
        senha_erro.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        senha_erro.setForeground(new java.awt.Color(244, 116, 88));
        senha_erro.setText("*As senhas não correspondem.");

        voltarBotao.setBackground(new java.awt.Color(204, 204, 204));
        voltarBotao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(244, 116, 88));
        voltarBotao.setText("Voltar");
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senha_erro)
                            .addComponent(senhaRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(23, 23, 23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(senha_erro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jBlimpar)
                            .addComponent(voltarBotao))))
                .addGap(28, 28, 28))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 650, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int ToClose(int retStatus){

        setVisible(false);
        dispose();
        return retStatus;    
    }
    
    public void limparCadastro() {

        nomeCompleto.setText("");
        loginUsuario.setText("");
        senhaUsuario.setText("");
        senhaRepetir.setText("");
        senha_erro.setVisible(false);
    }

    public void Cadastro(){
        med_sys banco = new med_sys();

        if(banco.getConnection()){

           try{
                
                 String query = "insert into usuarios(user_usuario, nome_usuario, senha_usuario, tipo_usuario_id_tipo) values (?, ?, ?, ?)";
                 PreparedStatement state = banco.connection.prepareStatement(query);
                 
                 state.setString(1, loginUsuario.getText());
                 state.setString(2, nomeCompleto.getText());
                 state.setString(3, senhaUsuario.getText());
                 state.setString(4, tipoUsuario.getText());
                 state.executeUpdate();

                 JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
                 limparCadastro();

                 state.close();
                 banco.connection.close();

             }catch(SQLException E){
 
                 JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");

             }
         }


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        if(loginUsuario.getText().isEmpty() || nomeCompleto.getText().isEmpty() || senhaUsuario.getText().isEmpty() || senhaRepetir.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Você esqueceu de preencher um campo."); 
                 
        }else{             
        
            if(senhaUsuario.getText().equals(senhaRepetir.getText())){

                    String tipo = ComboBox_Tipo.getSelectedItem().toString();

                    if("Usuário".equals(tipo)){

                       tipoUsuario.setText("1");
                       Cadastro();

                    }

                    if("Administrador".equals(tipo)){

                       tipoUsuario.setText("2");//SETA O NUMERO 2 NA LABEL "ESCONDIDA"
                       Cadastro();

                    }

            }else{

                JOptionPane.showMessageDialog(null, "As senhas não correspondem.");

            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
 
        limparCadastro();

    }//GEN-LAST:event_jBlimparActionPerformed

    private void loginUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUsuarioKeyTyped
        
        if(loginUsuario.getText().length() >= 20){

            evt.consume();

        }
    }//GEN-LAST:event_loginUsuarioKeyTyped

    private void nomeCompletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeCompletoKeyTyped
       
        if(loginUsuario.getText().length() >= 100){

            evt.consume();

        }

    }//GEN-LAST:event_nomeCompletoKeyTyped

    private void senhaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaUsuarioKeyTyped
        
        if(loginUsuario.getText().length() >= 45){

           evt.consume();

        }
    }//GEN-LAST:event_senhaUsuarioKeyTyped

    private void senhaRepetirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaRepetirKeyReleased
        
        if(senhaRepetir.getText().equals(senhaUsuario.getText())){

            senha_erro.setVisible(false);

        }else{

            senha_erro.setVisible(true);

        }
    }//GEN-LAST:event_senhaRepetirKeyReleased

    private void senhaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaUsuarioKeyReleased
        
        if(senhaRepetir.getText().equals(senhaUsuario.getText())){

            senha_erro.setVisible(false);

        }else{

            senha_erro.setVisible(true);

        }

    }//GEN-LAST:event_senhaUsuarioKeyReleased

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void ComboBox_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_TipoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ADM_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADM_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADM_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADM_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ADM_CadastroUsuario dialog = new ADM_CadastroUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Tipo;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField loginUsuario;
    private javax.swing.JTextField nomeCompleto;
    private javax.swing.JPasswordField senhaRepetir;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JLabel senha_erro;
    private javax.swing.JLabel tipoUsuario;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
