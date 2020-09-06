public abstract class Ave extends Animal {

    private String corDaPena;

    public Ave(int idade, double tamanho, String corDaPena) {
        super(idade, tamanho);
        this.corDaPena = corDaPena;
    }

   /* public Ave(int idade, double tamanho) {
        super(idade, tamanho);
    }*/

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    public abstract void  botaOvo();

    @Override
    public void somEmitido() {

    }
}
