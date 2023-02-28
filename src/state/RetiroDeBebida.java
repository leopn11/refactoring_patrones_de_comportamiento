package state;

public class RetiroDeBebida extends Estado {
    public RetiroDeBebida (MaquinaCocacola maquinacocacola){
        super(maquinacocacola);
    }

    @Override
    public String introduceDinero() {
        return "\"IntroduceDinero(): Dinero ya recibido!!!!".toUpperCase();
    }

    @Override
    public String introduceCodigo() {
        return "IntroduceCodigo(): Codigo ya recibido!!!!".toUpperCase();
    }

    @Override
    public String retiraBebida() {
        return "RetiraBebida(): Bebida despachada!!!".toUpperCase();
    }
}
