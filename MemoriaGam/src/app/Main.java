package app;

import java.awt.EventQueue;

import model.Controladora;
import view.Tela;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controladora controle = new Controladora();
					Tela frame = new Tela(controle);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
