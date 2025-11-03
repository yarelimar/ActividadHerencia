public class Main {
    public static void main(String[] args) {
        EstudianteRegular er = new EstudianteRegular("Ana", 20, "A123", "Administración", 60);
        EstudianteBecado eb = new EstudianteBecado("Luis", 19, "B456", 50);
        EstudianteIntercambio ei = new EstudianteIntercambio("María", 21, "C789", "University of Toronto", 6);

        System.out.println("=== Estudiante Regular ===");
        er.mostrarInformacion();
        er.inscribirMateria();

        System.out.println("\n=== Estudiante Becado ===");
        eb.mostrarInformacion();
        double cuota = 1000.0;
        System.out.println("Cuota con descuento: $" + eb.calcularCuota(cuota));

        System.out.println("\n=== Estudiante Intercambio ===");
        ei.mostrarInformacion();
        ei.mostrarPeriodoIntercambio();
    }
}
