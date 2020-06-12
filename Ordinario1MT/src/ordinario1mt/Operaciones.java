/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinario1mt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Maryt
 */
public class Operaciones {
    
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();
    ArrayList<Integer> C = new ArrayList<Integer>();
    ArrayList<Integer> Z = new ArrayList<Integer>();
    ArrayList<Integer> X = new ArrayList<Integer>();
    
    Operaciones(/*ArrayList A,ArrayList B*/){
    //this.A=A;
    //this.B=B;
    
    }
    
    //Insertar elemento al conjunto
    public void addA(int a){         
         A.add(a);           
    }
    public void addB(int b){         
         B.add(b);           
    }    

    
    public void addUniqueA(int a){
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
    
    public void addUniqueB(int b){
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
        System.out.println(A.get(i-1));
    }
    
    public void getB(int i){    
        System.out.println(B.get(i-1));
    }

    public void showElementsA() {
        System.out.println("A:"+A);
    }
    
    public void showElementsB() {
        System.out.println("B:"+B);
    }

     public void union(){
        Collection<Integer> different = new HashSet<Integer>();
        different.addAll( A);
        different.addAll( B );
        
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


    
}
