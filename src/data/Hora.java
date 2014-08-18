/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 * Classe utilizada para representar uma hora
 * @author Heric Pezente
 */
public class Hora {
    
    private int hora;
    private int minuto;
    
    /**
     * Constroi uma hora
     * @param hora
     * @param minuto 
     */
    public Hora(int hora, int minuto){
        
        this.hora=hora;
        this.minuto=minuto;
    }

    
    /**
     * Método de leitura responsavel por retornar a hora.
     * @param 
     * @return  hora do tipo int.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Metodo de leitura que retorna os minutos.
     * @return  minuto do tipo int.
     */
    public int getMinuto() {
        return minuto;
    }
    
    
}
