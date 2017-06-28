/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author william
 */
public class Animal {
    private int id;
    private String nome;
    private String regiaoOrigem;
    private Date dataNasc;
    private double peso;
    private String especie;
    private Tratador tratadorResponsavel;
    private ArrayList<Tratador> equipeTratadores;
    private RotinaTratamento rotinaTrabamento;
    //private BoletimSaude boletimSaude;

    public Animal() {
    }

    public Animal(int id, String nome, String regiaoOrigem, Date dataNasc, double peso, String especie, Tratador tratadorResponsavel, ArrayList<Tratador> equipeTratadores, RotinaTratamento rotinaTrabamento/*, BoletimSaude boletimSaude*/) {
        this.id = id;
        this.nome = nome;
        this.regiaoOrigem = regiaoOrigem;
        this.dataNasc = dataNasc;
        this.peso = peso;
        this.especie = especie;
        this.tratadorResponsavel = tratadorResponsavel;
        this.equipeTratadores = equipeTratadores;
        this.rotinaTrabamento = rotinaTrabamento;
        //this.boletimSaude = boletimSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegiaoOrigem() {
        return regiaoOrigem;
    }

    public void setRegiaoOrigem(String regiaoOrigem) {
        this.regiaoOrigem = regiaoOrigem;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Tratador getTratadorResponsavel() {
        return tratadorResponsavel;
    }

    public void setTratadorResponsavel(Tratador tratadorResponsavel) {
        this.tratadorResponsavel = tratadorResponsavel;
    }

    public ArrayList<Tratador> getEquipeTratadores() {
        return equipeTratadores;
    }

    public void setEquipeTratadores(ArrayList<Tratador> equipeTratadores) {
        this.equipeTratadores = equipeTratadores;
    }
    
    public void addTratadorEquipe(Tratador t){
        equipeTratadores.add(t);
    }
    
    public void removeTratadorEquipe(int indice){
        equipeTratadores.remove(indice);
    }
    
    public RotinaTratamento getRotinaTrabamento() {
        return rotinaTrabamento;
    }

    public void setRotinaTrabamento(RotinaTratamento rotinaTrabamento) {
        this.rotinaTrabamento = rotinaTrabamento;
    }

    /*public BoletimSaude getBoletimSaude() {
        return boletimSaude;
    }

    public void setBoletimSaude(BoletimSaude boletimSaude) {
        this.boletimSaude = boletimSaude;
    }*/
    
    
}
