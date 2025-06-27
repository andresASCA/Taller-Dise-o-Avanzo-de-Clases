public class Aldeano extends EntidadBase {
    private String oficio;

    public Aldeano(String nombre, int salud, String oficio) {
        super(nombre, salud);
        this.oficio = oficio;
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " dice: 'Hmmmm' y ofrece un trato como " + oficio + ".");
    }

    @Override
    public String obtenerTipo() {
        return "Aldeano";
    }

    public String getOficio() {
        return oficio;
    }
    @Override
    public String toString() {
        return super.toString() + ", Oficio: " + oficio;
    }
}