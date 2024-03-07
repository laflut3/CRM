package ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        redirectToLoginPage();
    }

    public static void redirectToLoginPage() throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("login.fxml"));
        primaryStage.setTitle("Page de connexion");
        primaryStage.setScene(new Scene(root, 320, 200));
        primaryStage.show();
    }

    public static void redirectToMainPage() throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("main.fxml"));
        primaryStage.setTitle("Page principale");
        primaryStage.setScene(new Scene(root, 320, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}