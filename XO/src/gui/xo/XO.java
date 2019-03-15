/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.xo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class XO extends javax.swing.JFrame {

    ImageIcon X,O;
    Integer player;
    
    Integer tabla[][] = new Integer[3][3]; 
    /**
     * Creates new form XO
     */
    
    
    public XO() {
        initComponents();
        X = new ImageIcon(getClass().getResource("X.png"));
        O = new ImageIcon(getClass().getResource("O.png"));
        
        player = 0;
        
        for(int i = 0; i < 3; ++i)
            for(int j = 0; j < 3; ++j)
                tabla[i][j] = 0;
    }

    void kraj()
    {
        String pobedio;
        
        int p1 = tabla[0][0] + tabla[0][1] + tabla[0][2];
        int p2 = tabla[1][0] + tabla[1][1] + tabla[1][2];
        int p3 = tabla[2][0] + tabla[2][1] + tabla[2][2];
        
        int p4 = tabla[0][0] + tabla[1][0] + tabla[2][0];
        int p5 = tabla[0][1] + tabla[1][1] + tabla[2][1];
        int p6 = tabla[0][2] + tabla[1][2] + tabla[2][2];
        
        int p7 = tabla[0][0] + tabla[1][1] + tabla[2][2];
        int p8 = tabla[0][2] + tabla[1][1] + tabla[2][0];
        
        if(p1 == 3 || p2 == 3 || p3 == 3 || p4 == 3 ||
           p5 == 3 || p6 == 3 || p7 == 3 || p8 == 3)
        {
            System.out.println("Pobedio X");
            //pobedio = "X";
            int result = JOptionPane.showConfirmDialog(this, "Pobedio je X","Da li zelite novu igru?",
                    JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.NO_OPTION)
                System.exit(0);
        }
        
        if(p1 == -3 || p2 == -3 || p3 == -3 || p4 == -3 ||
           p5 == -3 || p6 == -3 || p7 == -3 || p8 == -3)
        {
            System.out.println("Pobedio O");
            //pobedio = "O";
            int result = JOptionPane.showConfirmDialog(this, "Pobedio je O","Da li zelite novu igru?",
                    JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.NO_OPTION)
                System.exit(0);
        }
        
        
        
        
       
    }
    
    private void dugme22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme22ActionPerformed
        // TODO add your handling code here:
        if(dugme33.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme33.setIcon(X);
                tabla[1][1] = 1;
            }
            else
            {
                dugme33.setIcon(O);
                tabla[1][1] = -1;
            }
            
            kraj();
        }
    }//GEN-LAST:event_dugme22ActionPerformed

    private void dugme11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme11ActionPerformed
        // TODO add your handling code here:
        if(dugme22.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme22.setIcon(X);
                tabla[0][0] = 1;
            }
            else
            {
                dugme22.setIcon(O);
                tabla[0][0] = -1;
            }
            
            kraj();
        }
    }//GEN-LAST:event_dugme11ActionPerformed

    private void dugme12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme12ActionPerformed
        // TODO add your handling code here:
        if(dugme23.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme23.setIcon(X);
                tabla[0][1] = 1;
            }
            else
            {
                dugme23.setIcon(O);
                tabla[0][1] = -1;
            }
            
            kraj();
        }
    }//GEN-LAST:event_dugme12ActionPerformed

    private void dugme13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme13ActionPerformed
        // TODO add your handling code here:
        if(dugme13.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme13.setIcon(X);
                tabla[0][2] = 1;
            }
            else
            {
                tabla[0][2] = -1;
            }
            
            kraj();
        }
    }//GEN-LAST:event_dugme13ActionPerformed

    private void dugme21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme21ActionPerformed
        // TODO add your handling code here:
        if(dugme32.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme32.setIcon(X);
                tabla[1][0] = 1;
            }
            else
            {
                dugme32.setIcon(O);
                tabla[1][0] = -1;
            }
            
            kraj();
        }
            
    }//GEN-LAST:event_dugme21ActionPerformed

    private void dugme23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme23ActionPerformed
        // TODO add your handling code here:
        if(dugme23.getIcon() == null)
        {
            if(player++ % 2 == 0)
            {
                dugme23.setIcon(X);
                tabla[1][2] = 1;
            }
            else
            {
                dugme23.setIcon(O);
                tabla[1][2] = -1;
            }
            
            kraj();
        }
    }//GEN-LAST:event_dugme23ActionPerformed

    private void dugme31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme31ActionPerformed
        // TODO add your handling code here:
        if(dugme31.getIcon() == null)
        {
        if(player++ % 2 == 0)
        {
            dugme31.setIcon(X);
            tabla[2][0] = 1;
        }
        else
        {
            dugme31.setIcon(O);
            tabla[2][0] = -1;
        }
        
        kraj();
        }
    }//GEN-LAST:event_dugme31ActionPerformed

    private void dugme32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme32ActionPerformed
        // TODO add your handling code here:
        if(dugme32.getIcon() == null)
        {
        if(player++ % 2 == 0)
        {
            dugme32.setIcon(X);
            tabla[2][1] = 1;
        }
        else
        {
            dugme32.setIcon(O);
            tabla[2][1] = -1;
        }
        
        kraj();
        }
    }//GEN-LAST:event_dugme32ActionPerformed

    private void dugme33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme33ActionPerformed
        // TODO add your handling code here:
        if(dugme33.getIcon() == null)
        {
        if(player++ % 2 == 0)
        {
            dugme33.setIcon(X);
            tabla[2][2] = 1;
        }
        else
        {
            dugme33.setIcon(O);
            tabla[2][2] = -1;
        }
        
        kraj();
        
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dugme10 = new javax.swing.JButton();
        dugme11 = new javax.swing.JButton();
        dugme12 = new javax.swing.JButton();
        dugme21 = new javax.swing.JButton();
        dugme22 = new javax.swing.JButton();
        dugme23 = new javax.swing.JButton();
        dugme31 = new javax.swing.JButton();
        dugme32 = new javax.swing.JButton();
        dugme33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X O");
        setResizable(false);

        jPanel1.setToolTipText("X-O");
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        dugme10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme10ActionPerformed(evt);
            }
        });
        jPanel1.add(dugme10);
        jPanel1.add(dugme11);
        jPanel1.add(dugme12);

        dugme21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme21ActionPerformed(evt);
            }
        });
        jPanel1.add(dugme21);
        jPanel1.add(dugme22);
        jPanel1.add(dugme23);
        jPanel1.add(dugme31);
        jPanel1.add(dugme32);
        jPanel1.add(dugme33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
////
    private void dugme10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dugme10ActionPerformed

    private void dugme21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dugme21ActionPerformed

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
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dugme10;
    private javax.swing.JButton dugme11;
    private javax.swing.JButton dugme12;
    private javax.swing.JButton dugme21;
    private javax.swing.JButton dugme22;
    private javax.swing.JButton dugme23;
    private javax.swing.JButton dugme31;
    private javax.swing.JButton dugme32;
    private javax.swing.JButton dugme33;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
