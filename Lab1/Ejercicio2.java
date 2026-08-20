import java.util.Scanner;

class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int[] arreglo = new int[10];
        leerArreglo(scanner, arreglo);
        mostrarArreglo(arreglo);
        scanner.close();
    }
    public static void leerArreglo (Scanner scanner, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduce los elementos del arreglo:");
            int num = scanner.nextInt();
            if (i == 0){
                arreglo[1] = num;
            }
            else{
                while (num<=arreglo[i-1]){
                    System.out.println("El numero que ingreso no es mayor que el anterior");
                    System.out.print("Ingrese numero: ");
                    num = scanner.nextInt();
                    arreglo[1] = num;
                }
            }
        }
    }
    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("--------Arreglo--------"); 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Numero "+ (i+1)+":"+arreglo[i]);
        }
    }
}
