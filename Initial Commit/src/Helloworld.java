import javax.swing.*;

//added peeyush to helloworld
//Added loveleen to helloworld
public class Helloworld {

	 private static void createAndShowGUI() {

	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	        JLabel label = new JLabel("Hello World");
	        frame.getContentPane().add(label);

	  	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {

	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}
