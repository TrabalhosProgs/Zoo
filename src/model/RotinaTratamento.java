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
public class RotinaTratamento {
    private int id;
    private Date dataValidade;
    private Receita receita;
    private ArrayList<Tarefa> tarefas;

    public RotinaTratamento() {
        this.tarefas = new ArrayList<>();
    }

    public RotinaTratamento(int id, Date dataValidade, Receita receita, ArrayList<Tarefa> tarefas) {
        this.id = id;
        this.dataValidade = dataValidade;
        this.receita = receita;
        this.tarefas = tarefas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void addTarefa(Tarefa t){
        tarefas.add(t);
    }
    
    public void removeTarefa(int indice){
        tarefas.remove(indice);
    }
}
