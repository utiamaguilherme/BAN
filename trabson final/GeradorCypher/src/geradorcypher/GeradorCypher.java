/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorcypher;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author udesc
 */
public class GeradorCypher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File entrada = new File("Pessoas.txt");
        PrintWriter output = new PrintWriter("Cypher.top");
        FileInputStream input;
        InputStreamReader reader;
        BufferedReader buffer;
        
        input = new FileInputStream(entrada);
        reader = new InputStreamReader(input);
        buffer = new BufferedReader(reader);
        
        ArrayList<Pessoa> nomes = new ArrayList<>();
        
        for(int i=0; i<50; i++){
            nomes.add(new Pessoa(buffer.readLine()));
        }
        
        nomes.forEach((p) -> {
            System.out.println(p);
            output.println(p);
        });
        
        output.close();
        
    }
    
}
