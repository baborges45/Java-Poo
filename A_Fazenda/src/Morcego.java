public class Morcego extends Mamifero implements Voo{

    private  double altitude;

    public Morcego(int idade, double tamanho, String corDoPelo, double altitude) {
        super(idade, tamanho, corDoPelo);
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void caracteristicasMorcego(){
        System.out.println("\n");
        System.out.println("Animal inserido na Fazenda!!!");
        System.out.println("\n");
        System.out.println("A idade do morcego é " + this.getIdade() + " anos.");
        System.out.println("O tamanho do morcego é " + this.getTamanho() + " cm.");
        System.out.println("A cor do morcego é " + this.getCorDoPelo() + ".");
    }

    @Override
    public void amamentar() {
        System.out.println("O morcego da leite aos seus filhotes .\n");
    }

    @Override
    public void somEmitido() {
        System.out.println("O morcego farfalha e emite o som: Griiiiiiiii. \n");
    }

    @Override
    public void animalVoando() {
        System.out.println("O morcego voa e sua altitude é: " + this.getAltitude() + "metros.\n");
    }
}
