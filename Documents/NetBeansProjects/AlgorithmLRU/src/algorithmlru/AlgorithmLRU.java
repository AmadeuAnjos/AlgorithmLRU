/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlru;
import java.util.ArrayList; 

/**
 *
 * @author pc
 */
public class AlgorithmLRU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    // Variáveis para criar páginas e Array   
        int capacidade = 4; 
        int array[] = {1, 8, 3, 5, 4, 0, 4, 
                7, 9, 0, 8, 1, 6, 9, 1, 5, 9}; 
          
    // Representa o conjunto de páginas atuais   
        ArrayList <Integer> x = new ArrayList<>(capacidade); 
        int count=0;
        int falta_de_pagina = 0;
        for(int i:array) 
        { 
    
    // Insere no conjunto se não estiver presente
    // Sendo que representa falta de página
            if(!x.contains(i)) 
            { 
    // Verifica se contém páginas iguais         
            if(x.size()==capacidade) 
            { 
                x.remove(0); 
                x.add(capacidade-1,i); 
            } 
            else
                x.add(count,i); 
  
    // Incrementa falta de página
                falta_de_pagina ++; 
                ++ count; 
          
            } 
            else
            { 
                
    // Remove indices de páginas            
                x.remove((Object)i); 
    
    // Insere página atual            
                x.add(x.size(),i);          
            } 
          
        } 
    // Imprime faltas de página    
        System.out.println(falta_de_pagina); 
    
    }
    
}
