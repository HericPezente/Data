/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 * Classe utilitaria para representar um Data.
 * @author Heric Pezente
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    /**
     * Constroi uma Data
     * @param 
     * @param dia
     * @param mes
     * @param ano 
     */
    
    public Data(int dia, int mes, int ano){
        
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() throws IllegalArgumentException{
        return ano;
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
    
    
    
}
