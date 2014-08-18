/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *Classe utilizada para representar Data e Hora
 * @author Heric Pezente
 */
public class DataHora {
    
    Data data;
    Hora hora;
    
    /**
     * Constroi uma data e hora
     * @param data
     * @param hora 
     */
    public DataHora(Data data, Hora hora){
        this.data=data;
        this.hora=hora;
    }

    /**
     * Método de leitura responsavel por retornar uma Data.
     * @return data do tipo Data. 
     */ 
    public Data getData() {
        return data;
    }

    /**
     * Método responsavel por retornar uma Hora.
     * @return hora do tipo Hora.
     */ 
    public Hora getHora() {
        return hora;
    }
    
    
}
