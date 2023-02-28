package state;

public class MaquinaCocacola {
    public Estado estado;

    public MaquinaCocacola(){
       estado = new PagaProducto(this);

    }

    public void cambioDeProceso (Estado estado){
        System.out.println("Proceso inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Proceso final: " + this.estado.getClass().getName());
    }
    public Estado getEstado(){
        return estado;
    }
}
