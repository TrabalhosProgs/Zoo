/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enu.EnumTipoAtendimento;
import java.util.ArrayList;

/**
 *
 * @author william
 */
public class RegistroClinico {
    private int id;
    private String diagnostico;
    private String observacao;
    private Veterinario veterinario;
    private Animal animal;
    private EnumTipoAtendimento tipoAtendimento;
    private ArrayList<Vacina> vacina;
    
}
