package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene_main.fxml"));
        Parent root = loader.load();

        MainController controller = loader.getController();

        double width = 400, height = 300;
        Scene mainScene = new Scene(root, width, height);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("ROP Simulation");
        primaryStage.show();

    }



}
