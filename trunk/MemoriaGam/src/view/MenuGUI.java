package view;

import model.Game;
import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MenuGUI extends BorderPane {
	public MenuGUI(){
		
		Button jogar = new Button("Jogar");
		jogar.setPrefSize(150, 50); // '->, up'
		Button sobre = new Button("Sobre");
		sobre.setPrefSize(150, 50);
		
		VBox vbox = new VBox(20);
		vbox.getChildren().addAll(jogar,sobre);
		vbox.setAlignment(Pos.CENTER);
		setCenter(vbox);
		
		jogar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Main.mudarTela(new GameGUI());
				
			}
		});
		
		sobre.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
