import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main (String args[]) {
		
		String text = JOptionPane.showInputDialog("Introduce un numero");
		int num = Integer.parseInt(text); //Pasamos el String a entero.
		
		if (num%2==0){ //Comprobamos si el número es divisible entre 2.
			System.out.println("El numero "+num+"es divisible entre 2");
		}
		else{
			System.out.println("El numero "+num+"no es divisible entre 2");
		} 
	}
}
		
		

