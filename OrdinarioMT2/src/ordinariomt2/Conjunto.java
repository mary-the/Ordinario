/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinariomt2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Maryt
 */
public class Conjunto implements Conjuntable {
    ArrayList<Alumno> A = new ArrayList<Alumno>();
    ArrayList<Alumno> B = new ArrayList<Alumno>();
    ArrayList<Alumno> C = new ArrayList<Alumno>();
    ArrayList<Alumno> Z = new ArrayList<Alumno>();
    ArrayList<Alumno> X = new ArrayList<Alumno>();
    
    Conjunto(){
        
        
    }

    
    //Insertar elemento al conjunto
    public void addA(Alumno a){         
         A.add(a);           
    }
    public void addB(Alumno b){         
         B.add(b);           
    }    

    
    public void addUniqueA(Alumno a){
        int h=0;
        
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i)==a){
                
                System.out.println("Ya existe");
                i=(A.size()-1);
            }else{
                
                if(i==A.size()-1){
                    h=1;
                }
                
            }
        }
        if((h==1)||(A.size()==0)){
            A.add(a);
        }
    }
    
    public void addUniqueB(Alumno b){
       int h=0;
        
        for (int i = 0; i < B.size(); i++) {
            if(B.get(i)==b){
                
                System.out.println("Ya existe");
                i=(B.size()-1);
            }else{
                
                if(i==B.size()-1){
                    h=1;
                }
                
            }
        }
        if((h==1)||(B.size()==0)){
            B.add(b);
        }
    }
 

    public void sizeA(){    
        System.out.println(A.size());
    }
    
    public void sizeB(){
        System.out.println(B.size());
    }

    public void getA(int i){    
        System.out.println(A.get(i-1).getNombreCompleto());
    }
    
    public void getB(int i){    
        System.out.println(B.get(i-1).getNombreCompleto());
    }

    public void showElementsA() {
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i).getNombreCompleto());
        }
        
    }
    
    public void showElementsB() {
         for (int i = 0; i < B.size(); i++) {
            System.out.println(B.get(i).getNombreCompleto());
        }
    }

     public void union(){
        Collection<Alumno> different = new HashSet<Alumno>();
        different.addAll(A);
        different.addAll(B);
        
        System.out.printf("C:%s%n",different);      
     }
     
     public void unionAll(){
        C.clear();
        C.addAll(A);
        C.addAll(B);
        System.out.println("C:"+C);
     }
     
     public void minus(){
         C.clear();
         C.addAll(A);
         C.removeAll(B);
        System.out.println(C);
     }
     
     public void intersect(){
        C.clear();
        C.addAll(A);
        C.retainAll(B);
        System.out.println(C);
     }
     
     public void product(){
         System.out.print("R=[");
         for (int i = 0; i < A.size(); i++) {
             for (int j = 0; j < B.size(); j++) {
                 System.out.print("("+A.get(i)+","+B.get(j)+")");
             }
         }
         System.out.println("]");
         
     }

    @Override
    public int compareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
