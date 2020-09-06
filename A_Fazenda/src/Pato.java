public class Pato extends Ave implements Voo{

    private double altitude;

    public Pato(int idade, double tamanho, String corDaPena, double altitude) {
        super(idade, tamanho, corDaPena);
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void caractecisticasPato(){
        System.out.println("\n");
        System.out.println("Animal inserido na Fazenda!!!");
        System.out.println("\n");
        System.out.println("A idade do pato é " + this.getIdade() + " anos.");
        System.out.println("O tamanho do pato é " + this.getTamanho() + " cm.");
        System.out.println("A cor do pato é " + this.getCorDaPena() + ".");
    }

    @Override
    public void botaOvo() {
        System.out.println("O pato bota ovo.\n");
    }

    @Override
    public void somEmitido() {
        System.out.println("O pato grasna e emiti o som: quaac,quaac,quaac.\n");
        super.somEmitido();
    }

    @Override
    public void animalVoando() {
        System.out.println("O pato voa e sua altitude é: " + this.getAltitude() + "metros.\n");
    }
}
