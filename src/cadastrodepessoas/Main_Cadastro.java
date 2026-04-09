package cadastrodepessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Cadastro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
       
        scan.close();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int escolha = 0;
        
        do{
            System.out.println("========Menu========");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Consultar Cadastros");
            System.out.println("3. Finalizar");
            escolha = scan.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Cadastrando pessoas!");
                    break;
                case 2:
                    System.out.println("Mostrando lista de pessoas!");
                    break;
                case 3:
                    System.out.println("Finalizando sistema!");
                    break;
                default:
                    System.out.println("Opção invalida, informando menu!");
            }
            
            
        }while(escolha != 3);
        
    }
    
    public static void mostrarCadastros(){
        ArrayList<Pessoa> list = new ArrayList<>();
    }
}