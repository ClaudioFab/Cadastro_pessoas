
package cadastrodepessoas;

import javax.swing.JOptionPane;

public class Pessoa {
    // === Importar funções ===
    
    // ==== Organização de variáveis ====
    private String nome, CPF;
    private int idade;
    private static int quantidade;
    
    // ==== Construtor ====
    public Pessoa(String nome,String CPF,int idade,int quantidade) {
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
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;  
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
    
    public static int getQuantidade() {
        return quantidade;
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

    public static void porQuantidade() {
        quantidade++;
    }
    
    public static void apresentar(){
        System.out.println("Atividade em Grupo Git (Cadastro de Pessoas)");
        //Atividade em Grupo Git - Cadastro de Pessoas
        JOptionPane.showMessageDialog(null,"Atividade em Grupo Git\n(Cadastro de Pessoas)\n\nParticipantes:\n\n* Gustavo Arvelos → Classe Pessoa (Funções Extras + Lógica)\n\n* Rokston Damasio → Main (Menu e Interação + Lógica)\n\n* Cláudio Fabiano → Testes (Melhorias e Firulas)","Iniciando",JOptionPane.INFORMATION_MESSAGE);
    }

}