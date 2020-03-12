/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcypher;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author udesc
 */
public class Pessoa {
    
    public static String[] cidades = {"Andorhal", "Whiterun", "Fallen", "Seatown", "Dereguejohnson"};
    public String nome;
    public String email;
    public String cidadeN;
    public String cidadeR;
    public String nasc;
    
    public Pessoa(String nome){
        Random r = new Random();
        int dia, mes, ano;
        
        this.nome = nome;
        email = nome+"@udesc.sk";
        cidadeN = cidades[r.nextInt(5)];
        cidadeR = cidades[r.nextInt(5)];
        dia = r.nextInt(31)+1;
        mes = r.nextInt(12)+1;
        ano = r.nextInt(46)+1960;
        nasc = ""+dia+"-"+mes+"-"+ano;
    }
    
    public String toString(){
        return "CREATE ("+nome+":Pessoa {nome:'"+nome+"', email:'"+email+"', "
                + "dtNasc:'"+nasc+"', cdNasc:'"+cidadeN+"', cdResi:'"+cidadeR+"'})";
    }
    
}
