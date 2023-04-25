import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando uma carne
        Date dataValidadeCarne = new Date(123456789); // Data de validade fictícia
        Carne carne = new Carne("Picanha", 30.0, dataValidadeCarne, 1.5, 1);

        // Testando os atributos da carne
        System.out.println("Nome da carne: " + carne.getNome()); // Deve imprimir "Nome da carne: Picanha"
        System.out.println("Custo da carne: " + carne.getCusto()); // Deve imprimir "Custo da carne: 30.0"
        System.out.println("Data de validade da carne: " + carne.getValidade()); // Deve imprimir a data de validade em formato de data e hora
        System.out.println("Peso da carne: " + carne.peso); // Deve imprimir "Peso da carne: 1.5"
        System.out.println("Quantidade de pedaços da carne: " + carne.pedacos); // Deve imprimir "Quantidade de pedaços da carne: 1"

        // Testando o método cortar da carne
        carne.cortar(3);
        System.out.println("Quantidade de pedaços da carne após cortar: " + carne.pedacos); // Deve imprimir "Quantidade de pedaços da carne após cortar: 4"

        // Testando o método calcularPreco da carne
        System.out.println("Preço da carne: " + carne.calcularPreco()); // Deve imprimir "Preço da carne: 55.0"


        // Criando um legume
        Date dataValidadeLegume = new Date(987654321); // Data de validade fictícia
        Legume legume = new Legume("Cenoura", 5.0, dataValidadeLegume, "Crocante", false);

        // Testando os atributos do legume
        System.out.println("Nome do legume: " + legume.getNome()); // Deve imprimir "Nome do legume: Cenoura"
        System.out.println("Custo do legume: " + legume.getCusto()); // Deve imprimir "Custo do legume: 5.0"
        System.out.println("Data de validade do legume: " + legume.getValidade()); // Deve imprimir a data de validade em formato de data e hora
        System.out.println("Textura do legume: " + legume.textura); // Deve imprimir "Textura do legume: Crocante"
        System.out.println("Legume descascado? " + legume.descascado); // Deve imprimir "Legume descascado? false"

        // Testando o método descascar do legume
        legume.descascar();
        System.out.println("Legume descascado? " + legume.descascado); // Deve imprimir "Legume descascado? true"

        // Testando o método calcularPreco do legume
        System.out.println("Preço do legume: " + legume.calcularPreco()); // Deve imprimir "Preço do legume: 25.0"
    }
}
