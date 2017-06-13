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
    
}
