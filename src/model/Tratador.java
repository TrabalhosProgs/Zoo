/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.enu.EnumFuncao;

/**
 *
 * @author william
 */
public class Tratador extends Empregado {
    private ArrayList<Tarefa> tarefas;

    public Tratador() {
        super(0, "", "", "",EnumFuncao.TRATADOR);
        tarefas = new ArrayList<Tarefa>();
    }

    public Tratador(int id, String nome, String endereco, String telefone) {
        super(id, nome, endereco, telefone,EnumFuncao.TRATADOR);
        tarefas = new ArrayList<Tarefa>();
    }

    public Tratador(int id, String nome, String endereco, String telefone, ArrayList<Tarefa> tarefas) {
        super(id, nome, endereco, telefone,EnumFuncao.TRATADOR);
        this.tarefas = tarefas;
    }
    
    
    
    public Tratador(ArrayList<Tarefa> tarefas) {
        super(0, "", "", "", EnumFuncao.TRATADOR);
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
