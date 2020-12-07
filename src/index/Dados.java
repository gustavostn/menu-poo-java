package index;

import java.util.Scanner;
import java.util.ArrayList;
import sun.invoke.empty.Empty;

public class Dados {

    ArrayList dadoCadastro = new ArrayList();
    String nome, email, celular, idade;

    public Dados() {
     
    }

    public String novoCadastro(String nome, String idade, String email, String celular) {

        dadoCadastro.add(nome); //adc o novo nome 
        dadoCadastro.add(idade); //adc o novo nome 
        dadoCadastro.add(email); //adc o novo nome 
        dadoCadastro.add(celular); //adc o novo nome 

        return "Dado Cadastrado com sucesso!";
    }

    public void alteraDados(String valorAntigo, String valorNovo) {
        
            if (dadoCadastro.contains(valorAntigo)) { //Verifica se o dado que deseja substituit existe
                int index = dadoCadastro.indexOf(valorAntigo); //Retorna o indice que se encontra o dado que deseja subtituit
                dadoCadastro.set(index, valorNovo); //Adc um novo dado no indice que estava o antigo
            }
        }

    public void consultaSimples() {
        Scanner ler = new Scanner(System.in);
         System.out.println("\n========================================");
        System.out.println("Informe o dado que deseja consultar");
        String consultaSimples = ler.next();
        if (dadoCadastro.contains(consultaSimples)) { //Verifica se existe o valor
            int index = dadoCadastro.indexOf(consultaSimples);
            System.out.println("O valor está armazenado!" + index + " " + dadoCadastro.get(index));
        } else {
            System.out.println("O valor não está cadastrado!");
        }
         System.out.println("========================================\n");
    }

    public boolean verificaVazio(){
        
        if(!dadoCadastro.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public String consultaCompleta(){
         return ("Nome : " + dadoCadastro.get(0) + "\n" + 
                 "Idade : " + dadoCadastro.get(1) + "\n" +
                 "Email : " + dadoCadastro.get(2) + "\n" +
                 "Celular : " + dadoCadastro.get(3) + "\n"
                 ) ;
         
    }

    public void excluiCadastros() {
            dadoCadastro.clear();
    }
}
