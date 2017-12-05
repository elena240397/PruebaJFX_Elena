package control;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 05/12/2017
 * Login en la paguina de aventuras, "get started" te lleva a:
 * una panatalla con un gif del mar
 * @author Elena Roman
 * @version 1.0
 */
public class MainFX extends Application {

	private BorderPane Layout;
	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Examen");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);
			Thread.sleep(0);
			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Login.fxml"));
			Layout = (BorderPane) loader.load();

			Scene scene = new Scene(Layout, 931, 568);
			Font.loadFont(getClass().getResourceAsStream("vista.fuentes/PoirnetOne-Regular.ttf"), 20);

			primaryStage.setScene(scene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}