/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import domain.Predmet;
import domain.Profesor;
import domain.Radnik;
import domain.Zvanje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Controller {
    private DBBroker dbb;
    Radnik ulogovaniRadnik=new Radnik();
    private List<Radnik> listaRadnika=new ArrayList<>();
    
    private static Controller instance;
    public static Controller getInstance() {
        if(instance==null)
        {
            instance=new Controller();
        }
        return instance;
    }
    
    private Controller()
    {
        dbb=new DBBroker();
        Radnik r1=new Radnik("Masa","Stevanovic","masa","masa");
        listaRadnika.add(r1);
    }

    public Radnik getUlogovaniRadnik() {
        return ulogovaniRadnik;
    }

    public void setUlogovaniRadnik(Radnik ulogovaniRadnik) {
        this.ulogovaniRadnik = ulogovaniRadnik;
    }
    
    public List<Radnik> getListaRadnika() {
        return listaRadnika;
    }

    public void setListaRadnika(List<Radnik> listaRadnika) {
        this.listaRadnika = listaRadnika;
    }
    
    public Radnik login1(String mail, String pass) {
        for (Radnik r : listaRadnika) {
            if(r.getEmail().equalsIgnoreCase(mail)&&r.getLozinka().equals(pass))
            {
                System.out.println(r.toString());
                return r;
            }
        }
        return null;
    }

    public void dodajProfesora(String ime, String prezime, Zvanje zvanje, String email) {
        dbb.dodajProfesora(ime, prezime, zvanje, email);
    }

    public List<Profesor> vratiListuProfesora() {
        return dbb.vratiListuProfesora();
    }
    
    public List<Predmet> vratiListuPredmeta() {
        return dbb.vratiListuPredmeta();
    }

    public boolean dodajPredmet(String naziv, String kod, int espb, int idp) {
        int brojac=0;
        List<Predmet> p=Controller.getInstance().vratiListuPredmeta();
        for (Predmet predmet : p) {
            if(predmet.getIdp()==idp)
            {
                brojac++;
            }
            if(brojac==3)
            {
                return false;
            }
        }
        return dbb.dodajPredmet(naziv, kod, espb, idp);
    }
    
}
