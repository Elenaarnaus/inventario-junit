package epigrafe_1;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Productos> Productos = new ArrayList<>();

    public void añadirProducto(Productos p) {
        Productos.add(p);
    }

    public double calcularValorInventario() {
        double total = 0;

        for (Productos p : Productos) {
            total += p.getCantidad() * p.getPrecio();
        }

        return total;
    }

    public Productos buscarProducto(String nombre) {
        for (Productos p : Productos) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }
}