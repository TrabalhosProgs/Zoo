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
}
