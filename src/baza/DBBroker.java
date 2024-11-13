/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domain.Predmet;
import domain.Profesor;
import domain.Zvanje;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DBBroker {

    public void dodajProfesora(String ime, String prezime, Zvanje zvanje, String email) {
        try {
            String upit="INSERT INTO PROFESOR(ime, prezime, zvanje, email) VALUES(?,?,?,?)";
            PreparedStatement ps=Konekcija.getInstance().getConnectin().prepareStatement(upit);
            ps.setString(1, ime);
            ps.setString(2, prezime);
            ps.setString(3, String.valueOf(zvanje));
            ps.setString(4, email);
            ps.executeUpdate();
            Konekcija.getInstance().getConnectin().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs;
    }

    public List<Profesor> vratiListuProfesora() {
        List<Profesor> profesor=new ArrayList<>();
        try {
            String upit="SELECT * FROM PROFESOR";
            Statement st=Konekcija.getInstance().getConnectin().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String ime=rs.getString("ime");
                String prezime=rs.getString("prezime");
                Zvanje zvanje=Zvanje.valueOf(rs.getString("zvanje"));
                String email=rs.getString("email");
                Profesor profa=new Profesor(id, ime, prezime, zvanje, email);
                profesor.add(profa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesor;
    }

    public boolean dodajPredmet(String naziv, String kod, int espb, int idp) {
        try {
            String upit="INSERT INTO PREDMET(naziv, kod, espb, idp) VALUES(?,?,?,?)";
            PreparedStatement ps=Konekcija.getInstance().getConnectin().prepareStatement(upit);
            ps.setString(1, naziv);
            ps.setString(2, kod);
            ps.setInt(3, espb);
            ps.setInt(4, idp);
            ps.executeUpdate();
            Konekcija.getInstance().getConnectin().commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Predmet> vratiListuPredmeta() {
        List<Predmet> predmet=new ArrayList<>();
        try {
            String upit="SELECT * FROM PREDMET";
            Statement st=Konekcija.getInstance().getConnectin().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String naziv=rs.getString("naziv");
                String kod=rs.getString("kod");
                int espb=rs.getInt("espb");
                int idp=rs.getInt("idp");
                Predmet pr=new Predmet(id, naziv, kod, espb, idp);
                predmet.add(pr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return predmet;
    }
}
