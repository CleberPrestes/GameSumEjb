/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import br.model.CrudPessoa;
import br.model.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import javax.ejb.EJB;
import javax.ejb.Stateful;


@Stateful
public class EjbPessoa {

    @EJB
    private EjbRandom ejbRandom;
    
    
    
    private ArrayList<Pessoa> lpessoa;
    
    CrudPessoa crud = new CrudPessoa();

   public ArrayList<Pessoa> getAll(){
       
       
       return crud.getAll();
   }
   
   public void addPessoa(String nome, int pontos){
       crud.addPessoa(nome,pontos);
   
   }
 
}
