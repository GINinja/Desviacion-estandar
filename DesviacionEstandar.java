
/**
 * Herramienta para calcular la desviacion estandar.
 *
 * @author (GINinja)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DesviacionEstandar {
    public static void main(String[] args) {
        double elementos_a;
        double suma = 0;
        double promedio;
        double o = 0;
        double desviacion;
       
        
        ArrayList<Double> vector_a = new ArrayList<Double>();
        
        
        System.out.println("Desviación Estadar");
        System.out.println("-----------------------");
        
        Scanner entrada = new Scanner (System.in);
       
        // Solicitar numero de elementos del arreglo
        do{
            System.out.println("Digite el 'número' de elementos del vector");
            elementos_a = entrada.nextDouble(); 
        }while(elementos_a <= 0);

        for (int i=0;i<elementos_a;i++){
            do{
                //i = i+1;
                System.out.println("Digite los datos del vector ["+ i +"]");                
                vector_a.add(entrada.nextDouble());
            }while(vector_a.get(i) <= 0);
        }
        
        for (int i=0;i<elementos_a;i++){
            suma  = suma + vector_a.get(i);
        }
        
        promedio = (suma/elementos_a);
        System.out.println("---- "+promedio);
        
        for (int i=0;i<elementos_a;i++){
            o = Math.pow((vector_a.get(i) - promedio),2) + o;
                  
        }
        
        desviacion = Math.sqrt((o/elementos_a));
        
       
        System.out.println("La desviación estandar del vector A: "+ vector_a +" es: "+ desviacion);
    }
}