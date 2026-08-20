import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese horas de estacionamiento: ");
        int hora = scanner.nextInt();
        cargo(hora);
    }
    public static void cargo(int h){
        double cInicial = 3.00;
        if (h <= 0) {
            System.out.println("El cargo es S/. 0.00");
            return;
        } 
        double cTotal = (cInicial + ((h-1)*0.50));
        if (cTotal > 12 || h > 24) {
            cTotal = 12.00;
        }
        System.out.println("El cargo es S/." + cTotal);
    }
}
