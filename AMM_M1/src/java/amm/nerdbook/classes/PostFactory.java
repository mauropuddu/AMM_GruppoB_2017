/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauro
 */
public class PostFactory {
    
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    
    }
    
    private PostFactory() {

    }
    
    public ArrayList<Post> getPostList(){
        
        ArrayList<Post> postList = new ArrayList<>();
        
        // Post1
        Post post_1 = new Post();
        post_1.setId(0);
        post_1.setUtenteFName("Mauro");
        post_1.setUtenteFName("Puddu");
        post_1.setPost_foto_profilo("img/profilo3.jpg");
        post_1.setUtenteid(0);
        post_1.setGruppoid(0);
        post_1.setTesto_post("Oggi è stata un bella giornata, viva NerdBook!");
        post_1.set_allegato("");
        postList.add(post_1);
        
        // Post2
        Post post_2 = new Post();
        post_2.setId(1);
        post_2.setUtenteFName("Alessia");
        post_2.setUtenteFName("Pistis");
        post_2.setPost_foto_profilo("img/profilo1.jpg");
        post_2.setUtenteid(0);
        post_2.setGruppoid(0);
        post_2.setTesto_post("Sono in ritorno dal mio viaggio, è stata una settimana bellissima, consiglio a tutti di visitare tutto il mondo.");
        post_2.set_allegato("img/viaggio.jpg");
        postList.add(post_2);
        
        // Post3
        Post post_3 = new Post();
        post_3.setId(2);
        post_3.setUtenteFName("Valeria");
        post_3.setUtenteFName("Cabiddu");
        post_3.setPost_foto_profilo("img/profilo2.jpg");
        post_3.setUtenteid(0);
        post_3.setGruppoid(1);
        post_3.setTesto_post("Finalmente il mio blog inizia a ricevere parecchi visite. Grazie a tutti quelli che mi seguono e mi supportano.");
        post_3.set_allegato("Visita il mio blog");
        postList.add(post_3);
        
        
        return postList;
    }
    
    public Post getPostById(int id){
        ArrayList<Post> postList = this.getPostList();
        for(Post post : postList){
            if(post.getId() == id){
                return post;
            }
        }
        return null;
    }
    
    public List<Post> getPostList(Utente usr){
        List<Post> postList = this.getPostList();
        List<Post> postUtente = null; 
        
        for(Post post : postList){
            
            if(post.getUtenteFName().equals(usr.getFname()) 
                && post.getUtenteFName().equals(usr.getFname())  
                && post.getUtenteid()==usr.getId()
                ){
                
               postUtente.add(post);
            }
            
        }
        return postUtente;       
    }
    
    public List<Post> getPostList(Gruppo gr){
        List<Post> postList = this.getPostList();
        List<Post> postGruppo = null; 
        for(Post post : postList){
            if(post.getGruppoid() == gr.getId()){
               postGruppo.add(post); 
            }
            
        }
        return postGruppo;       
    }
    
    
}