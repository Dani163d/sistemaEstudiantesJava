package gm.presentacion;

import gm.datos.EstudianteDAO;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        // Se crear una instancia clase servicio
        var estudianteDao = new EstudianteDAO();
        while(!salir){
            try {
                mostrarMenu();
                //salir = ejecutarOpciones(consola, estudianteDao);
            } catch(Exception e){
                System.out.println("Ocurrio un error al ejecutar operacion: "
                        + e.getMessage());
            }
            System.out.println();
        }// fin while
    }

    public static void mostrarMenu(){
        System.out.println("""
            *** Sistema de Estudiantes ***
            1. Listar Estudiantes
            2. Buscar Estudiante
            3. Agregar Estudiante
            4. Modificar Estudiante
            5. Eliminar Estudiante
            6. Salir
            Elige una opcion: 
            """);
    }

}