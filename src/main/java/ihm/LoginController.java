import ihm.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Vérifiez les informations d'identification ici
        // Si la connexion réussit, redirigez vers la page principale
        // Par exemple :
        if (username.equals("utilisateur") && password.equals("motdepasse")) {
            Main.redirectToMainPage();
        } else {
            // Affichez un message d'erreur si la connexion échoue
            System.out.println("Identifiants incorrects");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialisation du contrôleur
    }
}