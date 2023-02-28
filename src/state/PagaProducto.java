package state;

public class PagaProducto extends Estado {
    public PagaProducto (MaquinaCocacola maquinacocacola){
        super(maquinacocacola);
    }

    @Override
    public String introduceDinero() {
        maquinacocacola.cambioDeProceso(new ProductoPago(maquinacocacola));
        return "Introduce Dinero: producto ya esta pago";
    }

    @Override
    public String introduceCodigo() {
        return "Bebida bloqueada, introduce pago";
    }

    @Override
    public String retiraBebida() {
        return "Bebida bloqueada, introduce pago";
    }
}
