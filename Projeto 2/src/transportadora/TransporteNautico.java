package transportadora;

public class TransporteNautico extends Transportadora{

    public void calculaFrete(Integer altura, Integer largura)
    {
        this.frete = (altura + largura) * 0.1;
    }
    public TransporteNautico(Integer altura, Integer largura){
        this.calculaFrete(altura, largura);
    }
}
