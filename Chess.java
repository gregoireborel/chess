import javax.swing.JFrame;


public class Chess extends JFrame {
    Board _board; // where the game is being played

    public Chess() {
	this.setSize(640, 660);
	this.setTitle("Chess");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null); // Centers the frame in the middle of the screen
	this.setResizable(false); // Window cannot be resize
	this._board = new Board();
	getContentPane().add(_board);
    }
	
    public static void main(String[] args) {
	Chess window = new Chess();
	window.setVisible(true);
    }
}
