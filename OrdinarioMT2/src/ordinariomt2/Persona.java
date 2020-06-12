/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinariomt2;

/**
 *
 * @author Maryt
 */
public class Persona {
    private String CURP;
    private String nombreCompleto;

    Persona(String curp,String nombre){
    this.CURP=curp;
    this.nombreCompleto=nombre;
    }
    
    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    
    
}
