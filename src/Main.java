//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int maxEmpleados = 0;
    int opcion = 0;
    int contador = 0;
    System.out.println("Ingrese cantidad total de empleados");
    maxEmpleados = sc.nextInt();
    sc.nextLine();
    Empleado[] empleados = new Empleado[maxEmpleados];
        do{
            System.out.println("\n--- MENÚ DE EMPLEADOS ---");
            System.out.println("1. Agregar Empleado.");
            System.out.println("2. Mostrar un empleado.");
            System.out.println("3. Mostrar todos los pagos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
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
                        seleccion = sc.nextInt();
                        sc.nextLine();
                        switch (seleccion) {
                            case 1 -> {
                                EmpleadoTiempoCompleto e = new EmpleadoTiempoCompleto("", 0);
                                System.out.println("Ingrese nombre del Empleado");
                                e.setNombre(sc.nextLine());
                                System.out.println("Ingrese salario del empleado");
                                e.setSalario(sc.nextDouble());
                                sc.nextLine();
                                empleados[contador] = e;
                                contador ++;
                            }

                            case 2-> {
                                EmpleadoPorHoras e = new EmpleadoPorHoras(0,0,"", 0);
                                System.out.println("Ingrese nombre del empleado:");
                                e.setNombre(sc.nextLine());
                                System.out.println("Ingrese el valor de la hora:");
                                e.setValorHora(sc.nextInt());
                                sc.nextLine();
                                System.out.println("Ingrese cantidad de horas");
                                e.setHorasTrabajadas(sc.nextInt());
                                sc.nextLine();
                                e.calcularPago();
                                empleados[contador] = e;
                                contador ++;

                            }

                            case 3 -> {
                                EmpleadoContratista e = new EmpleadoContratista(0,"",0);
                                System.out.println("Ingrese nombre del empleado");
                                e.setNombre(sc.nextLine());
                                System.out.println("Ingrese tarifa del empleado");
                                e.setTarifa(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingrese el valor de la hora:");
                                e.setValorHora(sc.nextInt());
                                sc.nextLine();
                                System.out.println("Ingrese cantidad de horas");
                                e.setHorasTrabajadas(sc.nextInt());
                                sc.nextLine();
                                e.calcularPago();
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
                    seleccion = sc.nextInt();
                    sc.nextLine();
                    switch (seleccion){
                        case 1 -> {
                            System.out.println("Ingrese nombre del empleado");
                            busqueda = sc.nextLine();
                            for(int i = 0; i < contador; i ++){
                                if(busqueda.equals(empleados[i].getNombre())){
                                    System.out.println(empleados[i].toString());
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
