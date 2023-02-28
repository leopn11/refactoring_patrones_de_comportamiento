package state;

public class ProductoPago extends Estado {

    public ProductoPago(MaquinaCocacola maquinacocacola){
        super(maquinacocacola);
    }

    @Override
    public String introduceDinero() {
      return   "IntroduceDinero(): Dinero ya recibido";
    }

    @Override
    public String introduceCodigo() {
       maquinacocacola.cambioDeProceso(new DigitaCodigo(maquinacocacola));
       return "IntroduceCodigo(): Dinero recibido, digita codigo y escoge tu producto";
    }

    @Override
    public String retiraBebida() {
        return "RetiraBebida(): no se puede retirar la bebida sin antes digitar codigo de la misma";
    }
}
