public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Steve", 100);
        Zombi zombi = new Zombi("ZombiMutante", 50, 4);
        Aldeano aldeano = new Aldeano("Aldeano", 80, "Granjero");

        jugador.aparecer();
        jugador.interactuar();
        jugador.mostrarInventario();

        System.out.println();

        zombi.aparecer();
        zombi.interactuar();

        System.out.println();

        aldeano.aparecer();
        aldeano.interactuar();
    }
}