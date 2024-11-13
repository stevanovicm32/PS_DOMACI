/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import domain.Predmet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class TableModelPredmeti extends AbstractTableModel {
    List<Predmet> listaPredmeta=new ArrayList<>();
    private final String[] kolone={"id","naziv","kod","espb","idp"};
    public TableModelPredmeti(List<Predmet> listaPredmeta){
        this.listaPredmeta=listaPredmeta;
    }

    public List<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

    public void setListaPredmeta(List<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }
    
    @Override
    public int getRowCount() {
        return listaPredmeta.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predmet predmet=listaPredmeta.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> predmet.getId();
            case 1 -> predmet.getNaziv();
            case 2 -> predmet.getKod();
            case 3 -> predmet.getEspb();
            case 4 -> predmet.getIdp();
            default -> "N/A";
        };
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    
    
}
