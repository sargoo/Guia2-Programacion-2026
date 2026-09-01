//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int maxEmpleados = 0;
    int opcion = 0;
    System.out.println("Ingrese cantidad total de empleados");
    maxEmpleados = sc.nextInt();
    Empleado[] empleados = new Empleado[maxEmpleados];
        do{
            System.out.println("\n--- MENÚ DE EMPLEADOS ---");
            System.out.println("1. Agregar Empleado.");
            System.out.println("2. Agregar Empleado Contratista");
            System.out.println("3. Mostrar todos los pagos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1 -> {
                    int contador = 0;
                    if (contador >= maxEmpleados) {
                        System.out.println( "No se pueden cargar mas empleados");
                    }
                    else {
                        System.out.println("Ingrese tipo de empleado:");
                        System.out.println("1- Empleado tiempo completo");
                        System.out.println("2- Empleado por horas.");
                        System.out.println("3- Empleado contratista.");
                    }
                }
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
            }
        }while (opcion != 4);

}
