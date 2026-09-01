//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int maxEmpleados = 0;
    int opcion = 0;
    int contador = 0;
    System.out.println("Ingrese cantidad total de empleados");
    maxEmpleados = sc.nextInt();
    Empleado[] empleados = new Empleado[maxEmpleados];
        do{
            System.out.println("\n--- MENÚ DE EMPLEADOS ---");
            System.out.println("1. Agregar Empleado.");
            System.out.println("2. Mostrar un empleado.");
            System.out.println("3. Mostrar todos los pagos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            sc.nextLine();
            opcion = sc.nextInt();
            switch (opcion) {

                case 1 -> {
                    int seleccion = 0;

                    if (contador >= maxEmpleados) {
                        System.out.println( "No se pueden cargar mas empleados");
                    }
                    else {
                        System.out.println("Ingrese tipo de empleado:");
                        System.out.println("1- Empleado tiempo completo");
                        System.out.println("2- Empleado por horas.");
                        System.out.println("3- Empleado contratista.");
                        System.out.println("4- Atras");
                        sc.nextLine();
                        seleccion = sc.nextInt();
                        switch (seleccion) {
                            case 1 -> {
                                Empleado e = new EmpleadoTiempoCompleto("", 0);
                                System.out.println("Ingrese nombre del Empleado");
                                sc.nextLine();
                                e.setNombre(sc.nextLine());
                                System.out.println("Ingrese salario del empleado");
                                e.setSalario(sc.nextDouble());
                                empleados[contador] = e;
                                contador ++;
                            }
                        }


                    }
                }
                case 2 -> {
                    int seleccion = 0;
                    String busqueda;
                    System.out.println("1- buscar un empleado por nombre.");
                    System.out.println("2- ver todos los empleados");
                    sc.nextLine();
                    seleccion = sc.nextInt();
                    switch (seleccion){
                        case 1 -> {
                            System.out.println("Ingrese nombre del empleado");
                            sc.nextLine();
                            busqueda = sc.nextLine();
                            for(int i = 0; i < contador; i ++){
                                if(busqueda.equals(empleados[i].getNombre())){
                                    System.out.println(empleados[i].getNombre());
                                }
                            }
                        }

                        case 2 -> {
                            for (int c = 0; c < contador ; c ++){
                                System.out.println(empleados[c].toString());
                            }
                        }
                    }
                }
                case 3 -> {}
                case 4 -> {}
            }
        }while (opcion != 4);

}
