package SYS_Adm;

import SYS_Comum.CM_Cliente;
import SYS_Comum.CM_Estoque;
import SYS_Comum.CM_Faturamento;
import javax.swing.JLabel;


public class ADM_Home extends javax.swing.JFrame {

    public static ADM_Home Instance;

    public JLabel Label;

    public ADM_Home() {

        initComponents();
        setLocationRelativeTo(null); 
  
        Instance = this; 
        Label = Label_Login;

    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        kBger_estoque = new com.k33ptoo.components.KButton();
        Label_Usuario = new javax.swing.JLabel();
        kBCadastrarUser = new com.k33ptoo.components.KButton();
        kBcliente = new com.k33ptoo.components.KButton();
        kBfaturamento_adm = new com.k33ptoo.components.KButton();
        kBCadastrarProduto = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        kBFornecedor_ADM = new com.k33ptoo.components.KButton();
        kButton8 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();
        Label_Login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kBger_estoque.setText("Gerenciar Estoque");
        kBger_estoque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBger_estoque.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBger_estoque.setkEndColor(new java.awt.Color(255, 204, 204));
        kBger_estoque.setkForeGround(new java.awt.Color(0, 0, 0));
        kBger_estoque.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBger_estoque.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBger_estoque.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBger_estoque.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBger_estoque.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBger_estoque.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBger_estoque.setkStartColor(new java.awt.Color(255, 237, 225));
        kBger_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBger_estoqueActionPerformed(evt);
            }
        });

        Label_Usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SYS_Adm/profile icon.jpg"))); // NOI18N

        kBCadastrarUser.setText("Cadastrar Usuário");
        kBCadastrarUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBCadastrarUser.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBCadastrarUser.setkEndColor(new java.awt.Color(255, 204, 204));
        kBCadastrarUser.setkForeGround(new java.awt.Color(0, 0, 0));
        kBCadastrarUser.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBCadastrarUser.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBCadastrarUser.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBCadastrarUser.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBCadastrarUser.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBCadastrarUser.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBCadastrarUser.setkStartColor(new java.awt.Color(255, 237, 225));
        kBCadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBCadastrarUserActionPerformed(evt);
            }
        });

        kBcliente.setText("Clientes");
        kBcliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBcliente.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBcliente.setkEndColor(new java.awt.Color(255, 204, 204));
        kBcliente.setkForeGround(new java.awt.Color(0, 0, 0));
        kBcliente.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBcliente.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBcliente.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBcliente.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBcliente.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBcliente.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBcliente.setkStartColor(new java.awt.Color(255, 237, 225));
        kBcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBclienteActionPerformed(evt);
            }
        });

        kBfaturamento_adm.setText("Faturamento");
        kBfaturamento_adm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBfaturamento_adm.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBfaturamento_adm.setkEndColor(new java.awt.Color(255, 204, 204));
        kBfaturamento_adm.setkForeGround(new java.awt.Color(0, 0, 0));
        kBfaturamento_adm.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBfaturamento_adm.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBfaturamento_adm.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBfaturamento_adm.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBfaturamento_adm.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBfaturamento_adm.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBfaturamento_adm.setkStartColor(new java.awt.Color(255, 237, 225));
        kBfaturamento_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBfaturamento_admActionPerformed(evt);
            }
        });

        kBCadastrarProduto.setText("Cadastrar Produto");
        kBCadastrarProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBCadastrarProduto.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBCadastrarProduto.setkEndColor(new java.awt.Color(255, 204, 204));
        kBCadastrarProduto.setkForeGround(new java.awt.Color(0, 0, 0));
        kBCadastrarProduto.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBCadastrarProduto.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBCadastrarProduto.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBCadastrarProduto.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBCadastrarProduto.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBCadastrarProduto.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBCadastrarProduto.setkStartColor(new java.awt.Color(255, 237, 225));
        kBCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBCadastrarProdutoActionPerformed(evt);
            }
        });

        kButton6.setText("Compras");
        kButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kButton6.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kButton6.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton6.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton6.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kButton6.setkPressedColor(new java.awt.Color(255, 237, 225));
        kButton6.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton6.setkStartColor(new java.awt.Color(255, 237, 225));

        kBFornecedor_ADM.setText("Fornecedores");
        kBFornecedor_ADM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kBFornecedor_ADM.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kBFornecedor_ADM.setkEndColor(new java.awt.Color(255, 204, 204));
        kBFornecedor_ADM.setkForeGround(new java.awt.Color(0, 0, 0));
        kBFornecedor_ADM.setkHoverColor(new java.awt.Color(0, 0, 0));
        kBFornecedor_ADM.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kBFornecedor_ADM.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kBFornecedor_ADM.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kBFornecedor_ADM.setkPressedColor(new java.awt.Color(255, 237, 225));
        kBFornecedor_ADM.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kBFornecedor_ADM.setkStartColor(new java.awt.Color(255, 237, 225));
        kBFornecedor_ADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kBFornecedor_ADMActionPerformed(evt);
            }
        });

        kButton8.setText("Pedidos de Vendas");
        kButton8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kButton8.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kButton8.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton8.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton8.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kButton8.setkPressedColor(new java.awt.Color(255, 237, 225));
        kButton8.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton8.setkStartColor(new java.awt.Color(255, 237, 225));

        kButton9.setText("Notas Fiscais");
        kButton9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(244, 116, 88));
        kButton9.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton9.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton9.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(244, 116, 88));
        kButton9.setkPressedColor(new java.awt.Color(255, 237, 225));
        kButton9.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton9.setkStartColor(new java.awt.Color(255, 237, 225));

        Label_Login.setBackground(new java.awt.Color(0, 0, 0));
        Label_Login.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Label_Login.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(244, 116, 88));
        jLabel1.setForeground(new java.awt.Color(244, 116, 88));
        jLabel1.setText("Bem vindo,");

        jLabel3.setBackground(new java.awt.Color(244, 116, 88));
        jLabel3.setForeground(new java.awt.Color(244, 116, 88));
        jLabel3.setText("MED_SYS.1.0.0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kBCadastrarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(kBCadastrarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kBger_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kBfaturamento_adm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kBcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kBFornecedor_ADM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Label_Usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Label_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(kBCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kBCadastrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kBger_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kBfaturamento_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kBcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kBFornecedor_ADM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 830));

        jPanel1.setBackground(new java.awt.Color(255, 237, 225));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 116, 88));
        jLabel2.setText("Med.Sys");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1250, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(754, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 1500, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
   
    private void kBCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBCadastrarProdutoActionPerformed

        ADM_CadastroProduto cadastroProd = new ADM_CadastroProduto(null,true);
        cadastroProd.setVisible(true);     
    }//GEN-LAST:event_kBCadastrarProdutoActionPerformed

    private void kBCadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBCadastrarUserActionPerformed
        ADM_CadastroUsuario cadastroUser = new ADM_CadastroUsuario (null,true);
        cadastroUser.setVisible(true);     
    }//GEN-LAST:event_kBCadastrarUserActionPerformed

    private void kBFornecedor_ADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBFornecedor_ADMActionPerformed
        ADM_Fornecedor fornecedor = new ADM_Fornecedor(null,true);
        fornecedor.setVisible(true);            
    }//GEN-LAST:event_kBFornecedor_ADMActionPerformed

    private void kBger_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBger_estoqueActionPerformed
        CM_Estoque estoque = new CM_Estoque(null,true);
        estoque.setVisible(true); 
    }//GEN-LAST:event_kBger_estoqueActionPerformed

    private void kBclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBclienteActionPerformed
        CM_Cliente cliente = new CM_Cliente(null,true);
        cliente.setVisible(true);      
    }//GEN-LAST:event_kBclienteActionPerformed

    private void kBfaturamento_admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kBfaturamento_admActionPerformed
       CM_Faturamento faturamento = new CM_Faturamento(null,true);
       faturamento.setVisible(true);      
    }//GEN-LAST:event_kBfaturamento_admActionPerformed

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
            java.util.logging.Logger.getLogger(ADM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADM_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADM_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Login;
    private javax.swing.JLabel Label_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kBCadastrarProduto;
    private com.k33ptoo.components.KButton kBCadastrarUser;
    private com.k33ptoo.components.KButton kBFornecedor_ADM;
    private com.k33ptoo.components.KButton kBcliente;
    private com.k33ptoo.components.KButton kBfaturamento_adm;
    private com.k33ptoo.components.KButton kBger_estoque;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    // End of variables declaration//GEN-END:variables

}
