public class EmpleadoContratista extends Empleado{
    private double tarifa;
    private int horasTrabajadas = 0;
    private double valorHora = 0;
    public EmpleadoContratista(double tarifa, String nombre, double salario){
        super(nombre, salario);
        this.tarifa = tarifa;
    }

    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }

    public double getTarifa(){
        return  this.tarifa;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmpleadoContratista{" +
                "tarifa=" + tarifa +

                '}';
    }

  public double calcularPago(){
        double pago = (this.horasTrabajadas * this.valorHora) + this.tarifa;
        setSalario(pago);
        return pago;
  }
}
