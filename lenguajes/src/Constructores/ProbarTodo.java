/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import java.util.Set;

/**
 *
 * @author T-107
 */
public class ProbarTodo {
    
    public static void main (String[] args) {
        Test1 objeto1=new Test1 (8);
        Test1 objeto2=new Test1();
        
        JFrame ventana= JFrame("Mi primer ventana");
               ventana.setSize(400,400)  
               ventana.SetVisible(true);
                
        
    }

    private static JFrame JFrame(String mi_primer_ventana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
