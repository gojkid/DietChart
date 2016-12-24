/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author Souvik
 */
public class PrintingTask extends SwingWorker<Object, Object> {
        private JTextArea text = new JTextArea();
 
        public PrintingTask(String data) {
            text.setText(data);
            this.execute();
        }
 
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
        public static void print(String data) {
            new PrintingTask(data);
        }
 
        protected Object doInBackground() {
            try {
                text.print(new MessageFormat(""), new MessageFormat(""), true, null, null, true);
            } catch (PrinterException ex) {
                //Opps... cant print. Insert error handling code here.
            }
            return null;
        }
}