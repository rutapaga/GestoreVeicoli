public class Autocarri extends Veicoli {
    //attributi
    private double capacità;

    //costruttori
    public Autocarri (String targa, int numerodiposti,double capacità) {
        super(targa, numerodiposti);
        this.capacità=capacità;
    }

    //metodi
    public String toString () {
        String a=super.toString()+this.capacità;
        return a;

    }

}
