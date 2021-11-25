
package br.jsf;

import br.ejb.EjbRandom;
import br.model.Resultado;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import lombok.Getter;
import lombok.Setter;

@Named(value = "jsfRandom")
@SessionScoped
public class JsfRandom implements Serializable {

    @EJB
    private EjbRandom ejbRandom;

    Resultado result = new Resultado();
 
    public JsfRandom() {
    }
    
    
     public void sortear(){
        valorA = ejbRandom.randomNumber();
        valorB = ejbRandom.randomNumber();
        resultado = valorA+valorB;
                     
    }
    
    public void testarNumero(){
        result.setResultadoSorteio(resultado);
         acertou = ejbRandom.palpite(result.getResultadoSorteio(), palpiteUsuario);
         
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
    
    
    
}
