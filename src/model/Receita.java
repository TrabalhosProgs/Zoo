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
public class Receita {
    private int id;
    private Date data;
    private String observacao;
    private ArrayList<Medicacao> medicacoes;
    private Animal animal;
    private Veterinario veterinario;

    public Receita() {
    }

    public Receita(int id, Date data, String observacao, ArrayList<Medicacao> medicacoes, Animal animal, Veterinario veterinario) {
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.medicacoes = medicacoes;
        this.animal = animal;
        this.veterinario = veterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ArrayList<Medicacao> getMedicacoes() {
        return medicacoes;
    }

    public void setMedicacoes(ArrayList<Medicacao> medicacoes) {
        this.medicacoes = medicacoes;
    }

    public void addMedicacao(Medicacao m){
        medicacoes.add(m);
    }
    
    public void removeMedicacao(int indice){
        medicacoes.remove(indice);
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    
}
