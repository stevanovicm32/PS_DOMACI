/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;
import domain.Predmet;
import domain.Profesor;
import domain.Radnik;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class GlavnaForma extends javax.swing.JFrame {
private Radnik ulogovaniRadnik=Controller.getInstance().getUlogovaniRadnik();
    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        this.popuniComboBoxProfesorima();
        jLabel1.setText(ulogovaniRadnik.toString());
        TableModelPredmeti modelTabele= new TableModelPredmeti(Controller.getInstance().vratiListuPredmeta());
        jTable1.setModel(modelTabele);
        this.osveziPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonUnesi = new javax.swing.JButton();
        jButtonUnesiPredmet = new javax.swing.JButton();
        jComboBoxProfesor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jButtonUnesi.setText("Unesi novog profesora");
        jButtonUnesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnesiActionPerformed(evt);
            }
        });

        jButtonUnesiPredmet.setText("Unesi predmet");
        jButtonUnesiPredmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnesiPredmetActionPerformed(evt);
            }
        });

        jComboBoxProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfesorActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Izmeni angazovanje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonUnesiPredmet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonUnesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21))
                            .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButtonUnesi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUnesiPredmet)
                            .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnesiActionPerformed
        FormaUnesi fu=new FormaUnesi(this, true, 1);
        fu.setVisible(true);
    }//GEN-LAST:event_jButtonUnesiActionPerformed

    private void jButtonUnesiPredmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnesiPredmetActionPerformed
        FormaUnesi fu=new FormaUnesi(this, true, 2);
        fu.setVisible(true);
    }//GEN-LAST:event_jButtonUnesiPredmetActionPerformed

    private void jComboBoxProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfesorActionPerformed
        Profesor p=(Profesor) jComboBoxProfesor.getSelectedItem();
        List<Profesor> prof=Controller.getInstance().vratiListuProfesora();
        List<Predmet> pred=Controller.getInstance().vratiListuPredmeta();
        List<Predmet> pr=new ArrayList<>();
        for (Predmet predmet : pred) {
            if(predmet.getIdp()==p.getId())
            {
                pr.add(predmet);
            }
        }
        TableModelPredmeti tabela=new TableModelPredmeti(pr);
        jTable1.setModel(tabela);
    }//GEN-LAST:event_jComboBoxProfesorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormaUnesi fu=new FormaUnesi(this, true, 3);
        fu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonUnesi;
    private javax.swing.JButton jButtonUnesiPredmet;
    private javax.swing.JComboBox<Profesor> jComboBoxProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   private void popuniComboBoxProfesorima()
    {
        List<Profesor> listaProfesora=Controller.getInstance().vratiListuProfesora();
        jComboBoxProfesor.removeAllItems();
        for (Profesor profesor : listaProfesora) {
            jComboBoxProfesor.addItem(profesor);
        }
    }
   
    private void osveziPodatke()
    {
        TableModelPredmeti tmp=new TableModelPredmeti(Controller.getInstance().vratiListuPredmeta());
        jTable1.setModel(tmp);
    }
}
