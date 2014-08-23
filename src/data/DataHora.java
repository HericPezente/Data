/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Override
    public String toString() {
        String s=null;
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy H:mm");
        try{
        Date dt=sdf.parse(this.getData()+" "+this.getHora());
        s= sdf.format(dt);
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        return s;
        }

    @Override
    public boolean equals(Object obj) {
        DataHora novaDataHora=(DataHora) obj;
        if(this.data.equals(novaDataHora.getData()) && this.hora.equals(novaDataHora.getHora())){
            return true;
        }else
            return false;
    }
    
    
    
    
    
}
