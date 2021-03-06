public abstract class Animal {

    private int idade;
    private double tamanho;

    public Animal(int idade, double tamanho) {
        this.idade = idade;
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public abstract void somEmitido();

    @Override
    public String toString() {
        return "A idade " + idade + ", tamanho=" + tamanho + ".";
    }
}
