package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	/**
	 * M�todo que sirve para lanzar otra ventana de la aplicaci�n
	 * @param secondStage
	 */
	@FXML
	public void openStage(Stage secondStage){
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("vista/freeSolo.fxml"));
		AnchorPane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(pane);
		secondStage.setScene(scene);
	
	}

	/**
	 * M�todo que sirve para cerrar la aplicaci�n
	 * @param event
	 */
	@FXML
	public void closeApp(ActionEvent event) {
		System.exit(0);
	}


}
