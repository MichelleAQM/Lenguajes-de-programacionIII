#include <iostream> 
using namespace std; 

void ingresarDatos(int cant, int arreglo[]){ 
    int num; 
    for(int i = 0; i < cant; i++){ 
        cout << "Ingrese numero: "; 
        cin >> num; 
        arreglo[i] = num; 
    } 
} 

int sumarDatos(const int arreglo[], int cant){ 
    int suma = 0; 
    for (int i = 0; i < cant; i++){ 
        suma = suma + arreglo[i]; 
    } 
    return suma; 
} 

int main() { 
    int cant, suma; 
    cout << "Ingrese la cantidad del arreglo: "; 
    cin >> cant; 
    
    int* arreglo = new int[cant]; 
    ingresarDatos(cant, arreglo); 
    suma = sumarDatos(arreglo, cant); 
    
    cout << "La suma de dato es: " << suma << endl; 
    
    delete[] arreglo; 
    return 0; 
}

