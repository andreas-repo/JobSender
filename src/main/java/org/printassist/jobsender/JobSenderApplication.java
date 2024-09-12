package org.printassist.jobsender;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class JobSenderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JobSenderApplication.class.getResource("create-job-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Screen.getPrimary().getVisualBounds().getWidth()-10, Screen.getPrimary().getVisualBounds().getHeight()-10);
        stage.setTitle("Welcome to Job Creation Application!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}