package state;

public class DigitaCodigo extends Estado {

    public DigitaCodigo(MaquinaCocacola maquinacocacola){
        super(maquinacocacola);
    }

    @Override
    public String introduceDinero() {
        return "IntroduceDinero(): Dinero ya recibido!!!!".toUpperCase();
    }

    @Override
    public String introduceCodigo() {
        return "IntroduceCodigo(): Codigo ya recibido!!!!".toUpperCase();
    }

    @Override
    public String retiraBebida() {
        maquinacocacola.cambioDeProceso(new RetiroDeBebida(maquinacocacola));
        return "RetiraBebida(): Bebida despachada!!!".toUpperCase();
    }
}
