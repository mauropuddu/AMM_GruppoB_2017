/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classes;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class Gruppo {
    
    private int id;
    private String nome_gruppo;
    private ArrayList<Utente> componenti = new ArrayList<Utente>();

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome_gruppo
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }

    /**
     * @param nome_gruppo the nome_gruppo to set
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    
}
