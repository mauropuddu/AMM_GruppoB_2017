/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classes;

/**
 *
 * @author mauro
 */
public class Utente {
    
    private int id;
    private String fname;
    private String lname;
    private String presentation;
    private String data;
    private String foto_profilo;
    private String username;
    private String password;

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
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the presentation
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * @param presentation the presentation to set
     */
    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the foto_profilo
     */
    public String getFoto_profilo() {
        return foto_profilo;
    }

    /**
     * @param foto_profilo the foto_profilo to set
     */
    public void setFoto_profilo(String foto_profilo) {
        this.foto_profilo = foto_profilo;
    }
}
