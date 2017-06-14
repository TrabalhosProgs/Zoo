/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author william
 */
public class Consulta {
    private int id;
    private Date dataHoraPrevista;
    private Date dataHoraRealizacao;
    private Veterinario veterinario;
    private Animal animal;

    public Consulta() {
    }
    
    public Consulta(int id, Date dataHoraPrevista, Date dataForaRealizacao, Veterinario veterinario, Animal animal) {
        this.id = id;
        this.dataHoraPrevista = dataHoraPrevista;
        this.dataHoraRealizacao = dataForaRealizacao;
        this.veterinario = veterinario;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataHoraPrevista() {
        return dataHoraPrevista;
    }

    public void setDataHoraPrevista(Date dataHoraPrevista) {
        this.dataHoraPrevista = dataHoraPrevista;
    }

    public Date getDataHoraRealizacao() {
        return dataHoraRealizacao;
    }

    public void setDataHoraRealizacao(Date dataHoraRealizacao) {
        this.dataHoraRealizacao = dataHoraRealizacao;
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
    
    
}
