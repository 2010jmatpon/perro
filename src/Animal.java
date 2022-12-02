public class Animal {
    String nombre;
    Animal () {
    }
    Animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡GUAU GUAU! mi nombre es " + nombre);
    }
}
