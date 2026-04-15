package cadastrodepessoas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main_Cadastro {

    public static void main(String[] args) {
        Pessoa.apresentar();
        menu();
    }
    
    public static void menu() {
        ArrayList<Pessoa> cadastros = new ArrayList<>();
        int escolha = 0;
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar Pessoa\n\n2 - Consultar Cadastros\n\n3 - Finalizar\n\nEscolha a opção desejada.\n\n", "Menu", JOptionPane.QUESTION_MESSAGE));
            switch (escolha) {
                case 1:
                    Pessoa p = cadastrarPessoa();
                    if (p.getIdade() == 0) {
                        System.out.println("Pessoa não cadastrada!");
                        JOptionPane.showMessageDialog(null,"Pessoa não cadastrada!","Erro!",JOptionPane.ERROR_MESSAGE);
                    } else {
                        cadastros.add(p);
                        Pessoa.porQuantidade();
                        System.out.println("Cadastro realizado com Sucesso!");
                        JOptionPane.showMessageDialog(null,"Cadastro realizado com Sucesso!","Novo Cadastrado",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    mostrarCadastros(cadastros);
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    JOptionPane.showMessageDialog(null, "Programa finalizado.","Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida! Retornando ao menu!");
                    JOptionPane.showMessageDialog(null, "Opção invalida!\n\nRetornando ao menu!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (true);
    }

    public static Pessoa cadastrarPessoa() {
        System.out.println("Digite o nome: ");
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ", "Nome", JOptionPane.QUESTION_MESSAGE);

        System.out.println("Digite a idade: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ", "Idade", JOptionPane.QUESTION_MESSAGE));
        
        System.out.println("Digite o CPF: ");
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF: ", "CPF", JOptionPane.QUESTION_MESSAGE);
        
        return new Pessoa(nome, cpf, idade, 0);
    }
    public static void mostrarCadastros(ArrayList<Pessoa> cadastros) {
        if (cadastros.isEmpty()) {
            System.out.println("Lista vazia.");
            JOptionPane.showMessageDialog(null, "Lista vazia.", "Vazio", JOptionPane.WARNING_MESSAGE);
            
        } else {
            System.out.println("Consulta de Cadastros");
            Object[] itens = {"Mostrar lista de Cadastros","Pesquisar por nome","Total de Cadastrados","Voltar"};
            Object opcao = JOptionPane.showInputDialog(null,"Escolha a opção desejada.","Consulta de Cadastros",JOptionPane.QUESTION_MESSAGE,null,itens,itens[0]);
        
            if (opcao.toString().equals("Mostrar lista de Cadastros")) {
                System.out.println("lista de Cadastros");
                //forEach parra array
                for (Pessoa p8 : cadastros) {
                    p8.listarInformacoes();  
                }
            
            }else if(opcao.toString().equals("Pesquisar por nome")){
                System.out.println("Pesquisa por nome");
                
                pesquisarPessoa(cadastros);



            }else if(opcao.toString().equals("Total de Cadastrados")){
                System.out.println("Foram cadastrados até o momento um total de "+Pessoa.getQuantidade()+" pessoas.");
                JOptionPane.showMessageDialog(null,"Foram cadastrados até o momento um total de "+Pessoa.getQuantidade()+" pessoas.","Total de Cadastros",JOptionPane.INFORMATION_MESSAGE);
                
            }else if(opcao.toString().equals("Voltar")){
                System.out.println("Voltar");
                return;
            }
        }
    }
    
    public static void pesquisarPessoa(ArrayList<Pessoa> cadastros){
        System.out.println("Digite o nome da pessoa: ");
        String nome = JOptionPane.showInputDialog(null,"Digite o nome da pessoa: ","Pesquisa por nome",JOptionPane.QUESTION_MESSAGE);
        
        for (Pessoa p : cadastros){
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.listarInformacoes();
            } 
        }
    }

}