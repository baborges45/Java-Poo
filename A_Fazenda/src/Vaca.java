public class Vaca extends Mamifero{

    public Vaca(int idade, double tamanho, String corDoPelo) {
        super(idade, tamanho, corDoPelo);
    }

    public void caracteristicasVaca(){
        System.out.println("\n");
        System.out.println("Animal inserido na Fazenda!!!");
        System.out.println("\n");
        System.out.println("A idade da vaca é " + this.getIdade() + " anos.");
        System.out.println("O tamanho da vaca é " + this.getTamanho() + " cm.");
        System.out.println("A cor da vaca é " + this.getCorDoPelo() + ".");
    }

    @Override
    public void amamentar() {
        System.out.println("A vaca da leite para os filhotes.\n");
    }

    @Override
    public void somEmitido() {
        System.out.println("A vaca emiti o som: Muuuuuuuuuuu.\n");
    }
}
