/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticos_y_dunamicos.java;

/**
 *
 * @author ISTLOJA1
 */
public class Estaticos_y_dinamicosJava {

    
    public static void main(String[] args) {
        saludar();
  //  para llamar un metodo static 
        Estaticos_y_Dinamicos objeto=new Estaticos_y_Dinamicos();
        objeto.despedir();
  // se llama aun metodo no estatico 
    }
    public static void saludar(){ // este es un metodo estatico 
        System.out.println("hola");
    }
    public void despedir(){ // este es un metodo no estatico 
        System.out.println("chao");
        
    }
        
    }

    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    private static void saludar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
