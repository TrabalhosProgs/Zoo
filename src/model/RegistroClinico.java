/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enu.EnumTipoAtendimento;
import java.util.ArrayList;

/**
 *
 * @author william
 */
public class RegistroClinico {
    private int id;
    private String diagnostico;
    private String observacao;
    private Veterinario veterinario;
    private Animal animal;
    private EnumTipoAtendimento tipoAtendimento;
    private ArrayList<Vacina> vacinas;

    public RegistroClinico() {
    }

    public RegistroClinico(int id, String diagnostico, String observacao, Veterinario veterinario, Animal animal, EnumTipoAtendimento tipoAtendimento, ArrayList<Vacina> vacinas) {
        this.id = id;
        this.diagnostico = diagnostico;
        this.observacao = observacao;
        this.veterinario = veterinario;
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.vacinas = vacinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public EnumTipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(EnumTipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    public void addVacina(Vacina v){
        vacinas.add(v);
    }
    
    public void removeVacina(int indice){
        vacinas.remove(indice);
    }
}
