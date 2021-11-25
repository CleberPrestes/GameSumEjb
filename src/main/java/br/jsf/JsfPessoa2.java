/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.ejb.EjbPessoa;
import br.ejb.EjbRandom;
import br.model.Pessoa;
import br.model.Resultado;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import lombok.Getter;
import lombok.Setter;


@Named(value = "jsfPessoa2")
@SessionScoped
public class JsfPessoa2 implements Serializable {

    @EJB
    private EjbRandom ejbRandom;

    @EJB
    private EjbPessoa ejbPessoa;
    
    Resultado result = new Resultado();
    
    public JsfPessoa2() {
           
       
    }

       
   
    public ArrayList<Pessoa> getAll(){
        
       return ejbPessoa.getAll();
    }
    
     public void sortear(){
        valorA = ejbRandom.randomNumber();
        valorB = ejbRandom.randomNumber();
        resultado = valorA+valorB;
     }
    
    public void addPessoa(){
        
        ejbPessoa.addPessoa(nome, ejbRandom.palpite(resultado, palpiteUsuario));
        JsfPessoa2.this.resultado();
        
      
        JsfPessoa2.this.sortear();
        
        
     
    }
    
    public void resultado(){
        
       resultJogo =ejbRandom.palpite(this.resultado, palpiteUsuario); 
        if(resultJogo==1){
            resultJogo2="Acertou!!!";
        }
        else{
            resultJogo2="Errou!!!";
        }
        
    }
    
  
    
    
    @Setter
    @Getter
    private int valorA;
     
   
    @Setter
    @Getter
    private int valorB;
    
    @Setter
    @Getter
    private int resultado;
    
    @Setter
    @Getter
    private int palpiteUsuario;
    
    @Setter
    @Getter
    private int acertou;
    
    //fim teste
    
   @Getter 
   @Setter
   private String nome;
   
    @Getter
    @Setter
   private int resultJogo;
    
     @Getter
    @Setter
   private String resultJogo2;
    
}
