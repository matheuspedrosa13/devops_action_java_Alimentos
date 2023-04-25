import java.util.Date;

public class Carne extends Alimento{
    protected double peso;
    protected int pedacos;

    public Carne(String nome, double custo, Date validade, double peso, int pedacos) {
        super(nome, custo, validade);
        this.peso = peso;
        this.pedacos = pedacos;
    }

    public void cortar(int cortes){
        this.pedacos += cortes;
    }

    @Override
    public double calcularPreco() {
        double preco = custo + 10.0;
        preco += this.peso * 10;
        return preco;
    }
}
