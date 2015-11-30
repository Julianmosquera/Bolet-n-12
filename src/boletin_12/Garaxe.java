
package boletin_12;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Garaxe {
private short numeroCoches=5;
private int matricula;
private long tEntrada,tSalida;
private long tiempo;


    public Garaxe() {
    }
public boolean plazas(){
if (numeroCoches<5){
    JOptionPane.showMessageDialog(null,"ADELANTE");
    return true;
}

else{
    JOptionPane.showMessageDialog(null,"COMPLETO");
    return false;
}

}

public void pedirMatricula(){
    matricula=Integer.parseInt(JOptionPane.showInputDialog("Introduce la matricula"));
    
}
public long entrada(){
   if (plazas()==true){
       tEntrada=System.currentTimeMillis();
       
       } 
return tEntrada;
}    
 public long salida(){
     tSalida= System.currentTimeMillis();
     return tSalida;
 }

public long tiempo(){
    tiempo=(tSalida-tEntrada);
    return tiempo;
}

    @Override
    public String toString() {
        return "Garaxe{" + "numeroCoches=" + numeroCoches + ", matricula=" + matricula + ", tEntrada=" + tEntrada + ", tSalida=" + tSalida + ", tiempo=" + tiempo + '}';
    }



}
