/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinariomt2;

import java.util.Scanner;

/**
 *
 * @author Maryt
 */
public class Inicio {
    
    
    public static void main(String[] args) {
        int al=0;
        
     int x =1;
        int ab;
        String nombre;
        String curp;
        String carrera;
        String promedio;
        Scanner op= new Scanner (System.in);
        Scanner r= new Scanner (System.in);
    
        Conjunto Op=new Conjunto();
       
        System.out.println("MENU");
        System.out.println("1.-Añadir alumno La Salle");
        System.out.println("2.-Añadir alumno Anahuac");
        System.out.println("3.-Añadir alumno(sin repetir) La Salle");
        System.out.println("4.-Añadir alumno(sin repetir) Anahuac");
        System.out.println("5.-Cantidad de alumnos en La Salle");
        System.out.println("6.-Cantidad de alumnos en la Anahuac");
        System.out.println("7.-Obtener Alumno de La Salle");
        System.out.println("8.-Obtener Alumno de Anahuac ");
        System.out.println("9.-Mostrar Alumnos de La Salle");
        System.out.println("10.-Mostrar Alumnos de La Anahuac");
        System.out.println("11.-Alumnos de La Salle y de La anahuac (Sin repetir)");
        System.out.println("12.-Alumnos de La Salle y de La anahuac");
        System.out.println("13.-Alumnos de La Salle que no estudian en la Anahuac");
        System.out.println("14.-Alumnos de La Salle que estudian tambien en la Anahuac");
        System.out.println("15.-Parejas de Alumnos");
        System.out.println("16.-Salir");
        
        do{ 
        System.out.print("Operación:");
        int Ope = op.nextInt();
        switch (Ope){
            case 1:
                System.out.println("Añadir Alumno a La Salle");
                System.out.println("Nombre Completo:");
                nombre=r.nextLine();
                System.out.println("CURP");
                curp=r.nextLine();
                System.out.println("Carrera");
                carrera=r.nextLine();
                System.out.println("Promedio");
                promedio=r.nextLine();
                Persona a = new Persona(curp,nombre);
                Alumno alum= new Alumno(carrera,Float.parseFloat(promedio),curp,nombre);
                Op.addA(alum);
                break;
            case 2:
                System.out.println("Añadir Alumno a La Salle");
                System.out.println("Nombre Completo:");
                nombre=r.nextLine();
                System.out.println("CURP");
                curp=r.nextLine();
                System.out.println("Carrera");
                carrera=r.nextLine();
                System.out.println("Promedio");
                promedio=r.nextLine();
                Persona ana = new Persona(curp,nombre);
                Alumno aluman= new Alumno(carrera,Float.parseFloat(promedio),curp,nombre);
                Op.addB(aluman);
                break;
            case 3:
                System.out.println("Añadir Alumno a La Salle");
                System.out.println("Nombre Completo:");
                nombre=r.nextLine();
                System.out.println("CURP");
                curp=r.nextLine();
                System.out.println("Carrera");
                carrera=r.nextLine();
                System.out.println("Promedio");
                promedio=r.nextLine();
                Persona aun = new Persona(curp,nombre);
                Alumno alumun= new Alumno(carrera,Float.parseFloat(promedio),curp,nombre);
                Op.addUniqueA(alumun);
                break;
            case 4:
                System.out.println("Añadir Alumno a La Salle");
                System.out.println("Nombre Completo:");
                nombre=r.nextLine();
                System.out.println("CURP");
                curp=r.nextLine();
                System.out.println("Carrera");
                carrera=r.nextLine();
                System.out.println("Promedio");
                promedio=r.nextLine();
                Persona aunan = new Persona(curp,nombre);
                Alumno alumunan= new Alumno(carrera,Float.parseFloat(promedio),curp,nombre);
                Op.addUniqueA(alumunan);
                break;
            case 5:
                System.out.println("La cantidad de alumnos en La Salle");
                Op.sizeA();
                break;
            case 6:
                System.out.println("La cantidad de alumnos en la Anahuac");
                Op.sizeB();
                break;
            case 7:
                System.out.println("Escribir el número de alumno de LaSalle (comienza en 1)");
                ab=r.nextInt();
                Op.getA(ab);
                break;
            case 8:
                System.out.println("Escribir el número de alumno de la Anahuac (comienza en 1)");
                ab=r.nextInt();
                Op.getB(ab);
                break;
            case 9:
                System.out.println("Los alumnos de La Salle");
                Op.showElementsA();
                break;
            case 10:
                System.out.println("Los alumnos de la Anahuac");
                Op.showElementsB();
                break;
            case 11:
                System.out.println("Los alumnos de La Salle y La anahuac");
                Op.union();
                break;
            case 12:
                System.out.println("Los alumnos de La Salle y La anahuac (repetidos)");
                Op.unionAll();
                break;
            case 13:
                System.out.println(" Los alumnos de La salle que no van en la anahuac");
                Op.minus();
                break;
            case 14:
                System.out.println(" Los alumnos de la salle que tambien van en la anahuac");
                Op.intersect();
                break;
            case 15:
                System.out.println(" Parejas");
                Op.product();
                break;   
            case 16:
                x=0; 
        }
        }while(x==1);
  
        
        
        
        
    }
}
