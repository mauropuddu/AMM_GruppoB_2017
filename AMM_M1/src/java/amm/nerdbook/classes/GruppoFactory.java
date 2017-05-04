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



public class GruppoFactory {
    
        private static GruppoFactory singleton;
    
        public static GruppoFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppoFactory();
        }
        return singleton;
    }
        
        
        private GruppoFactory() {

    }
        
        public ArrayList<Gruppo> getGruppoList(){
        
        ArrayList<Gruppo> gruppoList = new ArrayList<Gruppo>();

                
        // gruppo_1
        Gruppo gruppo_1 = new Gruppo();
        gruppo_1.setId(0);
        gruppo_1.setNome_gruppo("Partite di Calcio");
        gruppoList.add(gruppo_1);
        
        // gruppo_2
        Gruppo gruppo_2 = new Gruppo();
        gruppo_2.setId(1);
        gruppo_2.setNome_gruppo("Gruppo Sport");
        gruppoList.add(gruppo_2);
        
        // gruppo_3
        Gruppo gruppo_3 = new Gruppo();
        gruppo_3.setId(2);
        gruppo_3.setNome_gruppo("Università");
        gruppoList.add(gruppo_3);
        
        
        return gruppoList;
    }
    
    public Gruppo getGruppoById(int id){
        ArrayList<Gruppo> gruppoList = this.getGruppoList();
        for(Gruppo gruppo : gruppoList){
            if(gruppo.getId() == id){
                return gruppo;
            }
        }
        return null;
    }
    
    
}
        
