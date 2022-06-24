public class Automobili extends Veicoli{
    //attributi
    private int numerodiporte;

    //costruttori
    public Automobili (String targa, int numerodiposti,int numerodiporte) {
        super(targa,numerodiposti);
        this.numerodiporte=numerodiporte;
    }

    //moduli
    public String toString() {
        String b = super.toString()+this.numerodiporte;
        return b;
    }
}
