/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enu.EnumParecer;
import java.util.Date;

/**
 *
 * @author william
 */
public class BoletimAcompanhamento {
    private int id;
    private Date dataBoletim;
    private Tratador tratador;
    private String observacao;
    private EnumParecer tipo;
    private Animal animal;
    private boolean tarefaConcluida;
    
    public BoletimAcompanhamento() {
    }

    public BoletimAcompanhamento(int id, Date dataBoletim, Tratador tratador, String observacao, EnumParecer tipo, Animal animal, boolean tarefaConcluida) {
        this.id = id;
        this.dataBoletim = dataBoletim;
        this.tratador = tratador;
        this.observacao = observacao;
        this.tipo = tipo;
        this.animal = animal;
        this.tarefaConcluida = tarefaConcluida;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataBoletim() {
        return dataBoletim;
    }

    public void setDataBoletim(Date dataBoletim) {
        this.dataBoletim = dataBoletim;
    }

    public Tratador getTratador() {
        return tratador;
    }

    public void setTratador(Tratador tratador) {
        this.tratador = tratador;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public EnumParecer getTipo() {
        return tipo;
    }

    public void setTipo(EnumParecer tipo) {
        this.tipo = tipo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    
}
