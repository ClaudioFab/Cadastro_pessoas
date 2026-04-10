package cadastrodepessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Cadastro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        menu();
        scan.close();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> cadastros = new ArrayList<>();
        int escolha = 0;

        do {
            System.out.println("========Menu========");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Consultar Cadastros");
            System.out.println("3. Finalizar");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    cadastros.add(cadastrarPessoa());
                    break;
                case 2:
                    mostrarCadastros(cadastros);
                    break;
                case 3:
                    System.out.println("Finalizando sistema!");
                    break;
                default:
                    System.out.println("Opção invalida, retornando ao menu!");
            }

        } while (escolha != 3);

    }

    public static Pessoa cadastrarPessoa() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o cpf: ");
        String cpf = scan.nextLine();

        return new Pessoa(nome, cpf, idade);

    }

    public static void mostrarCadastros(ArrayList<Pessoa> cadastros) {
        if (cadastros.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (Pessoa p8 : cadastros) {
                p8.listarInformacoes();
            }
        }

    }

}
