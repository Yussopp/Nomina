public class Docente extends Empleado {
    private int horasCatedra;
    private double valorHora;

    public Docente(String nombre, String cedula, String dependencia, int horasCatedra, double valorHora) {
        super(nombre, cedula, dependencia);
        this.horasCatedra = horasCatedra;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagoMensual() {
        return this.horasCatedra * this.valorHora;
    }

    @Override
    public String resumen() {
        return super.resumen() + ", Tipo: Docente, Horas Cátedra: " + this.horasCatedra + ", Valor Hora: " + this.valorHora;
    }
}