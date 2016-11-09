/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinoswing;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author omar-jp
 */
public class ListaVinos {
    
    private ArrayList<Vino> listaVino = new ArrayList<>();

    public ListaVinos() {
    }
    
    public void agregarVino(Vino obj){
        boolean seRepite = true;
        for(Vino x: listaVino){
            if(x.getCodigoVino().equals(obj.getCodigoVino())){
                seRepite = false;
                break;
            }            
        }
        if(seRepite)
            listaVino.add(obj);
        else
            JOptionPane.showMessageDialog(null, "El codigo de vino ya existe");
    }

    public ArrayList<Vino> getListaVino() {
        return this.listaVino;
    }

    public void setListaVino(ArrayList<Vino> listaVino) {
        this.listaVino = listaVino;
    }
    
    
    
}
