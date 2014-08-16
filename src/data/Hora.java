/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 * Classe utilizada para representar uma data
 * @author Heric Pezente
 */
public class Hora {
    
    private int hora;
    private int minuto;
    
    /**
     * Constroi uma data
     * @param hora
     * @param minuto 
     */
    
    
    public Hora(int hora, int minuto){
        
        this.hora=hora;
        this.minuto=minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    
    
}
