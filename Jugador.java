public class Jugador extends EntidadBase {
    private String[] inventario;

    public Jugador(String nombre, int salud) {
        super(nombre, salud);
        this.inventario = new String[]{"Espada", "Pico", "Comida"};
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " salta y saluda al jugador.");
    }

    @Override
    public String obtenerTipo() {
        return "Jugador";
    }

    public void mostrarInventario() {
        System.out.println("Inventario de " + nombre + ":");
        for (String item : inventario) {
            System.out.println("- " + item);
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Inventario: " + inventario;
    }
}