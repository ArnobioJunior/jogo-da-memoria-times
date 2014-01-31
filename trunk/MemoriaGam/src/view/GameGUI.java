package view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameGUI extends BorderPane {
	
	//private ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,im12;
	
	public GameGUI(){
		
		final ImageView im1 = new ImageView("/imagens/1.png");
		final ImageView im2 = new ImageView("/imagens/1.png");
		final ImageView im3 = new ImageView("/imagens/1.png");
		final ImageView im4 = new ImageView("/imagens/1.png");
		final ImageView im5 = new ImageView("/imagens/1.png");
		final ImageView im6 = new ImageView("/imagens/1.png");
		final ImageView im7 = new ImageView("/imagens/1.png");
		final ImageView im8 = new ImageView("/imagens/1.png");
		final ImageView im9 = new ImageView("/imagens/1.png");
		final ImageView im10 = new ImageView("/imagens/1.png");
		final ImageView im11 = new ImageView("/imagens/1.png");
		final ImageView im12 = new ImageView("/imagens/1.png");
		
		HBox hbox1 = new HBox(20);
		hbox1.getChildren().addAll(im1,im2,im3,im4);
		
		HBox hbox2 = new HBox(20);
		hbox2.getChildren().addAll(im5,im6,im7,im8);
		
		HBox hbox3 = new HBox(20);
		hbox3.getChildren().addAll(im9,im10,im11,im12);
		
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(hbox1,hbox2,hbox3);
		vbox.setAlignment(Pos.CENTER_RIGHT);
		setCenter(vbox);

		
		
		//Da linha 48 .. 390
		im1.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});
					
		//Quando mover o mouse opacidade diminui.
		im1.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im1.setOpacity(0.5);
						
			}
		});
		
		//Botão voltar ao normal.		
		im1.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im1.setOpacity(1);
						
			}
		});
		
		//Outro.
		im2.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				
						
			}
		});
					
		im2.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im2.setOpacity(0.5);
						
			}
		});	
		im2.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im2.setOpacity(1);
						
			}
		});
		
		//Outro.
		
		im3.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});
					

		im3.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im3.setOpacity(0.5);
						
			}
		});

		im3.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im3.setOpacity(1);
						
			}
		});
		
		//Outro.
		
		im4.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});
					

		im4.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im4.setOpacity(0.5);
						
			}
		});

		im4.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im4.setOpacity(1);
						
			}
		});
		
		//Outro
		im5.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im5.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im5.setOpacity(0.5);
						
			}
		});
	
		im5.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im5.setOpacity(1);
						
			}
		});
		
		//Outro
		im6.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im6.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im6.setOpacity(0.5);
						
			}
		});
	
		im6.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im6.setOpacity(1);
						
			}
		});
		
		//Outro
		im7.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im7.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im7.setOpacity(0.5);
						
			}
		});
	
		im7.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im7.setOpacity(1);
						
			}
		});
		
		//Outro
		im8.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im8.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im8.setOpacity(0.5);
						
			}
		});
	
		im8.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im8.setOpacity(1);
						
			}
		});
		
		//Outro
		im9.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im9.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im9.setOpacity(0.5);
						
			}
		});
	
		im9.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im9.setOpacity(1);
						
			}
		});
		
		//Outro
		im10.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im10.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im10.setOpacity(0.5);
						
			}
		});
	
		im10.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im10.setOpacity(1);
						
			}
		});
		
		//Outro
		im11.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im11.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im11.setOpacity(0.5);
						
			}
		});
	
		im11.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im11.setOpacity(1);
						
			}
		});
		
		//Outro
		im12.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				System.out.println("Foi pressionado!");
						
			}
		});

		im12.setOnMouseMoved(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				im12.setOpacity(0.5);
						
			}
		});
	
		im12.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				im12.setOpacity(1);
						
			}
		});
		
	}

}
