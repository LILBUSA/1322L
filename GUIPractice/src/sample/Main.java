package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Group root = new Group();
//        Canvas canvas = new Canvas(300, 200);
//        Scene scene = new Scene(root, 300, 275);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.fillOval(10, 60, 30, 30);
//        gc.strokeLine(40, 10, 10, 40);
//        root.getChildren().add(canvas);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        Scene scene = new Scene(grid, 500, 500);

        Label usernameLabel = new Label("Username ");
        Label passwordLabel = new Label("Password ");
        TextField usernameTA = new TextField();
        PasswordField passwordTA = new PasswordField();

        Button submitButton = new Button("Log In");

        grid.add(usernameLabel, 0, 0);
        grid.add(usernameTA, 1, 0);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordTA, 1, 1);
        grid.add(submitButton, 1, 2);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
