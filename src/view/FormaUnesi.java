/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.Controller;
import domain.Predmet;
import domain.Profesor;
import domain.Radnik;
import domain.Zvanje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class FormaUnesi extends javax.swing.JDialog {
private Radnik r=Controller.getInstance().getUlogovaniRadnik();
    /**
     * Creates new form FormaUnesi
     */
    public FormaUnesi(java.awt.Frame parent, boolean modal, int signal) {
        super(parent, modal);
        initComponents();
        this.popuniComboBoxProfesorima();
        r=Controller.getInstance().getUlogovaniRadnik();
        if(signal==1)
        {
            jButtonDodaj.setVisible(false);
        }
        else if(signal==2)
        {
            jButtonUnesi.setVisible(false);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jComboBoxZvanje = new javax.swing.JComboBox<>();
        jButtonUnesi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProfesor = new javax.swing.JComboBox<>();
        jTextFieldKod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldESPB = new javax.swing.JTextField();
        jButtonDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Zvanje");

        jComboBoxZvanje.setModel(new DefaultComboBoxModel(Zvanje.values()));

        jButtonUnesi.setText("Unesi");
        jButtonUnesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnesiActionPerformed(evt);
            }
        });

        jLabel4.setText("Profesor");

        jLabel5.setText("Kod");

        jLabel6.setText("Naziv");

        jLabel7.setText("ESPB");

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(39, 39, 39)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPrezime)
                                .addComponent(jComboBoxZvanje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldKod)
                            .addComponent(jComboBoxProfesor, 0, 179, Short.MAX_VALUE)
                            .addComponent(jTextFieldNaziv)
                            .addComponent(jTextFieldESPB))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUnesi, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jButtonDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUnesi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxZvanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDodaj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldESPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnesiActionPerformed
        String ime=jTextFieldIme.getText();
        String prezime=jTextFieldPrezime.getText();
        Zvanje zvanje=(Zvanje) jComboBoxZvanje.getSelectedItem();
        String email=r.getEmail();
        if(ime.isEmpty()||prezime.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "MORATE UNETI IME I PREZIME", "GRESKA!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            Controller.getInstance().dodajProfesora(ime, prezime, zvanje, email);
            JOptionPane.showMessageDialog(this, "USPESNO UNET PROFESOR", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonUnesiActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        String naziv=jTextFieldNaziv.getText();
        String kod=jTextFieldKod.getText();
        int espb=Integer.parseInt(jTextFieldESPB.getText());
        Profesor p=(Profesor) jComboBoxProfesor.getSelectedItem();
        int idp=p.getId();
        boolean rezultat=Controller.getInstance().dodajPredmet(naziv, kod, espb, idp);
        if(rezultat)
        {
            JOptionPane.showMessageDialog(this, "USPESNO UNET PREDMET", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);   
        }
        else
        {
            JOptionPane.showMessageDialog(this, "PROFESOR VEC IMA TRI PREDMETA!", "GRESKA!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDodajActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonUnesi;
    private javax.swing.JComboBox<Profesor> jComboBoxProfesor;
    private javax.swing.JComboBox<String> jComboBoxZvanje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldESPB;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldKod;
    private javax.swing.JTextField jTextFieldNaziv;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxProfesorima()
    {
        List<Profesor> listaProfesora=Controller.getInstance().vratiListuProfesora();
        jComboBoxProfesor.removeAllItems();
        for (Profesor profesor : listaProfesora) {
            jComboBoxProfesor.addItem(profesor);
        }
    }
}
