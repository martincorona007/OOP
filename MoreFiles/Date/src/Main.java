
import javax.swing.*;

/**
 * Created by Genoveva on 02/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        int m = Integer.parseInt(JOptionPane.showInputDialog("Tell me a month"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("tell me a day"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Tell me a year"));

        if (d >= 1 && d<=30) {
            if (m>=1 && m<=12 ){
                if (y!=0){
                    JOptionPane.showMessageDialog(null,"Date correct");
                }else{
                    JOptionPane.showMessageDialog(null,"Year wrong");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Month wrong");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Day wrong ");
        }

    }
}