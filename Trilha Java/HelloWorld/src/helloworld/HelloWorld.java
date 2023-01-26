
package helloworld;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hallo World!!");
        
        Date relogio = new Date();
        System.out.println("Estamos em:");
        System.out.println(relogio.toString());
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.toString());
    }
    
}
