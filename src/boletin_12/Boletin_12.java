
package boletin_12;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Boletin_12 {

 
    public static void main(String[] args) {
        Garaxe obx=new Garaxe();
        Precio p=new Precio();
    
        int rep;
    
    int res;
        do {
            res = Integer.parseInt(JOptionPane.showInputDialog("¿Sale o entra en el garaje?\nMarque 1 si quiere entrar\nMarque 2 si quiere salir.\nSi quiere cerrar el programa marque 3."));

            if (res == 1) {

                obx.plazas();
            } else if (res == 2) {
                obx.pedirMatricula();
                JOptionPane.showMessageDialog(null, "El precio es de: " + p.precio());
                p.dinerodevuelta();
                JOptionPane.showMessageDialog(null, "" + obx.toString());
                
            }
        } while (res != 3);

    }
}
    
    
    
    
    
    
    
    
    
    
    

