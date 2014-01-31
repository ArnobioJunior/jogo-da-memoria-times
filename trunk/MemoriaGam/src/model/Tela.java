package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.util.Collections;
import java.util.Random;

import javax.swing.UIManager;

public class Tela extends JFrame {

	private JPanel contentPane;
	int contador;
	String carta1;
	String carta2;
	JButton jbutton1;
	JButton jButton2;

	int[] lista = {1,2,3,4,5,6,1,2,3,4,5,6};
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void InsereImagem(JButton button, String imagem){

		button.setIcon(new ImageIcon(imagem));	
	}
	
	public void Verifica(String nomeImagem, JButton button){
		
		if(contador == 0){
			contador++;
			carta1 = nomeImagem;
			jbutton1 = button;
			
		} else if(contador == 1) {
			if (button != jbutton1){
				carta2 = nomeImagem;
				jButton2 = button;
	
				if (carta1.equals(carta2)) {
	
					jbutton1.setEnabled(false);
					jButton2.setEnabled(false);
					contador = 0;
					
				} else {
					contador++;
				}	
			}
			
		}else{
			jbutton1.setIcon(null);
			jButton2.setIcon(null);
			contador = 0;
			Verifica(nomeImagem, button);
		}
	}

	  static void embaralha(int[] array)
	  {
	    Random rnd = new Random();
	    for (int i = array.length - 1; i > 0; i--)
	    {
	      //sorteio
	      int index = rnd.nextInt(i);
	      int a = array[index];
	      
	      //troca
	      array[index] = array[i];
	      array[i] = a;
	    }
	  }	
	
	public void random(){
		embaralha(lista);
	}
	
	/**
	 * Create the frame.
	 */
	public Tela() {
		setTitle("Jogo da Memória");
		random();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		contador = 0;
		
		final JButton botao1 = new JButton("");
		botao1.setBackground(UIManager.getColor("Button.shadow"));
		botao1.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao1, "src/imgs/"+ lista[0] +".png");
				Verifica("src/imgs/"+ lista[0] +".png", botao1);
			}
		});
		contentPane.add(botao1);
		
		final JButton botao2 = new JButton("");
		botao2.setBackground(UIManager.getColor("Button.shadow"));
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao2, "src/imgs/"+ lista[1] +".png");
				Verifica("src/imgs/"+ lista[1] +".png", botao2);
			}
		});
		contentPane.add(botao2);
		
		final JButton botao3 = new JButton("");
		botao3.setBackground(UIManager.getColor("Button.shadow"));
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao3, "src/imgs/"+ lista[2] +".png");
				Verifica("src/imgs/"+ lista[2] +".png", botao3);
			}
		});
		contentPane.add(botao3);
		
		final JButton botao4 = new JButton("");
		botao4.setBackground(UIManager.getColor("Button.shadow"));
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao4, "src/imgs/"+ lista[3] +".png");
				Verifica("src/imgs/"+ lista[3] +".png", botao4);
			}
		});
		contentPane.add(botao4);
		
		final JButton botao5 = new JButton("");
		botao5.setBackground(UIManager.getColor("Button.shadow"));
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao5, "src/imgs/"+ lista[4] +".png");
				Verifica("src/imgs/"+ lista[4] +".png", botao5);
			}
		});
		contentPane.add(botao5);
		
		final JButton botao6 = new JButton("");
		botao6.setBackground(UIManager.getColor("Button.shadow"));
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao6, "src/imgs/"+ lista[5] +".png");
				Verifica("src/imgs/"+ lista[5] +".png", botao6);
			}
		});
		contentPane.add(botao6);
		
		final JButton botao7 = new JButton("");
		botao7.setBackground(UIManager.getColor("Button.shadow"));
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao7, "src/imgs/"+ lista[6] +".png");
				Verifica("src/imgs/"+ lista[6] +".png", botao7);
			}
		});
		contentPane.add(botao7);
		
		final JButton botao8 = new JButton("");
		botao8.setBackground(UIManager.getColor("Button.shadow"));
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao8, "src/imgs/"+ lista[7] +".png");
				Verifica("src/imgs/"+ lista[7] +".png", botao8);
			}
		});
		contentPane.add(botao8);
		
		final JButton botao9 = new JButton("");
		botao9.setBackground(UIManager.getColor("Button.shadow"));
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao9, "src/imgs/"+ lista[8] +".png");
				Verifica("src/imgs/"+ lista[8] +".png", botao9);
			}
		});
		contentPane.add(botao9);
		
		final JButton botao10 = new JButton("");
		botao10.setBackground(UIManager.getColor("Button.shadow"));
		botao10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao10, "src/imgs/"+ lista[9] +".png");
				Verifica("src/imgs/"+ lista[9] +".png", botao10);
			}
		});
		contentPane.add(botao10);
		
		final JButton botao11 = new JButton("");
		botao11.setBackground(UIManager.getColor("Button.shadow"));
		botao11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao11, "src/imgs/"+ lista[10] +".png");
				Verifica("src/imgs/"+ lista[10] +".png", botao11);
			}
		});
		contentPane.add(botao11);
		
		final JButton botao12 = new JButton("");
		botao12.setBackground(UIManager.getColor("Button.shadow"));
		botao12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsereImagem(botao12, "src/imgs/"+ lista[11] +".png");
				Verifica("src/imgs/"+ lista[11] +".png", botao12);
			}
		});
		contentPane.add(botao12);
		
	}
	
	
}
