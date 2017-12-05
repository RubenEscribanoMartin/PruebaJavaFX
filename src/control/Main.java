package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * A <b>JavaFX</b> Prueba JavaFX Primer Trimestre
 * 
 * @author Ruben Escribano
 * @version 1.0
 * @see Controller
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		/**
		 * cargamos el FXML
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("vista/login.fxml"));
		AnchorPane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		
		/**
		 * Fuentes: PoiretOne-Regular.ttf
		 */
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Font.loadFont(getClass().getResourceAsStream("vista/assets/fonts/PoiretOne-Regular.ttf"), 14);

		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
