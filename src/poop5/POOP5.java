/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author hecman, Damian, jhonny
 */
import java.util.ArrayList;
import java.util.List;
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno =new Alumno();
        alumno.setNombre("Victor");
        alumno.setApellido("Osnaya");
        alumno.setCarrera("Terrorista");
        alumno.setEscuela("VirusAntrax");
        Fecha fecha=new Fecha(07,11,2004);
        Alumno alumno2=new Alumno("Jhonny","El0711","Sicario","IPN",4,fecha);
        String var=alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alumno2);
           Coche coche1 = new Coche("Toyota", "Camry", "Rojo", "V6", "Gasolina");
        coche1.avanzar();
        coche1.retroceder();
        System.out.println(coche1);

        // Ejemplo de la clase Profesor
        Profesor profesor = new Profesor("Fausto", "Pérez", 35, "Matemáticas");
        profesor.agregarCurso("Álgebra");
        profesor.agregarCurso("Cálculo");
        
        // Acceso a características del Profesor
        String nombreProfesor = profesor.obtenerNombre();
        String especialidadProfesor = profesor.obtenerEspecialidad();
        int edadProfesor = profesor.obtenerEdad();
        List<String> cursosProfesor = profesor.obtenerCursos();

        // Impresión de la información del Profesor
        System.out.println("Nombre del profesor: " + nombreProfesor);
        System.out.println("Especialidad del profesor: " + especialidadProfesor);
        System.out.println("Edad del profesor: " + edadProfesor);
        System.out.println("Cursos del profesor: " + cursosProfesor);

    }
    
}
