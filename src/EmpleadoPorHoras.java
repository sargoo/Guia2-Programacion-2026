public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas = 0;
    private double valorHora;

    public EmpleadoPorHoras( int horasTrabajadas, double valorHora, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;

    }

    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPago() {
        double pago = this.horasTrabajadas * this.valorHora;
        setSalario(pago);
        return pago;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmpleadoPorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }
}
