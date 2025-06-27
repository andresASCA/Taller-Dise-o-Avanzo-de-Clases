public class Zombi extends EntidadBase {
    private boolean esHostil;
    private int nivelDeAgresividad;

    public Zombi(String nombre, int salud, int nivelDeAgresividad) {
        super(nombre, salud);
        this.nivelDeAgresividad = nivelDeAgresividad;
        this.esHostil = true;
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " ataca con ferocidad.");
    }

    @Override
    public String obtenerTipo() {
        return "Zombi";
    }

    public boolean esHostil() {
        return esHostil;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nivel de Agresividad: " + nivelDeAgresividad;
    }
}
