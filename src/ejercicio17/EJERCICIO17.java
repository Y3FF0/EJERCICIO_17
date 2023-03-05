/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Jeffrey Santiago Navarro Espinosa
 */
public class EJERCICIO17 {

    public static void main(String[] args) {
        
        float radio,area,longitud, pi;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo para hallar el area y su longitud: ");
        radio=entrada.nextFloat();
        
        pi=(float) Math.PI;
        
        area=pi*((float) Math.pow(radio,2));
        longitud=2*pi*radio;
        
        System.out.println("El area del circulo con el radio "+radio+" es: "+area);
        System.out.println("La longitud del circulo con el radio "+radio+" es: "+longitud);
        
        
        
    }
    
}
