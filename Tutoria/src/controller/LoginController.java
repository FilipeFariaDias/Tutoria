package controller;


import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
	
	
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
    
    @FXML
    void entrarTutoria(javafx.event.ActionEvent event) throws IOException {
    	
    	Parent login = FXMLLoader.load(getClass().getResource("/view/Tutoria.fxml"));
    	Scene scene = new Scene(login);
    	
    	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
    	
    	janela.setScene(scene);
    	janela.show();
    }
    
    @FXML
    void loadCadastro(javafx.event.ActionEvent event) throws IOException {
    	
    	Parent login = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
    	Scene scene = new Scene(login);
    	
    	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
    	
    	janela.setScene(scene);
    	janela.show();
    }
    


}
