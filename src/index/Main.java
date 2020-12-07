package index;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        
        telaMenu menu = new telaMenu();
        
        menu.setVisible(true);
        
        /*
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Seja bem vindo a AnyPlace Fit");
        System.out.println("\nPor favor realize o cadastro para entrar no nosso sistema");

        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("\nEmail: ");
        String email = ler.next();
        System.out.println("\nCelular: ");
        String celular = ler.next();
        System.out.println("\nIdade ");
        String idade = ler.next();
                
        Dados dadosCadastrados = new Dados(nome, email, celular, idade);
        
        System.out.println("\nObrigado por se cadastrar "+ nome+", Seja bem vindo(a) ao nosso menu!");

        boolean menu = true;
        do {
            System.out.println("\n~~~~~~~~~~~~~ Digite o valor de acordo com a ação pretendida! ~~~~~~~~~~~~");
            System.out.println(" 1 - Cadastrar um novo professor \n 2 - Alterar informações \n 3 - Procurar professores"
                    + "\n 4 - Consultar todos os cadastros \n 5 - Excluir cadastros \n 6 - Calcular IMC \n 7 - Sair");
           
            int opcoesMenu = ler.nextInt(); 
            menu = (opcoesMenu == 6) ? false : true;
            
            switch (opcoesMenu) {
                case 1:
                    dadosCadastrados.adicionarDado();
                    break;
                case 2:
                    dadosCadastrados.alteraDados();
                    break;
                case 3:
                    dadosCadastrados.consultaSimples();
                    break;
                case 4:
                    dadosCadastrados.consultaCompleta();
                    break;
                case 5:
                    dadosCadastrados.excluiCadastros();
                    break;
                default:
                    System.out.println("Menu finalizado!");
            }
        } while (menu);

    }
         */
    }
}
