public class Main {
    public static void main(String[] args) {
        perro perro = new perro();

        perro.nombre = "Zeus";

        perro.raza = "Perro de agua";
        System.out.println("¡GUAU GUAU! mi nombre es " + perro.nombre + " y soy un " + perro.raza);

        perro.imprime();
        perro.imprimePorPartes();

        perro perro2 = new perro("Border Collie");
        perro2.imprimePorPartes();

        perro perro3 = new perro("Chicote", "Border Collie");
        perro3.imprimePorPartes();
        perro2.imprimePorPartes();
        perro3.imprimePorPartes();
    }
}
