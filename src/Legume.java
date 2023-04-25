import java.util.Date;

public class Legume extends Alimento{
    protected String textura;
    protected boolean descascado;

    public Legume(String nome, double custo, Date validade, String textura, boolean descascado) {
        super(nome, custo, validade);
        this.textura = textura;
        this.descascado = descascado;
    }

    public void descascar(){
        this.descascado = true;
    }

    @Override
    public double calcularPreco() {
        double preco = custo + 10.0;
        if(this.descascado){
            preco += 20.0;
        }
        return preco;
    }
}
