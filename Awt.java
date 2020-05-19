import java.awt.*;
public class Awt{
public static void main(String[] args){
	Frame win=new Frame("Coba AWT");
	Label myLabel= new Label ("Selamat Belajar Java");
	win.add(myLabel);
	win.setSize (300,200);
	win.show();
	}
} 
