package Ex1Carro;

public class Car implements Comparable {
    String marca;
    String cor;
    String modelNumber;

    public Car(String marca, String cor, String modelNumber) {
        this.marca = marca;
        this.cor = cor;
        this.modelNumber = modelNumber;
    }

    @Override
    public int compareTo(Object other) {
        int result;
        if (modelNumber.equals(((Car)other).modelNumber)  &&
                marca.equals(((Car)other).marca))
            result = cor.compareTo(((Car)other).cor);
        else
            result = cor.compareTo(((Car)other).cor);
        return result;
    }
}
