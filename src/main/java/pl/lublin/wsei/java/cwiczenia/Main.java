package pl.lublin.wsei.java.cwiczenia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gusInfoGraphic.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 700);
        Controller controller = fxmlLoader.getController();
        controller.setHostServices(this.getHostServices());
        controller.setStage(primaryStage);

        primaryStage.setTitle("Infografiki GUS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}