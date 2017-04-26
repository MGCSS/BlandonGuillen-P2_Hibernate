/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import Modelo.*;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Horizon
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Experto experto= new Experto();
        ManejaExperto manejaexperto= new ManejaExperto();
            
        int op;
        boolean entrar= false;
        String codexperto="";
        Scanner sc= new Scanner(System.in);
        
        do{
            op= Menu_Principal();

            switch (op){
                case 1: //Guardar un experto en la base de datos
                    System.out.println();
                    System.out.println("Guarda un experto en la base de datos.");
                    System.out.print("Introduce el codigo del experto: ");
                    experto.setCodexperto(sc.nextLine());
                    System.out.print("Nombre del experto: ");
                    experto.setNombre(sc.nextLine());

                    System.out.print("Nacionalidad del experto: ");
                    experto.setPais(sc.nextLine());
                    System.out.print("Especialidad del experto: ");
                    experto.setEspecialidad(sc.nextLine());
                    System.out.print("Sexo del experto: ");
                    experto.setSexo(sc.next().charAt(0));                    
                    manejaexperto.guardaExperto(experto);
                    sc.nextLine();
                    break;
                case 2: //Eliminar un experto de la base de datos
                    System.out.println();
                    System.out.println("Eliminar un experto de la base de datos.");
                    System.out.print("Introduce el codigo del experto a borrar: ");
                    experto.setCodexperto(sc.next());
                    
                    
                    experto.setNombre("s");
                    experto.setSexo('s');
                    experto.setPais("s");
                    experto.setEspecialidad("s");
                 
                    
                    manejaexperto.eliminaExperto(experto);
                    sc.nextLine();
                    break;
                case 3: //Actualizar un experto existente en la base de datos
                    System.out.println();
                    System.out.println("Actualiza un experto en la base de datos.");
                    System.out.print("Introduce el codigo del experto: ");
                    experto.setCodexperto(sc.nextLine());
                    System.out.print("Nombre del experto: ");
                    experto.setNombre(sc.nextLine());

                    System.out.print("Nacionalidad del experto: ");
                    experto.setPais(sc.nextLine());
                    System.out.print("Especialidad del experto: ");
                    experto.setEspecialidad(sc.nextLine());
                    System.out.print("Sexo del experto: ");
                    experto.setSexo(sc.next().charAt(0));  
                    
                    manejaexperto.actualizaExperto(experto);
                    sc.nextLine();
                    break;
                case 4: //Mostrar los datos de un experto
                    System.out.println();
                    System.out.println("Mostrar los datos de un experto.");
                    System.out.print("Introduce el codigo del experto a mostrar: ");
                    codexperto= sc.nextLine();
                    
                    experto= manejaexperto.obtenExperto(codexperto);
                    
                    if (experto != null){
                        System.out.println();
                        System.out.println("Codigo del experto: " + experto.getCodexperto());
                        System.out.println("Nombre del experto: " + experto.getNombre());
                        System.out.println("Sexo del experto: " + experto.getSexo());
                        System.out.println("Nacionalidad del experto: " + experto.getPais());
                        System.out.println("Especialidad del experto: " + experto.getEspecialidad());
                    }
                    else {
                        System.out.println("No existe ningun experto con el codigo: " + codexperto);
                    }
                    
                    System.out.println("Para continua pulse Intro.");
                    System.in.read(); 
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Opcion Incorrecta.");
                    break;                    
            }            
        }while(op != 5);        
    }

    private static int Menu_Principal() {
        Scanner sc= new Scanner(System.in);
        int op;
        
        System.out.println();
        System.out.println("Practica 2: Mapeado de Clases del Esquema Casos Policiales.");
        System.out.println("==========================================================");
        System.out.println("Opcion 1: Guardar un experto en la base de datos.");
        System.out.println("Opcion 2: Eliminar un experto de la base de datos.");        
        System.out.println("Opcion 3: Actualizar un experto existente en la base de datos.");
        System.out.println("Opcion 4: Mostrar los datos de un experto.");
        System.out.println("Opcion 5: Salir.");        
        System.out.print("Escoga una opcion: ");
        return op= sc.nextInt();
    }    
}
