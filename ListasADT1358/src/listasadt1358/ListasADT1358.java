/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author Ninja
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT( );
        lsl2.append(new Empleado(1, "Angel", "Gonzalez", "Mireles", 1523.4f, 2015, 1));
        lsl2.append(new Empleado(1, "Jose", "Perez", "Martinez", 1523.4f, 2015, 1));
        lsl2.append(new Empleado(1, "Diana", "Prada", "Ortega", 1523.4f, 2015, 1));
        lsl2.append(new Empleado(1, "Santiago", "Austria", "Campos", 1523.4f, 2015, 1));
        
        lsl2.transversal();
        
    }
    
}
