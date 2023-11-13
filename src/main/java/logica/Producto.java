package logica;

public class Producto {
    private String nombre;
    private int unidades;
    private double costo;

    public Producto(String nombre) {
    }

    public Producto(String nombre, int unidades, double costo) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
