package stockage.sql;

import modele.Compte;
import stockage.Stockage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StockageCompteDataBase extends Stockage<Compte> {

    @Override
    public void create(Compte element) {
        SQLUtils utils = SQLUtils.getInstance();
        Connection connection = utils.getConnection();
        String req = "INSERT INTO Compte(numero,nomCompte) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(req)) {
            statement.setInt(1, element.getNumero());
            statement.setString(2, element.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Compte element) {
        SQLUtils utils = SQLUtils.getInstance();
        Connection connection = utils.getConnection();
        String req = "INSERT INTO Compte(numero,nomCompte) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(req)) {
            statement.setInt(1, element.getNumero());
            statement.setString(2, element.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Compte getById(int id) {
        return null;
    }

    @Override
    public List<Compte> getAll() {
        return null;
    }
}
