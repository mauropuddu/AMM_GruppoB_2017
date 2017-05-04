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
public class UtenteFactory {
   
    private static UtenteFactory singleton;
    
    public static UtenteFactory getInstance() {
    if (singleton == null) {
        singleton = new UtenteFactory();
    }
        return singleton;
    }
        
    
    
    ArrayList<Utente> utenteList = new ArrayList<>();
    
    private UtenteFactory(){

        
        // utente_1
        Utente utente_1 = new Utente();
        utente_1.setId(0);
        utente_1.setFname("Mauro");
        utente_1.setLname("Puddu");
        utente_1.setFoto_profilo("img/profilo3.jpg");
        utente_1.setPresentation("Ciao, mi chiamo Mauro e studio Informatica.");
        utente_1.setData("15/10/1992");
        utente_1.setUsername("maupud");
        utente_1.setPassword("mapu");
        utenteList.add(utente_1);
        
        // utente_2
        Utente utente_2 = new Utente();
        utente_2.setId(1);
        utente_2.setFname("Alessia");
        utente_2.setLname("Pistis");
        utente_2.setFoto_profilo("img/profilo1.jpg");
        utente_2.setPresentation("Ciao, mi chiamo Alessia e studio Economia.");
        utente_2.setData("15/10/1992");
        utente_2.setUsername("alepis");
        utente_2.setPassword("alpi");
        utenteList.add(utente_2);
        
        // utente_3
        Utente utente_3 = new Utente();
        utente_3.setId(2);
        utente_3.setFname("Valeria");
        utente_3.setLname("Cabiddu");
        utente_3.setFoto_profilo("img/profilo2.jpg");
        utente_3.setPresentation("Ciao, mi chiamo Valeria e mi sono iscritta da poco.");
        utente_3.setData("15/10/1992");
        utente_3.setUsername("valcab");
        utente_3.setPassword("vaca");
        utenteList.add(utente_3);
        
    }
    
    public Utente getUtenteById(int id){
        for(Utente utente : utenteList){
            if(utente.getId() == id){
                return utente;
            }
        }
        return null;
    }
    
    
    public Integer getIdByUserAndPassword(String username, String password){
        for(Utente utente : utenteList){
            if(utente.getUsername().equals(username) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }

}