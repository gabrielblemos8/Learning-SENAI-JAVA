package prova;

import javax.swing.JOptionPane;


public class ProvaFinal extends javax.swing.JFrame {

    
    public ProvaFinal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JEmprestimo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        lblMsg1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1000", "12", "3"},
                {"2", "2000", "15", "5"},
                {"3", "3000", "24", "10"},
                {"4", "4000", "48", "12"}
            },
            new String [] {
                "Codigo", "Valor", "Parcelas (x)", "Juros (em %)"
            }
        ));
        jScrollPane1.setViewportView(JEmprestimo);

        jLabel1.setText("Informe o codigo:");

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        lblMsg.setText("                                                         ...");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Sistema de Emprestimo Consignado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double Montante = 0,juros = 0, ParcelaMensal = 0, Tempo = 0, Valor = 0,Taxa = 0 ;
    int codigo = 0; 
    
    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        //Travar variaveis caso aperte o botão Calcular novamente
        Montante = 0;
        juros = 0;
        ParcelaMensal = 0;
        Tempo = 0;
        Valor = 0;
        Taxa = 0 ;
        codigo = 0;
        
        codigo = Integer.parseInt(txtCodigo.getText());
        
        //Teste de veracidade!
        boolean resp = true;
       
       
       for(int i = 0; i < JEmprestimo.getRowCount(); i++){
            if(codigo == Integer.parseInt( (String) JEmprestimo.getModel().getValueAt(i, 0))){
            //Simplificadores!! kkk    
            Valor = Valor + (Double.parseDouble((String) JEmprestimo.getModel().getValueAt(i, 1)));
            Tempo = Tempo + (Double.parseDouble((String) JEmprestimo.getModel().getValueAt(i, 2)));
            Taxa = Taxa + ((Double.parseDouble((String) JEmprestimo.getModel().getValueAt(i, 3)))/100);
         
            //Calculo!
            ParcelaMensal = ParcelaMensal+((Valor/Tempo)+((Valor/Tempo)*Taxa));
            Montante = Montante +(ParcelaMensal*Tempo);
            //Inicio do teste!
            resp = true;       
            break;
            
               }else{
                resp = false;
                }
            
        } if(codigo == 0){
           JOptionPane.showMessageDialog (null, "Opção invalida!    Escolha uma opção valida!");
          
           txtCodigo.setText("");
            return;
        }
        
       if(resp){
             
         lblMsg.setText("Total a ser pago= "+ String.valueOf(Montante).format("%.2f",Montante));
         lblMsg1.setText("Valor Mensal= " + String.valueOf(ParcelaMensal).format("%.2f",ParcelaMensal));
         
           }else{   
             JOptionPane.showMessageDialog (null, "Opção invalida!    Escolha uma opção valida!");
         
             txtCodigo.setText("");
             lblMsg.setText("                                                           ...");
             lblMsg1.setText("");
            }  
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        
        txtCodigo.setText("");
        lblMsg.setText("                                                           ...");
        lblMsg1.setText("");
        Montante = 0;
        juros = 0;
        ParcelaMensal = 0;
        Tempo = 0;
        Valor = 0;
        Taxa = 0 ;
        codigo = 0;
    }//GEN-LAST:event_BtnCancelarActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ProvaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProvaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProvaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProvaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProvaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JTable JEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblMsg1;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
