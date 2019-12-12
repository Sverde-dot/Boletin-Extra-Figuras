package figuras;

import java.util.Scanner;

public class Triangulo {
    
private final String letra="a";    
Scanner sc = new Scanner(System.in);
private int altura;

public void pedirDatos(){
    System.out.println("Introduce a altura do triángulo");
altura = sc.nextInt();    
}

public void DebuxaTriangulo(){
pedirDatos();
String acumulador = "a";
    for (int i=0;i<altura;i++){
        System.out.println(acumulador);
        acumulador+=letra;    
    }   
}
}
