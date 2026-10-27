public class Nomina {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NÓMINA UNINTEP ===");
        
        // 1.CREAMOS LOS EMPLEADOS: Docente y Administrativo.
        Docente docente1 = new Docente("Alejandro Valencia", "988568546", "Ingeniería de Sistemas", 
        48, 35000.0);
        Docente docente2 = new Docente("María Gómez", "987654321", "Matemáticas", 
        20, 32000.0);
        Administrativo administrativo1 = new Administrativo("Amistad", "9865741535", "Recursos Humanos", 
        2800000.0);

        // 2. IMPRESION DE EMPLEADOS
        System.out.println("\n--- RESUMEN DE EMPLEADOS ---");
        System.out.println(docente1.resumen());
        System.out.println(docente2.resumen());
        System.out.println(administrativo1.resumen());

        // 3. PAGO MENSUAL DE EMPLEADOS
        System.out.println("\n--- Pago Mensual ---");
        System.out.println("Pago del docente " + docente1.nombre + ": $" + docente1.calcularPagoMensual());
        System.out.println("Pago del docente " + docente2.nombre + ": $" + docente2.calcularPagoMensual());
        System.out.println("Pago del administrativo " + administrativo1.nombre + ": $" + administrativo1.calcularPagoMensual());

        // 4. VALIDACION DE VACACIONES DE ADMINISTRATIVO: Intento de tomar 5 días de vacaciones (válido)
        System.out.println("\n--- Solicitud de Vacaciones Válida ---");
        administrativo1.tomarVacaciones(5);

        // 5. VALIDACION DE VACACIONES DE ADMINISTRATIVO: Intento de tomar 20 días de vacaciones (inválido)
        System.out.println("\n--- Solicitud de Vacaciones Inválida (Exceso) ---");
        administrativo1.tomarVacaciones(20);

        // 6. Resumen final del administrativo con los días restantes
        System.out.println("\n--- Resumen Final del Administrativo ---");
        System.out.println(administrativo1.resumen());
    }
}