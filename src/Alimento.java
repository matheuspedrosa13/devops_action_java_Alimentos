import java.util.Date;

public abstract class Alimento {
    protected String nome;
    protected double custo;
    protected Date validade;

    public Alimento(String nome, double custo, Date validade) {
        this.nome = nome;
        this.custo = custo;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public Date getValidade() {
        return validade;
    }

    public abstract double calcularPreco();

    public boolean verificarValidade(Date data){
        return data.getDate() < getValidade().getDate();
    }


}
