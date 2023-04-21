
package SYS_Adm;

import Conexao_Banco.med_sys;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADM_Fornecedor extends javax.swing.JDialog {

    public ADM_Fornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        pesquisarTotal();
    }

    med_sys banco = new med_sys();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cliente = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        bIncluir = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        bPesquisa = new javax.swing.JButton();
        ComboBox1 = new javax.swing.JComboBox<>();
        bLimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 116, 88), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 237, 225));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 440, 100));

        jPanel5.setBackground(new java.awt.Color(255, 237, 225));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 140, 430));

        jPanel6.setBackground(new java.awt.Color(255, 237, 225));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 270, 80));

        jLabel7.setBackground(new java.awt.Color(244, 116, 88));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(244, 116, 88));
        jLabel7.setText("Med.Sys");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabela_Cliente.setBackground(new java.awt.Color(204, 204, 204));
        tabela_Cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabela_Cliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabela_Cliente.setForeground(new java.awt.Color(102, 102, 102));
        tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CNPJ", "Nome", "Email", "Estado", "Cidade", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Cliente.getTableHeader().setReorderingAllowed(false);
        tabela_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_Cliente);
        if (tabela_Cliente.getColumnModel().getColumnCount() > 0) {
            tabela_Cliente.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        txtPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(244, 116, 88)));

        bIncluir.setBackground(new java.awt.Color(204, 204, 204));
        bIncluir.setForeground(new java.awt.Color(244, 116, 88));
        bIncluir.setText("Incluir");
        bIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluirActionPerformed(evt);
            }
        });

        bEditar.setBackground(new java.awt.Color(204, 204, 204));
        bEditar.setForeground(new java.awt.Color(244, 116, 88));
        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bVoltar.setBackground(new java.awt.Color(204, 204, 204));
        bVoltar.setForeground(new java.awt.Color(244, 116, 88));
        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bPesquisa.setText("...");
        bPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisaActionPerformed(evt);
            }
        });

        ComboBox1.setBackground(new java.awt.Color(244, 116, 88));
        ComboBox1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ComboBox1.setForeground(new java.awt.Color(244, 116, 88));
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "CNPJ", "Nome", "E-mail", "Estado", "Cidade", "Telefone" }));
        ComboBox1.setBorder(null);
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        bLimpar.setBackground(new java.awt.Color(204, 204, 204));
        bLimpar.setForeground(new java.awt.Color(244, 116, 88));
        bLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bPesquisa)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bEditar)
                        .addComponent(bIncluir)
                        .addComponent(bVoltar)
                        .addComponent(bLimpar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 730, 330));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Fornecedores");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String FEID;
 
    public void pesquisar(){

        if (banco.getConnection()){

            if(ComboBox1.getSelectedItem().equals("CNPJ")){

                try {

                    String query = "select * from fornecedores where cnpj_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText() +"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                } 
          
            }if(ComboBox1.getSelectedItem().equals("Nome")){

                try {

                    String query = "select * from fornecedores where nome_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText()+"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                }

            }if(ComboBox1.getSelectedItem().equals("E-mail")){
 
                try {

                    String query = "select * from fornecedores where email_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText()+"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                }

            }if(ComboBox1.getSelectedItem().equals("Estado")){

                try {

                    String query = "select * from fornecedores where estado_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText()+"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                }

            }if(ComboBox1.getSelectedItem().equals("Cidade")){

                try {

                    String query = "select * from fornecedores where cidade_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText()+"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                }

            }if(ComboBox1.getSelectedItem().equals("Telefone")){

                try {

                    String query = "select * from fornecedores where telefone_fornecedor like ?";
                    PreparedStatement stmp = banco.connection.prepareStatement(query);
                    stmp.setString(1, "%" + txtPesquisa.getText()+"%");
                    ResultSet rs = stmp.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                    model.setNumRows(0);

                    while (rs.next()){
                        model.addRow(new Object[]{

                           rs.getString("id_fornecedor"),
                           rs.getString("cnpj_fornecedor"),
                           rs.getString("nome_fornecedor"),
                           rs.getString("email_fornecedor"),
                           rs.getString("estado_fornecedor"),
                           rs.getString("cidade_fornecedor"),
                           rs.getString("telefone_fornecedor")

                        });       
                    }

                }catch (SQLException E){

                    JOptionPane.showMessageDialog(null, "Erro de pesquisa no banco" + E);

                }

            }

       }

    }
  
    public void pesquisarTotal(){
   
        if(banco.getConnection()){

           try{
                String query = "select * from fornecedores";
                PreparedStatement stmp = banco.connection.prepareStatement(query);

                ResultSet rs = stmp.executeQuery();

                DefaultTableModel model = (DefaultTableModel) tabela_Cliente.getModel();
                model.setNumRows(0);

                while(rs.next()){
                    model.addRow(new Object[]{

                          rs.getString("id_fornecedor"),
                          rs.getString("cnpj_fornecedor"),
                          rs.getString("nome_fornecedor"),
                          rs.getString("email_fornecedor"),
                          rs.getString("estado_fornecedor"),
                          rs.getString("cidade_fornecedor"),
                          rs.getString("telefone_fornecedor")

                    });
                }
                  
            }catch(SQLException E){

                JOptionPane.showMessageDialog(null, "ERRO DE PESQUISA NO BANCO!" + E);
     
            }
        }
        


    }

    public void selecao_tabela(){
        int row = tabela_Cliente.getSelectedRow();
        String table_click = (tabela_Cliente.getModel().getValueAt(row, 0).toString());

        if(banco.getConnection()){

            try{

                String query = "SELECT * FROM fornecedores WHERE id_fornecedor ='" + table_click + "'";
                ResultSet rs;

                PreparedStatement pst = banco.connection.prepareStatement(query);
                rs = pst.executeQuery();

                if(rs.next()){

                    String add1 = rs.getString("id_fornecedor");
                    FEID = add1;  //COLOCO O ID DO FORNECEDOR NA VARIABEL PUBLICA;
                }
 
                pst.close();
 
            }catch(SQLException e){

                JOptionPane.showMessageDialog(null, "ERRO DE SQL" + e);

            }
 
        }

    }

    private void bIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluirActionPerformed
        
        ADM_IncluirFornecedor incluir = new ADM_IncluirFornecedor(null,true);
        dispose();
        incluir.setVisible(true);
    }//GEN-LAST:event_bIncluirActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
      
      new ADM_EditarFornecedor(FEID).show();
      this.dispose();

    }//GEN-LAST:event_bEditarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisaActionPerformed
        pesquisar();
    }//GEN-LAST:event_bPesquisaActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void tabela_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ClienteMouseClicked
        
        selecao_tabela();

    }//GEN-LAST:event_tabela_ClienteMouseClicked

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
            java.util.logging.Logger.getLogger(ADM_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADM_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADM_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADM_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ADM_Fornecedor dialog = new ADM_Fornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bIncluir;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisa;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_Cliente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
