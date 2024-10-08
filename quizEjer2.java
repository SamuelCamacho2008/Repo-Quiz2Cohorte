import java.util.Scanner;


 public class quizEjer2 {
    public static void main(String[] args) {
      //Paso 1 realizar un escaner importandolo desde la librereria

        Scanner sc = new Scanner(System.in);
           //paso 2 Crear un vector que guarde 5 datos flotantes
        float[] alturas ;
        alturas = new float [5];
        //crear un for que cicle 5 veces los datos de las alturas ingresados por el usuario
      for (int i = 0; i<5; i++) {
      System.out.print("Ingresar la altura de la persona ");
            alturas[i] = sc.nextFloat();
      }
      //realizar dos contador suma y promedio
        float suma=0, promedio=0;
        for (int j=0;j<5;j++){
          //realizar la suma de las alturas
        suma=suma+alturas[j];
        }
        //realizar el promedio diviendo suma por las alturas q son 5 
        promedio=suma/5;
        
         // crear otras dos variables mayor y menor
         int may,men;
         may=0;
         men=0;
         // realizar otro for en el cual me va a contar cuantas alturas son mayores que el promedio
         for(int j=0;j<5;j++){
         if(alturas[j]> promedio){
             may++;
         } 
         // realizar otro for en el cual me va a contar cuantas alturas son menores que el promedio
         else if (alturas[j] < promedio) {
          
         men++;
         }
         sc.close();
         
        
    }
    //imprimir el promedio de las alturas mayores y menores
    System.out.println("promedio de alturas:"+promedio);
    System.out.println("la cantidad mayor del promedio es:"+may);
    System.out.println("la cantidad mayor del promedio es:"+men);
}      
    
 }