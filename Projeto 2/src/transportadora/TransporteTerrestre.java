package transportadora;

public class TransporteTerrestre extends Transportadora{

    public void calculaFrete(Integer altura, Integer largura)
    {
        this.frete = (altura/largura) * 0.2;
    }
    public TransporteTerrestre(Integer altura, Integer largura){
        this.calculaFrete(altura, largura);
    }
}
