/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinario1mt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maryt
 */
public class Ordinario1MT {

  
    
    public static void main(String[] args) {
        int x =1;
        int ab;
        Scanner op= new Scanner (System.in);
        Scanner r= new Scanner (System.in);
        
        Operaciones Op=new Operaciones();
       
        System.out.println("MENU");
        System.out.println("1.-Add A");
        System.out.println("2.-Add B");
        System.out.println("3.-AddUnique A");
        System.out.println("4.-AddUnique B");
        System.out.println("5.-Size A");
        System.out.println("6.-Size B");
        System.out.println("7.-get A ");
        System.out.println("8.-get B ");
        System.out.println("9.-Show Elements A");
        System.out.println("10.-Show Elements B");
        System.out.println("11.-Union");
        System.out.println("12.-Union All");
        System.out.println("13.-Minus");
        System.out.println("14.-Intersect");
        System.out.println("15.-Product");
        System.out.println("16.-Salir");
        
        do{ 
        System.out.print("Operación:");
        int Ope = op.nextInt();
        switch (Ope){
            case 1:
                System.out.println("¿Qué número desea ingresar en A?");
                ab=r.nextInt();
                Op.addA(ab);
                break;
            case 2:
                System.out.println("¿Qué número desea ingresar en B?");
                ab=r.nextInt();
                Op.addB(ab);
                break;
            case 3:
                System.out.println("¿Qué número desea ingresar en A?");
                ab=r.nextInt();
                Op.addUniqueA(ab);
                break;
            case 4:
                System.out.println("¿Qué número desea ingresar en B?");
                ab=r.nextInt();
                Op.addUniqueB(ab);
                break;
            case 5:
                System.out.println("El tamaño de  A");
                Op.sizeA();
                break;
            case 6:
                System.out.println("El tamaño de  B");
                Op.sizeB();
                break;
            case 7:
                System.out.println("Escriba el valor de la posición A que quiere obtener: (comienza en 1)");
                ab=r.nextInt();
                Op.getA(ab);
                break;
            case 8:
                System.out.println("Escriba el valor de la posición B que quiere obtener: (comienza en 1)");
                ab=r.nextInt();
                Op.getB(ab);
                break;
            case 9:
                System.out.println("Los elementos de A");
                Op.showElementsA();
                break;
            case 10:
                System.out.println("Los elementos de B");
                Op.showElementsB();
                break;
            case 11:
                System.out.println("La union de A y B: (Sin repetirse elementos)");
                Op.union();
                break;
            case 12:
                System.out.println("La union de A y B:");
                Op.unionAll();
                break;
            case 13:
                System.out.println(" A - B :");
                Op.minus();
                break;
            case 14:
                System.out.println(" La interseccion de A y B :");
                Op.intersect();
                break;
            case 15:
                System.out.println(" El producto de A x B :");
                Op.product();
                break;   
            case 16:
                x=0; 
        }
        }while(x==1);
  
        
    }
    
}
