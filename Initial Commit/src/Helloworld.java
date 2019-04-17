import javax.swing.*;

//added peeyush to helloworld
//Added loveleen to helloworld
//Added Peeyush to helloworld APP
public class Helloworld {

	 private static void createAndShowGUI() {

	        JFrame frame = new JFrame("HelloWorldSwing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	        JLabel label1 = new JLabel("Hello World by Peeyush");
	        frame.getContentPane().add(label1);

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
