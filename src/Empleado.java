public abstract class   Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return this.nombre;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }

    public abstract double calcularPago();
}
