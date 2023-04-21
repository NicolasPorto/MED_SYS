package SYS_Inicio;

import Conexao_Banco.med_sys;
import SYS_Adm.ADM_Home;
import SYS_Comum.CM_Home;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public int ToClose(int retStatus){

        setVisible(false);
        dispose();
        return retStatus;    
    }

    public Login() {
        initComponents();

        setLocationRelativeTo(null); //Deixar o Panel no meio da tela.
      
        getContentPane().setBackground(new Color(244,116,88)); //Cor do RadioButton.  

        tipo_usuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tipo_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        M_name = new javax.swing.JTextField();
        radio_usuario = new SYS_Inicio.RadioButton();
        radio_adm = new SYS_Inicio.RadioButton();
        kButton1 = new com.k33ptoo.components.KButton();
        M_senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tipo_usuario.setEnabled(false);
        tipo_usuario.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 116, 88));
        jLabel1.setText("Med.Sys");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuário");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha");

        M_name.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        M_name.setForeground(new java.awt.Color(0, 0, 0));
        M_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        M_name.setCaretColor(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(radio_usuario);
        radio_usuario.setText("Usuário");
        radio_usuario.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        radio_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_usuarioActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_adm);
        radio_adm.setText("Administrador");
        radio_adm.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        radio_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_admActionPerformed(evt);
            }
        });

        kButton1.setBackground(new java.awt.Color(244, 116, 88));
        kButton1.setText("Logar");
        kButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(0, 0, 0));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(244, 116, 88));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kButton1.setkIndicatorColor(new java.awt.Color(0, 0, 0));
        kButton1.setkIndicatorThickness(5);
        kButton1.setkPressedColor(new java.awt.Color(244, 116, 88));
        kButton1.setkSelectedColor(new java.awt.Color(0, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(244, 116, 88));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        M_senha.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        M_senha.setForeground(new java.awt.Color(0, 0, 0));
        M_senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(244, 116, 88)));
        M_senha.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(M_name)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(radio_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(radio_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(M_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void administrador(){
        med_sys banco = new med_sys();

        if(banco.getConnection()){

           try{
               String sq1 = "select * from usuarios where user_usuario = ? and senha_usuario = ? and tipo_usuario_id_tipo = ?";
             
               PreparedStatement pst = banco.connection.prepareStatement(sq1);
               ResultSet rs;

               pst.setString(1, M_name.getText());
               pst.setString(2, M_senha.getText());
               pst.setString(3, tipo_usuario.getText());
               rs = pst.executeQuery();

               if(rs.next()){

                     JOptionPane.showMessageDialog(null, "Usuário Aceito!");
                
                     new ADM_Home().show();
                     ADM_Home.Instance.Label.setText(M_name.getText());
                     ToClose(TelaCancel.CANCEL);

               }else{

                     JOptionPane.showMessageDialog(null, "ACESSO NEGADO, TENTE NOVAMENTE!");

                     ToClose(TelaCancel.CANCEL);
                     limpar_login();
               }

           }catch(SQLException E){

               JOptionPane.showMessageDialog(null, E);
               limpar_login();
               
           }
        }
 
    }

    public void comum(){
        med_sys banco = new med_sys();

        if(banco.getConnection()){

           try{
               String sq1 = "select * from usuarios where user_usuario = ? and senha_usuario = ? and tipo_usuario_id_tipo = ?";
             
               PreparedStatement pst = banco.connection.prepareStatement(sq1);
               ResultSet rs;

               pst.setString(1, M_name.getText());
               pst.setString(2, M_senha.getText());
               pst.setString(3, tipo_usuario.getText());
               rs = pst.executeQuery();

               if(rs.next()){

                     JOptionPane.showMessageDialog(null, "Usuário Aceito!");
               
                    
                     new CM_Home().show();
                     CM_Home.Instance.Label.setText(M_name.getText());
                     ToClose(TelaCancel.CANCEL);

               }else{

                     JOptionPane.showMessageDialog(null, "Usuário não encontrado, tente novamente!");
                     limpar_login();
               }

           }catch(SQLException E){

               JOptionPane.showMessageDialog(null, E);
               limpar_login();

           }
        }
 
    }
 
    public void limpar_login(){
        
        M_name.setText("");
        M_senha.setText("");
        tipo_usuario.setText("");
        buttonGroup1.clearSelection(); //Limpa as seleções do grupo de RadioButtons.
        
    }
    
    private void radio_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_usuarioActionPerformed
    
    }//GEN-LAST:event_radio_usuarioActionPerformed

    private void radio_admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_admActionPerformed
        
    }//GEN-LAST:event_radio_admActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
         
         if(radio_usuario.isSelected()){
          
            tipo_usuario.setText("1");
            comum();
        }
          

         if(radio_adm.isSelected()){
          
            tipo_usuario.setText("2");
            administrador();
        }       

    }//GEN-LAST:event_kButton1ActionPerformed

    
 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField M_name;
    private javax.swing.JPasswordField M_senha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private SYS_Inicio.RadioButton radio_adm;
    private SYS_Inicio.RadioButton radio_usuario;
    private javax.swing.JLabel tipo_usuario;
    // End of variables declaration//GEN-END:variables
}
