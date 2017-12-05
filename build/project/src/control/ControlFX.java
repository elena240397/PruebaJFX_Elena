package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ControlFX {
	@FXML
	private ImageView mar;

	private Ellipse base;

	private void inicio(BorderPane root) {
		base = new Ellipse();
		base.centerXProperty().bind(root.widthProperty().multiply(0.5));
		base.centerYProperty().setValue(0);
		base.radiusXProperty().bind(root.widthProperty().multiply(0.8));
		base.radiusYProperty().bind(root.heightProperty().multiply(0.6));
	}

	public void showFree() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/FreeSolo.fxml"));
			BorderPane page = (BorderPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FreeSolo");

			mar = new ImageView();

			mar.setEffect(new GaussianBlur(5));
			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void openStage() {
		showFree();
	}

	@FXML
	private void closeApp() {
		System.exit(0);
	}
}