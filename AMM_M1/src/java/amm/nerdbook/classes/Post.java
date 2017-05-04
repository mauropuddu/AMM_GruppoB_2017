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
public class Post {
    
    private int id;
    private String utenteFName;
    private String utenteLName;
    private String post_foto_profilo;
    private int utenteid;
    private String testo_post;
    private String allegato;
    private int gruppoid;

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
     * @return the testo_post
     */
    public String getTesto_post() {
        return testo_post;
    }

    /**
     * @param testo_post the testo_post to set
     */
    public void setTesto_post(String testo_post) {
        this.testo_post = testo_post;
    }

    /**
     * @return the foto_allegato
     */
    public String get_allegato() {
        return allegato;
    }

    /**
     * @param foto_allegato the foto_allegato to set
     */
    public void set_allegato(String foto_allegato) {
        this.allegato = foto_allegato;
    }
    
    /**
     * @return the gruppoid
     */
    public int getGruppoid() {
        return gruppoid;
    }

    /**
     * @param gruppoid the gruppoid to set
     */
    public void setGruppoid(int gruppoid) {
        this.gruppoid = gruppoid;
    }

    /**
     * @return the utenteFName
     */
    public String getUtenteFName() {
        return utenteFName;
    }

    /**
     * @param utenteFName the utenteFName to set
     */
    public void setUtenteFName(String utenteFName) {
        this.utenteFName = utenteFName;
    }

    /**
     * @return the utenteLName
     */
    public String getUtenteLName() {
        return utenteLName;
    }

    /**
     * @param utenteLName the utenteLName to set
     */
    public void setUtenteLName(String utenteLName) {
        this.utenteLName = utenteLName;
    }

    /**
     * @return the utenteid
     */
    public int getUtenteid() {
        return utenteid;
    }

    /**
     * @param utenteid the utenteid to set
     */
    public void setUtenteid(int utenteid) {
        this.utenteid = utenteid;
    }

    /**
     * @return the post_foto_profilo
     */
    public String getPost_foto_profilo() {
        return post_foto_profilo;
    }

    /**
     * @param post_foto_profilo the post_foto_profilo to set
     */
    public void setPost_foto_profilo(String post_foto_profilo) {
        this.post_foto_profilo = post_foto_profilo;
    }



    
}
