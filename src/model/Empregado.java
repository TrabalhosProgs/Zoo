/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import model.enu.EnumFuncao;

/**
 *
 * @author william
 */
public class Empregado {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private EnumFuncao funcao;
    private Date data;    

    public Empregado() {
    }

    public Empregado(int id, String nome, String endereco, String telefone, EnumFuncao funcao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcao = funcao;
    }
    
    public EnumFuncao getFuncao() {
        return funcao;
    }

    public void setFuncao(EnumFuncao funcao) {
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
