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
public class Tratador extends Empregado {
    private ArrayList<Tarefa> tarefas;

    public Tratador() {
        tarefas = new ArrayList<Tarefa>();
    }
    
    public Tratador(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void add(Tarefa t){
        tarefas.add(t);
    }
    
    public void remove(int indice){
        tarefas.remove(indice);
    }
}
