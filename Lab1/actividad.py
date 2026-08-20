def ingresarDatos(cantidad, arreglo):
    for i in range(cantidad):
        num = int(input("Ingresa número: "))
        arreglo.append(num)

def sumaElementos(arreglo):
    suma = 0
    for i in range(len(arreglo)):
        suma = suma + arreglo[i]
    return suma

cant = int(input("Ingresa cantidad del arreglo: "))
arreglo = []
ingresarDatos(cant, arreglo)
suma = sumaElementos(arreglo)
print("La suma de elementos es: ", suma)
