
package boletin_12;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Precio {
    

    private float precio;
    private float cRecibidos;
    private float cDevueltos;

    public Precio() {
    }
    
    
    public Precio(float precio, float cRecibidos, float cDevueltos) {
        
        this.precio = precio;
        this.cRecibidos = cRecibidos;
        this.cDevueltos = cDevueltos;
    }
  
    Garaxe obx1=new Garaxe(); 
   public float precio() {
        float tiem = obx1.tiempo();
        if (tiem <= 3) {
            precio = 1.5f;
        } else {
            float tiem2 = (tiem - 3);
            precio = (float) (+1.5 + (0.2 * tiem2));
        }
        return precio;
    }
   public float dinerorecibido(){
       return cRecibidos=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de dinero introducido"));
   }
   
   public float dinerodevuelta(){
      return cDevueltos=precio-cRecibidos; 
       
   }

    
    
 
    

    
}
