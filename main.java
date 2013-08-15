import javax.swing.JFrame;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window simpleWin = new Window("Window!"); 
		simpleWin.setLocationRelativeTo(null); //centers the window when it opens 
		simpleWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
