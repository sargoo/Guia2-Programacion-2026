public class EmpleadoContratista extends Empleado{
    private double tarifa;
    public EmpleadoContratista(double tarifa, String nombre, double salario){
        super(nombre, salario);

    }

    @Override
    public double calcularPago() {
        return 0;
    }
}
