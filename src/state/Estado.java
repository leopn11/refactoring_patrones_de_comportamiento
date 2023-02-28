package state;

abstract public class Estado {

    public MaquinaCocacola maquinacocacola;

    public Estado (MaquinaCocacola maquinacocacola){
        this.maquinacocacola = maquinacocacola;
    }

    abstract public String introduceDinero();
    abstract public String introduceCodigo();
    abstract public String retiraBebida();
}
