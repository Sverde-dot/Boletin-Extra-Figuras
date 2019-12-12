
package figuras;

/**
 *
 * @author sverdecadilla
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo obxT=new Triangulo();
        obxT.pedirDatos();
        obxT.DTriangulo();
        Piramide obxP=new Piramide();
        obxP.pedirDatos();
        obxP.DPiramide();
        
    }
    
}
