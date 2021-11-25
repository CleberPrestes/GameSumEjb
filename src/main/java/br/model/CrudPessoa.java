
package br.model;

import java.util.ArrayList;
import java.util.Collections;
import lombok.Getter;
import lombok.Setter;


public class CrudPessoa {
    
    
    ArrayList<Pessoa> listPessoa = new ArrayList();
    
    public ArrayList<Pessoa> getAll(){
       Collections.sort(listPessoa);
        return listPessoa;
       
    }
    
    public void addPessoa(String nome, int pontos){
       
        boolean achou = false;
        
        for(Pessoa pessoa : listPessoa){
            
          
            
            if (pessoa.getNome().equals(nome)) {
                
                
                    pessoa.setPontos(pessoa.getPontos()+pontos);
              
                                
                
                               
                achou = true;
                break;
            }
            
        }
        
        if(!achou){
          
           listPessoa.add(new Pessoa(nome, pontos));
        }
        
        
        
        
    }
      
    @Getter
    @Setter
    private int pontos;
    
    @Getter
    @Setter
    private int acertou;
    
    
    
}
