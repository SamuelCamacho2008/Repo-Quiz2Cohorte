import java.util.Scanner;

public class quizEjer1 {
    public static void main(String[] args) {

         //Paso 1 realizar un escaner importandolo desde la librereria

        Scanner sc = new Scanner(System.in);
          //paso 2 Crear un vector que guarde 20 datos enteros
        int[] numeros = new int[20];
          //paso 3 crear contadores para ir acomulando los datos ingresados por el usuario para luego realizar el proceso con los 20 datos
        int sumaPares = 0;
        int sumaImpares = 0;
        int posPares = 0;
        int posImpares = 0;
        int contPares = 0;
        int contImpares = 0;

           // paso 4 Crear un for para hacer un ciclo hasta que llege a los 20 datos del vector en este caso numeros enteros

        for (int i = 0; i < 20; i++) {
            //paso 5 pedir al usuario que ingrese 20 numeros
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
           // paso 6 realizar un condicional en el cual primero colocamos la formula para que solo llame a los
           //numeros que son pares colocando (numeros[i] % 2 == 0) 
            if (numeros[i] % 2 == 0) {
          //paso 7 realizamos la suma con los numeros ingresados
                sumaPares += numeros[i];
                contPares++;
            } else {
                // lo mismo haremos con los numeros impares
                sumaImpares += numeros[i];
                contImpares++;
            }
            //paso 8 en este caso realizamos otro condicional if verdadero y falso para ver las posiciones en la cual estan ubicados los pares
            // y los impares para luego sumandolos y guardandolos 
            if (i % 2 == 0) {
                posPares += numeros[i];
            } else {
                posImpares += numeros[i];
            }
        }
      
sc.close();
          
         //paso 9  realizamos el proceso para sacar el promedio colocando la suma de los pares
         // dividiendola con todos los pares que fueron contados con el contador contpares obteniendo el promedio de pares
        double promedioPares = (double) sumaPares / contPares ;
         //paso 10  realizamos el mismo proceso para sacar el promedio colocando la suma de los impares
          // dividiendola con todos los impares que fueron contados con el contador contimpares obteniendo el promedio de los impares
        double promedioImpares = (double) sumaImpares / contImpares;


        // SALIDA
         //paso 11 por ultimo vamos a imprimir los datos pedidos q son el promedio de los impares y pares
         //  la cantidad de pares sumada y la cantidad de numeros imparessumada
        System.out.println("el promedio de los numeros pares es: " + promedioPares);
        System.out.println("el promedio de los numeros impares es: " + promedioImpares);
        System.out.println("la suma de los numeros impares es: " + sumaPares);
        System.out.println("la suma de los numeros impares es: " + sumaImpares);
    }
}