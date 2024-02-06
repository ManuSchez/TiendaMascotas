import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la mascota: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la edad de la mascota: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el tipo de animal: ");
        String tipoMascota = sc.nextLine();
        System.out.println(nombre + " " + edad + " años " + tipoMascota);
        tiendaMascotas.agregarMascotas(nombre,edad,tipoMascota);

        System.out.println("¿Qué animal se va a vender?");
        nombre = sc.nextLine();
        tiendaMascotas.venderMascota(nombre);

        tiendaMascotas.mostrarInventario(nombre);
    }
}
