/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinoswing;

import java.util.ArrayList;

/**
 *
 * @author omar-jp
 */
public class ListaVinos {
    
    private ArrayList<Vino> listaVino = new ArrayList<>();

    public ListaVinos() {
    }
    
    public void agregarVino(Vino obj){
        listaVino.add(obj);
    }
    
    public void listar(){
        for(Vino x : listaVino){
            System.out.println(x.toString());
        }
    }

    public ArrayList<Vino> getListaVino() {
        return this.listaVino;
    }

    public void setListaVino(ArrayList<Vino> listaVino) {
        this.listaVino = listaVino;
    }
    
    
    
}
