
package ec.edu.ister.contolador;

import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class AreaCuadrado {
    public static void main(String[] args) {
        int lado, area;
String mensaje ="cuadrado pequeño";

lado= Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado del cuadrado"));

area=lado*lado;
if (area <10){
	mensaje ="cuadrado pequeño";
}
JOptionPane.showMessageDialog(null, mensaje);
    }
   
}

