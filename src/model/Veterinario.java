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
public class Veterinario extends Empregado{
    private String numeroCRMV;
    private Date dataCRMV;

    public Veterinario() {
        super();
    }

    public Veterinario(String numeroCRMV, Date dataCRMV, int id, String nome, String endereco, String telefone) {
        super(id, nome, endereco, telefone);
        this.numeroCRMV = numeroCRMV;
        this.dataCRMV = dataCRMV;
    }

    public String getNumeroCRMV() {
        return numeroCRMV;
    }

    public void setNumeroCRMV(String numeroCRMV) {
        this.numeroCRMV = numeroCRMV;
    }

    public Date getDataCRMV() {
        return dataCRMV;
    }

    public void setDataCRMV(Date dataCRMV) {
        this.dataCRMV = dataCRMV;
    }
}
