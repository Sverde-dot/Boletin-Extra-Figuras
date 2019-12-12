package figuras;

import java.util.Scanner;


public class Piramide {  
Scanner sc = new Scanner(System.in);
private int numFilas;

public void pedirDatos(){
    System.out.println("Introduce o numero de filas da piramide");
numFilas = sc.nextInt();    
}

public void DebuxaPiramide(){
pedirDatos();   
        for(int altura = 1; altura<=numFilas; altura++){

            for(int espacios = 1; espacios<=numFilas-altura; espacios++){
                System.out.print(" ");
            }
 
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();  
}      
}    
    
}

