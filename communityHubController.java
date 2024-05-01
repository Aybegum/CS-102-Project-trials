import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import org.w3c.dom.Text;
import javafx.scene.Node;
public class communityHubController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button likedSongs;
    public void goToAlternativeCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("alternativeCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToPopCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("popCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToRbCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("r&bCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToHiphopCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hiphopCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToJazzCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("jazzCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToCountryCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("countryCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToClassicalCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("classicalCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToIndieCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("indieCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToRockCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("rockCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToMetalCommunity(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("metalCommunityPostPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void goToPlaylist(MouseEvent event, String name) throws Exception{

    }
}
