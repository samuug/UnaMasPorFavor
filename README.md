# UnaMasPorFavor

## Nota:
Mi repositorio es: https://github.com/samuug/UnaMasPorFavor.git

## Enunciado:

### 1. Dado el siguiente fragmento de código C:  
#### a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?  
La llamada a la función recursiva bisect(0,N) calcula la raíz cuadrada de 2, es decir, el valor de x tal que x*x = N (donde N = 2 en este caso).  

Si cambiamos el valor de N a cualquier otro número positivo, la función calculará la raíz cuadrada de ese número.  

Si cambiamos la función f(x) a otra función, el algoritmo seguirá funcionando siempre y cuando haya un cambio de signo en el intervalo dado, lo que indica que hay una raíz en ese intervalo. Si no hay un cambio de signo en el intervalo dado, el algoritmo no encontrará una raíz. En ese caso, deberíamos cambiar el intervalo de búsqueda o modificar la función para que tenga una raíz en el intervalo dado.  
#### b) Implemente un algoritmo iterativo equivalente.  
Resuelto dentro de paquete Ejercicio1 en la Clase Iteratividad.  

### 2. Dado el siguiente algoritmo recursivo:
#### a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?  
La función recursiva f(num, div) muestra por pantalla los factores primos del número num. En particular, la llamada a la función f(x,2) mostrará los factores primos de x.

Un nombre más adecuado para la función f sería printPrimeFactors, ya que su objetivo es imprimir los factores primos de un número.
#### b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda equivalentes.  
Resuelto dentro de paquete Ejercicio2 en la Clase Iteratividad.  
  
### 3. Construya una función que convierta un número decimal en una cadena que represente el valor del número en hexadecimal (base 16). A continuación, generalice la función para convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante expresiones lambda. Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16 en las cuales los restos determinan los dígitos hexadecimales del número según la siguiente correspondencia:  
#### Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
#### Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
#### Por ejemplo:
#### 65029|10 = FE05|16
Ejercicio resuelto en paquete Ejercicio3.

### 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo, “DABALEARROZALAZORRAELABAD” es un palíndromo.  
Ejericio resuelto en paquete Ejercicio4.

### 5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda, una función que nos devuelva el máximo común divisor de dos números enteros utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES  
Dados dos números enteros positivos m y n, tal que m > n, para encontrar su máximo común divisor (es decir, el mayor entero positivo que divide a ambos):  
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r)
  
Ejercicio resuelto en paquete Ejercicio5
