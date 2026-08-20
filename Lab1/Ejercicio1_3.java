import java.util.Scanner;
class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");
        int n = scanner.nextInt();
        System.out.println("Introduce los elementos del arreglo:");
        int[] arreglo = new int[n];
        leerArreglo(scanner, arreglo);
        int sumaArreglo = sumarDatos(arreglo);
        System.out.println("Suma del arreglo:" + sumaArreglo);
    } 
    public static void leerArreglo (Scanner scanner, int[] arreglo) {
        for (int i=0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
    }
    public static int sumarDatos (int[] arreglo) {
        int suma = 0;
        for (int num: arreglo) {
            suma = suma + num;
        }
        return suma;
    }
}
