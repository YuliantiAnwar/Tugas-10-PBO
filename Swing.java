import javax.swing.*;
public class Swing{
public static void main(String[] args){
JFrame myFrame = new JFrame("contoh progam Swing");
JLabel myLabel = new JLabel("selamat belajar JAVA");
myFrame.add(myLabel);
myFrame.setSize(200,150);
myFrame.setVisible(true);
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}