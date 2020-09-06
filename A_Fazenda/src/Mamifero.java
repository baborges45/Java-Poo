public abstract class Mamifero extends Animal{

    private String corDoPelo;

    public Mamifero(int idade, double tamanho, String corDoPelo) {
        super(idade, tamanho);
        this.corDoPelo = corDoPelo;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public abstract void amamentar();
}
