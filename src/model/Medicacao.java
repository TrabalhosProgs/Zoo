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
public class Medicacao {
    private int id;
    private Date periodoIni;
    private Date periodoFim;
    private String dose;
    private Medicamento medicamento;
    private Frequencia frequencia;

    public Medicacao() {
    }

    public Medicacao(int id, Date periodoIni, Date periodoFim, String dose, Medicamento medicamento, Frequencia frequencia) {
        this.id = id;
        this.periodoIni = periodoIni;
        this.periodoFim = periodoFim;
        this.dose = dose;
        this.medicamento = medicamento;
        this.frequencia = frequencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPeriodoIni() {
        return periodoIni;
    }

    public void setPeriodoIni(Date periodoIni) {
        this.periodoIni = periodoIni;
    }

    public Date getPeriodoFim() {
        return periodoFim;
    }

    public void setPeriodoFim(Date periodoFim) {
        this.periodoFim = periodoFim;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
    
}
