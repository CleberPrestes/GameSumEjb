
package br.ejb;

import java.util.Random;
import javax.ejb.Stateless;
import lombok.Getter;
import lombok.Setter;


@Stateless
public class EjbRandom {

    
    Random  rand = new Random();

    public EjbRandom() {
    }
    
     public int randomNumber(){
        
       return rand.nextInt(100);
    }
     
      
    public int palpite(int resultado, int palpite){
       
        if(palpite==resultado){
            
            
            
            return 1;
            
            
        }
        else{
            return 0;
        }
        
    }
    
    @Getter
    @Setter
    private int valorA;
    
    @Getter
    @Setter
    private int valorB;
    
}
