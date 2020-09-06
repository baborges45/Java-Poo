import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);


         String entrada = null;
         boolean menu = true;
         while (menu){

             /*String[] animais = {"Galinha", "Morcego", "Pato", "Vaca","Sair"};
             String entrada = (String) JOptionPane.showInputDialog(null, "Selecione um novo animal", "Animais disponiveis",
                     JOptionPane.QUESTION_MESSAGE, null,animais, animais[0] );*/

             System.out.println("*************Para iniciar, selecione um novo animal.**************");
             System.out.println("Para começar, selecione uma opção:");
             System.out.println("1 - Galinha");
             System.out.println("2 - Pato");
             System.out.println("3 - Vaca");
             System.out.println("4 - Morcego");
             System.out.println("0 - Sair");

             int op = scanner.nextInt();
             switch (op){

                 case 1:
                     System.out.println("Você selecionou uma galinha.");
                     Galinha galinha1 = new Galinha(op, op, entrada);
                     System.out.println("Quantos anos ela tem (em anos)? ");
                     galinha1.setIdade (scanner.nextInt());
                     System.out.println("Qual é o seu tamanho (em centímetros)? ");
                     galinha1.setTamanho (scanner.nextDouble());
                     System.out.println("Qual é a sua cor? ");
                     galinha1.setCorDaPena(scanner.next());
                     galinha1.caracteristicasGalinha();
                     galinha1.somEmitido();
                     galinha1.botaOvo();
                     System.out.println("###Fim do cadastro!###");
                     menu=false;
                     break;

                 case 2:
                     System.out.println("Você selecionou um pato.");
                     Pato pato1 = new Pato(op, op, entrada, op);
                     System.out.println("Quantos anos ele tem (em anos)? ");
                     pato1.setIdade (scanner.nextInt());
                     System.out.println("Qual é o seu tamanho (em centímetros)? ");
                     pato1.setTamanho (scanner.nextDouble());
                     System.out.println("Qual é a sua cor? ");
                     pato1.setCorDaPena(scanner.next());
                     System.out.println("Qual é a sua altitude de voo (em metros)? ");
                     pato1.setAltitude (scanner.nextInt());
                     pato1.caractecisticasPato();
                     pato1.somEmitido();
                     pato1.botaOvo();
                     pato1.animalVoando();
                     System.out.println("###Fim do cadastro!###");
                     menu=false;
                     break;

                /*opcao 3, cria a vaca com todos os atributos e metodos definidos na propria classe ou nas suas
                superclasses*/
                 case 3:
                     System.out.println("Você selecionou uma vaca.");
                     Vaca vaca1 = new Vaca(op, op, entrada);
                     System.out.println("Quantos anos ela tem (em anos)? ");
                     vaca1.setIdade (scanner.nextInt());
                     System.out.println("Qual é o seu tamanho (em centímetros)? ");
                     vaca1.setTamanho (scanner.nextDouble());
                     System.out.println("Qual é a sua cor? ");
                     vaca1.setCorDoPelo (scanner.next());
                     vaca1.caracteristicasVaca();
                     vaca1.somEmitido();
                     vaca1.amamentar();
                     System.out.println("###Fim do cadastro!###");
                     menu=false;
                     break;

                 /*opcao 4, cria o morcego com todos os atributos e metodos definidos na propria classe ou nas suas
                superclasses*/
                 case 4:
                     System.out.println("Você selecionou um morcego.");
                     Morcego morcego1 = new Morcego(op, op, entrada, op);
                     System.out.println("Quantos anos ele tem (em anos)? ");
                     morcego1.setIdade (scanner.nextInt());
                     System.out.println("Qual é o seu tamanho (em centímetros)? ");
                     morcego1.setTamanho (scanner.nextDouble());
                     System.out.println("Qual é a sua cor? ");
                     morcego1.setCorDoPelo (scanner.next());
                     System.out.println("Qual é a sua altitude de voo (em metros)? ");
                     morcego1.setAltitude (scanner.nextInt());
                     morcego1.caracteristicasMorcego();
                     morcego1.somEmitido();
                     morcego1.amamentar();
                     morcego1.animalVoando();
                     System.out.println("###Fim do cadastro!###");
                     menu=false;
                     break;
                 case 0:
                     System.out.println("saindo");
                     menu=false;
                     break;
                 default:
                     System.out.println("Operacao invalida!");

             }
         }
    }
}
