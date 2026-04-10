/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodepessoas;

import java.util.Scanner;

/**
 *
 * @author 1076313
 */
public class Pessoa {
    // === Importar funções ===
    Scanner scan = new Scanner(System.in);
    
    // ==== Organização de variáveis ====
    private String nome, CPF;
    private int idade;
    
    // ==== Construtor ====
    public Pessoa(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        //Confere se a idade não está negativa
        conferirIdade(idade);
    }

    // ==== Setters ====
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setIdade(int idade) {
        conferirIdade(idade);
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
    private void conferirIdade(int idade){
       if(idade < 0){
           System.out.println("Idade inválida! Tente novamente");
       } else {
           this.idade = idade;
       }
    }
    
    public void listarInformacoes(){
        // Mostra as informações da classe
        System.out.println(
                "Nome: " + this.nome +
                "Idade: " + this.idade +
                "CPF: " + this.CPF
        );
    }
}
