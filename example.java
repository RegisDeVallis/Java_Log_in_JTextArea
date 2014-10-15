
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    JFrame jframe = new JFrame(); 
    
    jframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    jframe.setTitle("example");
    jframe.setResizable(false);
         
    JTextArea console = new JTextArea(20,20);  
    
    main.TextAreaOutputStream taos = main.TextAreaOutputStream.getInstance(console);  
    jframe.getContentPane().add(console);  
    jframe.pack();  
    jframe.show();  
    
    
         
    System.out.println("Test 1");  
    
    System.out.println("Hello World");
    }
    
}
