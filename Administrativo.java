public class Administrativo extends Empleado {
    private double salarioBasico;
    private int diasVacaciones;

    public Administrativo(String nombre, String cedula, String dependencia, double salarioBasico) {
        super(nombre, cedula, dependencia);
        this.salarioBasico = salarioBasico;
        this.diasVacaciones = 15;
    }

    public boolean tomarVacaciones(int diasSolicitados) {
        if (diasSolicitados <= 0) {
            System.out.println("Error: CANTIDAD DE DIAS DE VACACIONES INVALIDO");
            return false;
        }
        //VALIDAMOS QUE LOS DIAS SOLICITADOS NO SUPEREN LOS DIAS DISPONIBLES
        if (diasSolicitados > this.diasVacaciones) {
            System.out.println("Error: La cantidad de días solicitados (" + diasSolicitados + 
            ") supera los días de vacaciones disponibles (" + this.diasVacaciones + ").");
            return false;
        }
        this.diasVacaciones -= diasSolicitados;
        System.out.println("¡Vacaciones aprobadas con éxito! Días tomados: " + diasSolicitados + ". Días restantes: " + 
        this.diasVacaciones);
        return true;
    }

    @Override
    public double calcularPagoMensual() {
        return this.salarioBasico;
    }

    @Override
    public String resumen() {
        return super.resumen() + ", Tipo: Administrativo, Salario Básico: " + this.salarioBasico + ", Días de Vacaciones Disponibles: " 
        + this.diasVacaciones;
    }
}