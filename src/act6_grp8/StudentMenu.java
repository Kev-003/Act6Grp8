package act6_grp8;

import javax.swing.*;
import java.awt.*;

class StudentMenu extends javax.swing.JFrame {

    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupTransac = new javax.swing.JPopupMenu();
        jItemInformation = new javax.swing.JMenuItem();
        jItemGrade = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTransac = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        grdEncode = new javax.swing.JMenuItem();
        jMenuCred = new javax.swing.JMenu();

        jPopupTransac.setAlignmentY(1.0F);
        jPopupTransac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jItemInformation.setText("Student Information");
        jItemInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemInformationActionPerformed(evt);
            }
        });
        jPopupTransac.add(jItemInformation);

        jItemGrade.setText("Grade Encoding");
        jPopupTransac.add(jItemGrade);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");

        jMenuTransac.setText("Transaction");
        jMenuTransac.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuTransacMenuSelected(evt);
            }
        });

        jMenuItem2.setLabel("Student Information");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuTransac.add(jMenuItem2);

        grdEncode.setLabel("Grade Encoding");
        grdEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grdEncodeActionPerformed(evt);
            }
        });
        jMenuTransac.add(grdEncode);

        jMenuBar1.add(jMenuTransac);

        jMenuCred.setText("Credits");
        jMenuCred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCredMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCred);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jItemInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemInformationActionPerformed
        StudentInformation.main(new String[0]);
        
    }//GEN-LAST:event_jItemInformationActionPerformed

    private void jMenuTransacMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuTransacMenuSelected
        jPopupTransac.show(jMenuBar1, 0, 20);
    }//GEN-LAST:event_jMenuTransacMenuSelected

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        StudentInformation.main(new String[0]);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void grdEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grdEncodeActionPerformed
        GradeEncoding.main(new String[0]);
    }//GEN-LAST:event_grdEncodeActionPerformed

    private void jMenuCredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCredMouseClicked
        JFrame frame = new JFrame("Credits");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setBounds(200,200,300,200);
        frame.setVisible(true);
        
        JLabel contrib, francis, allen, kevern, hiel;
                
        contrib = new JLabel("Contributors");
        contrib.setBounds(20,20,200,20);
        contrib.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(contrib);
        
        francis = new JLabel("Francis Clarence B. Dimasupil");
        francis.setBounds(20,45,200,20);
        frame.add(francis);
        
        allen = new JLabel("Allen James L. Laxamana");
        allen.setBounds(20,70,200,20);
        frame.add(allen);
        
        kevern = new JLabel("Kevern Joebert C. Angeles");
        kevern.setBounds(20,95,200,20);
        frame.add(kevern);
        
        hiel = new JLabel("Hiel Shaddai Z. Pascual");
        hiel.setBounds(20,120,200,20);
        frame.add(hiel);
    }//GEN-LAST:event_jMenuCredMouseClicked
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentMenu().setVisible(true);
        });
    }
    //Variables declaration
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem grdEncode;
    private javax.swing.JMenuItem jItemGrade;
    private javax.swing.JMenuItem jItemInformation;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCred;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuTransac;
    private javax.swing.JPopupMenu jPopupTransac;
    // End of variables declaration//GEN-END:variables
}

