package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Canvas canvas = new Canvas(300, 200);
        Scene scene = new Scene(root, 300, 275);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillOval(10, 60, 30, 30);
        gc.strokeLine(40, 10, 10, 40);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
