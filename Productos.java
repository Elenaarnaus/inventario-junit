package epigrafe_1;

public class Productos {
	private String nombre;
    private int cantidad;
    private double precio;

    
    public Productos(String nombre, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad no válida");
        }
        this.cantidad = cantidad;
    }
}
