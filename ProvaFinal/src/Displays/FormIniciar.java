package Displays;

import entidades.*;
import java.awt.Label;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class FormIniciar extends javax.swing.JFrame implements IForca
{
    String secreta;
   
    Forca jogo;
    FormMenu menu = new FormMenu();
    ImageIcon imgFundo = new ImageIcon("src/imagens/fundoimagem.jpg");
    ImageIcon imgForca = new ImageIcon("src/imagens/forca.jpeg");
    ImageIcon imgForca1 = new ImageIcon("src/imagens/forca1.jpeg");
    ImageIcon imgForca2 = new ImageIcon("src/imagens/forca2.jpeg");
    ImageIcon imgForca3 = new ImageIcon("src/imagens/forca3.jpeg");
    ImageIcon imgForca4 = new ImageIcon("src/imagens/forca4.jpeg");
    ImageIcon imgForca5 = new ImageIcon("src/imagens/forca5.jpeg");
    ImageIcon imgForca6 = new ImageIcon("src/imagens/forca6.jpeg");
    
    
    
    public FormIniciar() {
        initComponents();
        
        jogo = new Forca(0);

        carregarImagem(imgFundo, lblFundoJogar);
        carregarImagem(imgForca, lblForca);
        
        
        lblSecreta.setText(jogo.esconderPalavra());
        lblDica.setText(jogo.getDica());
        secreta = jogo.esconderPalavra();
        
        
    }
    @Override
    public void carregarImagem(ImageIcon icone, JLabel label)
    {
        {
        icone.setImage(icone.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
        label.setIcon(icone);
        }
    }
    @Override
    public void verificarTentativa(char l)
    {
        if(jogo.validarLetra(l))
        {
            secreta = jogo.trocarLetra(l, secreta, jogo.pegarIndices(l));
            lblSecreta.setText(secreta);
        }else
        {
            jogo.setErros();
            switch (jogo.getErros())
            {
                case 1:
                    carregarImagem(imgForca1, lblForca);
                    break;
                case 2:
                    carregarImagem(imgForca2, lblForca);
                    break;
                case 3:
                    carregarImagem(imgForca3, lblForca);
                    break;
                case 4:
                    carregarImagem(imgForca4, lblForca);
                    break;
                case 5:
                    carregarImagem(imgForca5, lblForca);
                    break;
                case 6:
                    carregarImagem(imgForca6, lblForca);
                    break;
                default:
                    break;
            }
            
            System.out.println("erros: "+jogo.getErros());
        }
        atualizarPlacar();
        verificarErros();
        verificarAcertos();
    }
    
    @Override
    public void atualizarPlacar()
    {
        lblAcertos.setText("ACERTOS: " + jogo.getAcertos());
        lblPontos.setText("PONTOS: " + (jogo.getAcertos() * 50));
        lblErro.setText("ERROS: " + jogo.getErros());
    }
    
    @Override
    public void verificarErros()
    {
        if (jogo.getErros() == 6)
        {
            JOptionPane.showMessageDialog(null, "Não consegue moises, a palavra certa: " + jogo.getPalavra().toUpperCase());
            limpar();
            atualizarPlacar();
            this.hide();
            menu.setVisible(true);    
        }
    }
    
    @Override
    public void verificarAcertos()
    {
        if(jogo.getAcertos() == jogo.tamanho())
        {
            JOptionPane.showMessageDialog(null, "Mizeravi, acerto!");
            limpar();
            atualizarPlacar();
            this.hide();
            menu.setVisible(true);
        }
    }
    
    @Override
    public void limpar()
    {
        carregarImagem(imgForca, lblForca);
        jogo.setAcertos(0);
        jogo.setErros(0);
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnV.setEnabled(true);
        btnX.setEnabled(true);
        btnZ.setEnabled(true);
        btnW.setEnabled(true);
        btnY.setEnabled(true);     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JLayeredPane();
        lblPontos = new javax.swing.JLabel();
        lblAcertos = new javax.swing.JLabel();
        lblDica = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();
        lblSecreta = new javax.swing.JLabel();
        lblQuadro = new javax.swing.JLabel();
        lblWood = new javax.swing.JLabel();
        lblForca = new javax.swing.JLabel();
        btnB = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnMenuInicial = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        lblFundoJogar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setBackground(new java.awt.Color(58, 86, 121));
        setResizable(false);

        pFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPontos.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblPontos.setForeground(new java.awt.Color(255, 255, 255));
        lblPontos.setText(" Pontuação: 0");
        pFundo.add(lblPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 140, -1));

        lblAcertos.setBackground(new java.awt.Color(0, 0, 0));
        lblAcertos.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblAcertos.setForeground(new java.awt.Color(255, 255, 255));
        lblAcertos.setText("Acertos: 0");
        pFundo.add(lblAcertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        lblDica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pFundo.add(lblDica, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 140, 230));

        lblErro.setBackground(new java.awt.Color(0, 0, 0));
        lblErro.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 255, 255));
        lblErro.setText("ERROS: 0");
        pFundo.add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 110, 30));

        lblSecreta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSecreta.setForeground(new java.awt.Color(255, 255, 255));
        lblSecreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecreta.setText("_ _ _ _ _");
        pFundo.add(lblSecreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 360, 70));
        pFundo.add(lblQuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 200, 310));
        pFundo.add(lblWood, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 260, 120));
        pFundo.add(lblForca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 310));

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        pFundo.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        pFundo.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        pFundo.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        pFundo.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        pFundo.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });
        pFundo.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        btnG.setText("G");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });
        pFundo.add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        btnH.setText("H");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });
        pFundo.add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        btnI.setText("I");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });
        pFundo.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 40, -1));

        btnJ.setText("J");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });
        pFundo.add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        btnK.setText("K");
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });
        pFundo.add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 40, -1));

        btnL.setText("L");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });
        pFundo.add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 40, -1));

        btnM.setText("M");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        pFundo.add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        btnN.setText("N");
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });
        pFundo.add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        btnO.setText("O");
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });
        pFundo.add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        pFundo.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        btnQ.setText("Q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });
        pFundo.add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        btnR.setText("R");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        pFundo.add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        btnS.setText("S");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        pFundo.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        btnT.setText("T");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });
        pFundo.add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        btnU.setText("U");
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });
        pFundo.add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        btnV.setText("V");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        pFundo.add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        pFundo.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        btnZ.setText("Z");
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });
        pFundo.add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        btnW.setText("W");
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });
        pFundo.add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        btnMenuInicial.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnMenuInicial.setText("MENU INICIAL");
        btnMenuInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuInicialActionPerformed(evt);
            }
        });
        pFundo.add(btnMenuInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        btnY.setText("Y");
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });
        pFundo.add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));
        pFundo.add(lblFundoJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

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
    
    //Botão
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        btnA.setEnabled(false);
        verificarTentativa('a');  
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        btnB.setEnabled(false);
        verificarTentativa('b');
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        btnC.setEnabled(false);
        verificarTentativa('c');
        
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        btnD.setEnabled(false);
        verificarTentativa('d'); 
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        btnE.setEnabled(false);
        verificarTentativa('e'); 
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        btnF.setEnabled(false);
        verificarTentativa('f'); 
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        btnG.setEnabled(false);
        verificarTentativa('g'); 
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        btnH.setEnabled(false);
        verificarTentativa('h'); 
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        btnI.setEnabled(false);
        verificarTentativa('i'); 
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        btnJ.setEnabled(false);
        verificarTentativa('j'); 
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        btnK.setEnabled(false);
        verificarTentativa('k'); 
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        btnL.setEnabled(false);
        verificarTentativa('l'); 
    }//GEN-LAST:event_btnLActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        btnM.setEnabled(false);
        verificarTentativa('m'); 
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        btnN.setEnabled(false);
        verificarTentativa('n'); 
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        btnO.setEnabled(false);
        verificarTentativa('o');
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        btnP.setEnabled(false);
        verificarTentativa('p'); 
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        btnQ.setEnabled(false);
        verificarTentativa('q');
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        btnR.setEnabled(false);
        verificarTentativa('r');
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        btnS.setEnabled(false);
        verificarTentativa('s');
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        btnT.setEnabled(false);
        verificarTentativa('t');
    }//GEN-LAST:event_btnTActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        btnU.setEnabled(false);
        verificarTentativa('u');
    }//GEN-LAST:event_btnUActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        btnV.setEnabled(false);
        verificarTentativa('v');
    }//GEN-LAST:event_btnVActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        btnX.setEnabled(false);
        verificarTentativa('x');
    }//GEN-LAST:event_btnXActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        btnZ.setEnabled(false);
        verificarTentativa('z');
    }//GEN-LAST:event_btnZActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        btnW.setEnabled(false);
        verificarTentativa('w');
    }//GEN-LAST:event_btnWActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        btnY.setEnabled(false);
        verificarTentativa('y');
    }//GEN-LAST:event_btnYActionPerformed

    private void btnMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuInicialActionPerformed
        limpar();
        this.hide();
        FormMenu menu = new FormMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuInicialActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMenuInicial;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblForca;
    private javax.swing.JLabel lblFundoJogar;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblQuadro;
    private javax.swing.JLabel lblSecreta;
    private javax.swing.JLabel lblWood;
    private javax.swing.JLayeredPane pFundo;
    // End of variables declaration//GEN-END:variables

    

}
