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
public class Animal {
    private int id;
    private String regiaoOrigem;
    private Date dataNasc;
    private double peso;
    private String especie;
    private Tratador tratadorResponsavel;
    private ArrayList<Tratador> equipeTratadores;
    private RotinaTratamento rotinaTrabamento;
    private BoletimSaude boletimSaude;
    
}
