/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Lenovo
 */
public class Predmet {
    private int id;
    private String naziv;
    private String kod;
    private int espb;
    private int idp;

    public Predmet() {
    }

    public Predmet(int id, String naziv, String kod, int espb, int idp) {
        this.id = id;
        this.naziv = naziv;
        this.kod = kod;
        this.espb = espb;
        this.idp = idp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }
    
    @Override
    public String toString() {
        return "Predmet{" + "id=" + id + ", naziv=" + naziv + ", kod=" + kod + ", espb=" + espb + '}';
    }
}
