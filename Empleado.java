public class Empleado {
    protected String cedula;
    protected String nombre;
    protected String dependencia;

    public Empleado(String nombre, String cedula, String dependencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.dependencia = dependencia;
    }

    public String resumen() {
        return "Nombre: " + this.nombre + ", Cédula: " + this.cedula + ", Dependencia: " + this.dependencia;
    }

    public double calcularPagoMensual() {
        return 0.0;
    }
}