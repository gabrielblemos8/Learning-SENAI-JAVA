package Displays;
import entidades.Forca;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormMenu extends javax.swing.JFrame {
    ImageIcon imgBackground = new ImageIcon("src/imagens/fundo.jpg");
    ImageIcon imgLogo = new ImageIcon("src/imagens/forca.png");
    
    
    public void imagemNoLbl(ImageIcon icone,JLabel label)
    {
        icone.setImage(icone.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
        label.setIcon(icone);
    }
  
    
    public FormMenu() {
        initComponents();
        imagemNoLbl(imgBackground, lblFundo);
        imagemNoLbl(imgLogo, lblLogo);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JLayeredPane();
        btnJogar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Save the rasta");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(430, 240));

        pFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJogar.setText("Iniciar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        pFundo.add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 250, 40));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pFundo.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 60, 40));
        pFundo.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 400, 230));
        pFundo.add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        this.hide();
        FormIniciar jg = new FormIniciar();
        jg.setVisible(true);
     
       
    }//GEN-LAST:event_btnJogarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLayeredPane pFundo;
    // End of variables declaration//GEN-END:variables
}
