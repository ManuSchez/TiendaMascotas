import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class TiendaMascotasTest {

    @Test
    public void testConstructor() {
        TiendaMascotas tienda = new TiendaMascotas();
        assertEquals(0, tienda.cantidadMascotas);
        assertNotNull(tienda.inventario);
    }

    @Test
    public void testAgregarMascotas() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascotas("Fido", 3, "Perro");
        assertEquals(1, tienda.cantidadMascotas);
    }

    @Test
    public void testVenderMascota() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascotas("Fido", 3, "Perro");
        tienda.venderMascota("Fido");
        assertEquals(0, tienda.cantidadMascotas);
    }

    @Test
    public void testMostrarInventario() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascotas("Fido", 3, "Perro");
        tienda.venderMascota("Fido");
        assertEquals(1, tienda.cantidadMascotas);
    }
}
