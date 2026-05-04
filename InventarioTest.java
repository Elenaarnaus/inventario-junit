package epigrafe_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioTest {

    @Test
    public void testAñadirProducto() {
        Inventario inv = new Inventario();
        Producto p = new Producto("Teclado", 2, 50);

        inv.añadirProducto(p);

        assertNotNull(inv.buscarProducto("Teclado"));
    }

    @Test
    public void testCalcularValorInventario() {
        Inventario inv = new Inventario();
        inv.añadirProducto(new Producto("Ratón", 2, 10));
        inv.añadirProducto(new Producto("Teclado", 1, 50));

        assertEquals(70, inv.calcularValorInventario());
    }

    @Test
    public void testBuscarProducto() {
        Inventario inv = new Inventario();
        inv.añadirProducto(new Producto("Monitor", 1, 200));

        Producto p = inv.buscarProducto("Monitor");

        assertEquals("Monitor", p.getNombre());
    }
}
