package cadastrodepessoas;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_Cadastro {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        ArrayList<Pessoa> cadastros = new ArrayList<>();
        int escolha = 0;

        do {
//            System.out.println("========Menu========");
//            System.out.println("1. Cadastrar Pessoa");
//            System.out.println("2. Consultar Cadastros");
//            System.out.println("3. Finalizar");
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Cadastrar Pessoa\n\n2 - Consultar Cadastros\n\n3 - Finalizar\n\nEscolha a opção desejada.\n\n","Menu",JOptionPane.QUESTION_MESSAGE));
 
            switch (escolha) {
                case 1:
                    cadastros.add(cadastrarPessoa());         

                    Pessoa p = cadastrarPessoa();
                    if (p.getIdade() == 0){
                        System.out.println("Pessoa não cadastrada! Tente novamente!");
                    } else {
                        cadastros.add(p);
                    }
                    break;
                case 2:
                    mostrarCadastros(cadastros);
                    break;
                case 3:
                    System.out.println("Finalizando sistema!");
                    JOptionPane.showMessageDialog(null,"Finalizando sistema!","Encerrando",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida! Retornando ao menu!");
                    JOptionPane.showMessageDialog(null,"Opção invalida!\n\nRetornando ao menu!","Erro",JOptionPane.ERROR_MESSAGE);
            }

        } while (escolha != 3);

    }

    public static Pessoa cadastrarPessoa() {

        System.out.println("Digite o nome: ");
        String nome = JOptionPane.showInputDialog(null,"Digite o nome: ","Nome",JOptionPane.QUESTION_MESSAGE);
 
        System.out.println("Digite a idade: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade: ","Idade",JOptionPane.QUESTION_MESSAGE));
        
        System.out.println("Digite o CPF: ");
        String cpf = JOptionPane.showInputDialog(null,"Digite o CPF: ","CPF",JOptionPane.QUESTION_MESSAGE);

        return new Pessoa(nome, cpf, idade);     

    }

    public static void mostrarCadastros(ArrayList<Pessoa> cadastros) {
        if (cadastros.isEmpty()) {
            System.out.println("Lista vazia.");
            JOptionPane.showMessageDialog(null,"Lista vazia.","Vazio",JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("bleu");
            
            for (Pessoa p8 : cadastros) {
                p8.listarInformacoes();
            }
        }
    }
}
