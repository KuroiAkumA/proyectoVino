/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinoswing;

/**
 *
 * @author omar-jp
 */
public class Cepa {
    
    private String tipoCepa;
    private String descripcionCepa;

    public Cepa() {
    }

    public Cepa(String tipoCepa, String descripcionCepa) {
        this.tipoCepa = tipoCepa;
        this.descripcionCepa = descripcionCepa;
    }

    public String getTipoCepa() {
        return tipoCepa;
    }

    public void setTipoCepa(String tipoCepa) {
        this.tipoCepa = tipoCepa;
    }

    public String getDescripcionCepa() {
        return descripcionCepa;
    }

    public void setDescripcionCepa(String descripcionCepa) {
        this.descripcionCepa = descripcionCepa;
    }
    
    
    
}
