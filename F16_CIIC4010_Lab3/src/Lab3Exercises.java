import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Ademir Khattar Jbour Sanchez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(850, 450);
		myFrame.setSize(350, 200);
		MyPanelClass myPanel = new MyPanelClass();
	    myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}