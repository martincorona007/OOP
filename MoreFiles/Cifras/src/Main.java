import javax.swing.*;

#test github
public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Write a number among 0 into 99 9999 to know cifras "));
        if (x < 10) {
            JOptionPane.showMessageDialog(null, "You number have 1 cifra");
        } else if (x < 100) {
            JOptionPane.showMessageDialog(null, "You number have 2 cifras");
        } else if (x < 1000) {
            JOptionPane.showMessageDialog(null, "You number have 3 cifras");
        } else if (x < 10000) {
            JOptionPane.showMessageDialog(null, "you number have 4 cifras");
        } else if (x < 100000) {
            JOptionPane.showMessageDialog(null, "You number have 5 cifras");
        } else if (x < 1000000) {
            JOptionPane.showMessageDialog(null, "You number have 6 cifras");
        }

    }
}
