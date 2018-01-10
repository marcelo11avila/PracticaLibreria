package libreria;



import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel Vasquez
 */
public class Diccionario <K , V > {
    
    private Map <K , V > elemento;

    public Diccionario(Map<K, V> elemento) {
        this.elemento = elemento;
    }
    
    public boolean addElemento(K id, V persona){
        this.elemento.put(id, persona);
        return true;
    }
    public Object recuperarElemento(K id){
        this.elemento.get(id);
        return true;
    }
    public void recuperarElemento1(){
        for(Map.Entry<K,V> entry : elemento.entrySet()){
            System.out.println("clave="+entry.getKey()+", valor="+ entry.getValue());
        }
    }
    
    public boolean eliminarElemento(K id){
        this.elemento.remove(id);
        return true;
    }
            
    
    
    
    
    
    
    
    
}
