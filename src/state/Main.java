package state;

public class Main {
    public static void main(String[] args) {
        MaquinaCocacola maquina1 = new MaquinaCocacola();

        System.out.println(maquina1.estado.introduceDinero());
        System.out.println(maquina1.estado.introduceCodigo());
        System.out.println(maquina1.estado.retiraBebida());
    }
}
