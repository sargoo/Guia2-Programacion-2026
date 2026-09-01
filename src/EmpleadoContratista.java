public class EmpleadoContratista extends EmpleadoPorHoras{
    private double tarifa;
    public EmpleadoContratista(double tarifa,int horasTrabajadas,double valorHora, String nombre, double salario){
        super(horasTrabajadas, valorHora, nombre, salario);
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "EmpleadoContratista{" +
                "tarifa=" + tarifa +
                super.toString() +
                '}';
    }

    @Override
    public double calcularPago() {

        return super.calcularPago() + this.tarifa;


    }
}
