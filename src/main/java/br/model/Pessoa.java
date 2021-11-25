/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author CLEBER S PRESTES
 */

@Data
public class Pessoa implements Comparable<Pessoa>{
    
    
    private String nome;
    private int pontos;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return (pessoa.getPontos()- this.pontos);
        
    }
    
    
   
}
