import java.util.Scanner;

public class ProgramaHogar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Hogar1 hogar = new Hogar1(4, 2, 85, "madera", "sur", "si", "no", "si", "D");
        Hogar2 hogar1 = new Hogar2();
        System.out.println("Menú Hogares\n");
        int opcion;
        do {
            System.out.println("\n1. Ver hogar\n2. Modificar hogar\n3. Salir");
            boolean salir = false;
            opcion = sc.nextInt();
            String opcion1 = sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("¿Qué hogar desea mirar?(Introduzca 1 o 2)");
                    int respuesta = sc.nextInt();
                    if(respuesta == 1){
                        System.out.println("\nCasa nº1\n" + hogar);
                    }else if(respuesta == 2){
                        System.out.println("\nCasa nº2\nNúmero habitación=" + hogar1.numhab +
                                "\nNúmero baños=" + hogar1.numbanios +
                                "\nMetros cuadrados=" + hogar1.mcuadrados +
                                "\nPiso=" + hogar1.piso +
                                "\nOrientacion=" + hogar1.orientacion +
                                "\nGaraje=" + hogar1.garaje +
                                "\nPatio=" + hogar1.patio +
                                "\nTrastero=" + hogar1.trastero +
                                "\nCertificado energético=" + hogar1.certificado);
                    } else{
                        System.out.println("Número no válido");
                    }
                    break;
                case 2:
                    System.out.println("¿Qué hogar desea modificar?(Introduzca 1 o 2)");
                    respuesta = sc.nextInt();

                    if(respuesta == 1){
                        System.out.println("Número de habitaciones: ");
                        respuesta = sc.nextInt();
                        hogar.getNumhab();
                        System.out.println("Número de baños: ");
                        respuesta = sc.nextInt();
                        hogar.getNumbanios();
                        System.out.println("Metros cuadrados: ");
                        respuesta = sc.nextInt();
                        hogar.getMcuadrados();
                        System.out.println("Piso: ");
                        String respuesta1 = sc.nextLine();
                        hogar.getPiso();
                        System.out.println("Orientación: ");
                        respuesta1 = sc.nextLine();
                        hogar.getOrientacion();
                        System.out.println("Garaje (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar.getGaraje();
                        System.out.println("Patio (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar.getPatio();
                        System.out.println("Trastero  (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar.getTrastero();
                        System.out.println("Certificado energético (Letra de la A-F): ");
                        respuesta1 = sc.nextLine();
                        hogar.getCertificado();

                    }else if(respuesta == 2){

                        System.out.println("Número de habitaciones: ");
                        respuesta = sc.nextInt();
                        hogar1.numhab = respuesta;
                        System.out.println("Número de baños: ");
                        respuesta = sc.nextInt();
                        hogar1.numbanios = respuesta;
                        System.out.println("Metros cuadrados: ");
                        respuesta = sc.nextInt();
                        String respuestax = sc.nextLine();
                        hogar1.mcuadrados = respuesta;
                        System.out.println("Piso: ");
                        String respuesta1 = sc.nextLine();
                        hogar1.piso = respuesta1;
                        System.out.println("Orientación: ");
                        respuesta1 = sc.nextLine();
                        hogar1.orientacion = respuesta1;
                        System.out.println("Garaje (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar1.garaje = respuesta1;
                        System.out.println("Patio (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar1.patio = respuesta1;
                        System.out.println("Trastero  (Escriba 'si' o 'no'): ");
                        respuesta1 = sc.nextLine();
                        hogar1.trastero = respuesta1;
                        System.out.println("Certificado energético (Letra de la A-F): ");
                        respuesta1 = sc.nextLine();
                        hogar1.certificado = respuesta1;

                    }else{
                        System.out.println("Número no válido");
                    }
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Solo puede elegir números entre 1-3");

            }
        } while (opcion != 3);
    }
}
