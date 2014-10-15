/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JTextArea;

/**
 *
 * @author Dalen
 */
public class TextAreaOutputStream extends OutputStream {  
    private static final TextAreaOutputStream INSTANCE = new TextAreaOutputStream();  
    private static final PrintStream OUT;  
    private static JTextArea outWriter;  
    private static boolean TAINTED = false;  
    static {  
        OUT = System.out;  
        System.setOut(new PrintStream(new TextAreaOutputStream()));  
    }  
   
    /** Creates a new instance of TextAreaOutputStream. */  
    private TextAreaOutputStream() {}  
   
    /** Gets the output stream. */  
    public static TextAreaOutputStream getInstance(JTextArea textArea) {  
        outWriter = textArea;  
        return INSTANCE;  
    }  
   
    /** Gets the functioning console output. 
      * @see java.lang.System.out 
      */  
    public static PrintStream getOldSystemOut() {  
        return OUT;  
    }  
   
    /** Determines if output has occured. */  
    public static boolean isTainted() {  
        return TAINTED;  
    }  
   
    /** Write output to the Text Area. */  
    public void write(int param) {  
        outWriter.setText(outWriter.getText() + (char)param);  
        TAINTED = true;  
    }  
}  
