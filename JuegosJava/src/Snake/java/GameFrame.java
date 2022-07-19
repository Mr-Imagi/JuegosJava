package Snake.java;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame(){
		//añade el panel
		this.add(new GamePanel());
		
		//añade el titulo
		this.setTitle("Snake");
		
		//esto hace que cuando se aprete la X se cierre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//esto es para que no se pueda cambiar el tamaño
		this.setResizable(false);
		
		//Toma JFRAME y añade los componentes que queramos
		this.pack();
		
		//
		this.setVisible(true);
		
		//Es para que el panel aparezca en medio de la pantalla
		this.setLocationRelativeTo(null);
	}
}
