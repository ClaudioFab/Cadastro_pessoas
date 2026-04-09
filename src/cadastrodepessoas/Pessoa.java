/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodepessoas;

/**
 *
 * @author 1076313
 */
public class Pessoa {
    // ==== Organização de variáveis ====
    private String nome, CPF;
    private int idade;
    
    // ==== Construtor ====
    public Pessoa(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    // ==== Setters ====
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // ==== Gueters ==== 
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }
    
    // ===== Funções usuário ====

}
