/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;

/**
 *
 * @author Fernando Padilla
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("  UNIVERSIDAD DE LAS FEURZAS ARMADAS ESPE ");
        System.out.println("Apellidos y Nombres:\n   -Padilla Castro Fernando Jose");
        System.out.println("Materia:\n   -Progrmacion [7450]");
        System.out.println("Carrera: Ingenieria Automotriz\n");
        System.out.println("           - COLLECCION TAREA 1 - \n");
        
        Collection MaterialesProyecto = new ArrayList<String>();
        MaterialesProyecto.add("Bateria de un Automovil");
        MaterialesProyecto.add("Juego de Llaves");
        MaterialesProyecto.add("Desarmadores");
        MaterialesProyecto.add("Cepillo de acero");
        MaterialesProyecto.add("Bicarbonato de sodio ");
        MaterialesProyecto.add("Cuchara");
        MaterialesProyecto.add("Recipiente con agua");
        MaterialesProyecto.add("Trapos");
       
        System.out.println("--El numero de materiales para utilizar son: "+MaterialesProyecto.size()+"\n");
        System.out.println("--LOS MATERIALES UTILIZADOS SON: ");
        System.out.println(MaterialesProyecto.toString());
        
        MaterialesProyecto.remove("Desarmadores");
        System.out.println("--Elementos utilizados en el Proyecto: "+MaterialesProyecto.size());
        System.out.println("--LAS HERRAMIENTAS UTILIZADAS SON: ");
        System.out.println(MaterialesProyecto.toString());  
    }
    
}
