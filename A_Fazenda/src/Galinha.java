public class Galinha extends Ave {

    public Galinha(int idade, double tamanho, String corDaPena) {
        super(idade, tamanho, corDaPena);
    }

    public void caracteristicasGalinha(){
        System.out.println("\n");
        System.out.println("Animal inserido na Fazenda!!!");
        System.out.println("\n");
        System.out.println("A idade da galinha é " + this.getIdade() + " anos.");
        System.out.println("O tamanho da galinha é " + this.getTamanho() + " cm.");
        System.out.println("A cor da galinha é " + this.getCorDaPena() + ".");
    }

    @Override
    public void somEmitido() {
        System.out.println(" A galinha emite o som cocoricóooo!\n");
        super.somEmitido();
    }

    @Override
    public void botaOvo() {
        System.out.println("A galinha botou um ovo.\n");
    }
}
