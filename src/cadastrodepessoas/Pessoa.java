
package cadastrodepessoas;

import javax.swing.JOptionPane;


public class Pessoa {
    // === Importar funções ===
    
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
       if(idade <= 0 || idade >= 130){
           System.out.println("Idade inválida! Tente novamente.");       
           JOptionPane.showMessageDialog(null,"Idade inválida!\nTente novamente.","Erro!",JOptionPane.ERROR_MESSAGE);
       } else {
           this.idade = idade;
       }
    }
    
    public void listarInformacoes(){
        // Mostra as informações da classe
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade+"\nCPF: "+this.CPF+"\n\n");
        JOptionPane.showMessageDialog(null,"Nome: "+this.nome+"\nIdade: "+this.idade+"\nCPF: "+this.CPF,"Cadastrados",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
