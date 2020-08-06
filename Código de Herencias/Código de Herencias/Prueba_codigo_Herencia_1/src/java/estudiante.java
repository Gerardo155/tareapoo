/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GMG
 */
public class estudiante extends persona{
    private int codigoestudiante;
    private float notafinal;
    
    public estudiante (String nombre, String apellido, int edad, int codigoestudiante,float notafinal){
       super (nombre, apellido, edad);
       this. codigoestudiante=codigoestudiante;
       this. notafinal = notafinal; 
       
       }

public void mostrardatos () {
     System.out.println ("nombre: "+ getNombre()+
            "\napellido: "+getApellido()+ 
            "\nedad: "+getEdad()+
             "\ncodigo Estudiante:"+codigoestudiante+
             "\nNota Estudiante:" +notafinal);
}
}
 
    

