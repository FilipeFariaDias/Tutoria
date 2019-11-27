package controller;

import Tutoria.Database;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
	
	private Database database;
	
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonSignup;

    @FXML
    private TextField UserLogin;

    @FXML
    private TextField UserSenha;
    
    
	public LoginController(Database database) {
		super();
		this.database = database;
	}
    
    @FXML
    void entrarTutoria(javafx.event.ActionEvent event) throws IOException {
    	
    	if(UserLogin.getText().isEmpty() || UserSenha.getText().isEmpty()) {
	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Insira o usuario ou a senha");
	    	alert.showAndWait();
    	}
    	
    	if(UserLogin.getText() == database.getUsuario().get(0).getNome() && UserSenha.getText() == database.getUsuario().get(0).getSenha()) {
        	Parent login = FXMLLoader.load(getClass().getResource("/view/Tutoria.fxml"));
        	Scene scene = new Scene(login,750,640);
        	
        	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
        	
        	janela.setScene(scene);
        	janela.show();
    	}
    	
    }
    
    @FXML
    void loadCadastro(javafx.event.ActionEvent event) throws IOException {
    	
    	Parent login = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
    	Scene scene = new Scene(login,750,640);
    	
    	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
    	
    	janela.setScene(scene);
    	janela.show();
    }


    


}
