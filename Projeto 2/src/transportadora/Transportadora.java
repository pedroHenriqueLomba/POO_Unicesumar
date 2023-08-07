package transportadora;

public abstract class Transportadora {
    protected double frete;

    public double getFrete() {
        return this.frete;
    }

    public abstract void calculaFrete(Integer altura, Integer largura);
}
