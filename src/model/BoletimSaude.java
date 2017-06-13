/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author william
 */
public class BoletimSaude {
    private ArrayList<RegistroClinico> registrosClinico;

    public BoletimSaude() {
        registrosClinico = new ArrayList<RegistroClinico>();
    }

    public BoletimSaude(ArrayList<RegistroClinico> registrosClinico) {
        this.registrosClinico = registrosClinico;
    }

    public ArrayList<RegistroClinico> getRegistrosClinico() {
        return registrosClinico;
    }

    public void setRegistrosClinico(ArrayList<RegistroClinico> registrosClinico) {
        this.registrosClinico = registrosClinico;
    }
    
    public void addRegistroClinico(RegistroClinico rc){
        registrosClinico.add(rc);
    }
    
    public void removeRegistroClinico(int indice){
        registrosClinico.remove(indice);
    }
       
}
