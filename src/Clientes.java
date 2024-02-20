import java.util.IllegalFormatCodePointException;

public class Clientes {
    public static void main(String[] args) {
        String nome1 = "Fulano";
        int anoNascimento1 = 1980;
        String nome2 = "Sicrano";
        int anoNascimento2 = 2000;
        int anoAtual = 2024;



        System.out.println(">>> Listagem dos Clientes");
        System.out.println(">>> Ano atual: " +anoAtual);

        System.out.println("-----------------------------------------");
        System.out.println("Nome: " + nome1);
        System.out.println("Data de Nascimento: " + anoNascimento1);




        System.out.println("-----------------------------------------");
        System.out.println("Nome: " + nome2);
        System.out.println("Data de Nascimento: " + anoNascimento2);
    }
}
