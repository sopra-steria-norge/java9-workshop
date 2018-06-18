package no.ss.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RunMeApplication extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Quotes");
        Label label = new Label("A quote");
        Scene scene = new Scene(label, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
