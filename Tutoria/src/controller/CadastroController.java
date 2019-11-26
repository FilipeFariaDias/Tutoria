
package controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class CadastroController {


	    @FXML
	    private AnchorPane rootPane;

	    @FXML
	    private TextField textNome;

	    @FXML
	    private TextField textMatricula;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtSenha;

	    @FXML
	    private CheckBox checkMatricula;

	    @FXML
	    private CheckBox checkServicos;

	    @FXML
	    private CheckBox checkEstudos;

	    @FXML
	    private CheckBox checkOrientacao;

	    @FXML
	    private CheckBox checkAdministrativo;

	    @FXML
	    private CheckBox checkProjeto;

	    @FXML
	    private CheckBox checkAcompanhamento;

	    @FXML
	    private CheckBox checkOutros;

	    @FXML
	    private Button salvarCadastro;

	    @FXML
	    private Button cancelarCadastro;

	    @FXML
	    private RadioButton vinculoDocente;

	    @FXML
	    private ToggleGroup checkVinculo;

	    @FXML
	    private RadioButton vinculoPosGrad;

	    @FXML
	    private RadioButton vinculoGrad;
	    
	    @FXML
	    private Label labelNome;

	    @FXML
	    private Label labelMatricula;

	    @FXML
	    private Label labelEmail;

	    @FXML
	    private Label labelSenha;

	    @FXML
	    private Label labelVinculo;

	    @FXML
	    private Label labelTopico;

	    @FXML
	    void cancelarCadastro(ActionEvent event) throws IOException{

	    	Parent cadastro = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
	    	Scene scene = new Scene(cadastro);
	    	
	    	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	
	    	janela.setScene(scene);
	    	janela.show();
	    }
	    
	    
	    
	    
	    @FXML 
	    private void salvarCadastro(ActionEvent event) throws IOException {

		    String nome = textNome.getText();
		    String senha = txtSenha.getText();
		    String matricula = textMatricula.getText();
		    String email = txtEmail.getText();
		    RadioButton radioVinculo = (RadioButton) checkVinculo.getSelectedToggle();
		    List<String> topico = new ArrayList<String>();
		    
		    String vinculo = radioVinculo.getText();

			    
			if(checkMatricula.isSelected())
			   	topico.add("Matricula");
			if(checkServicos.isSelected())
			   	topico.add("Servicos");
			if(checkEstudos.isSelected())
			   	topico.add("Estudos");
			if(checkOrientacao.isSelected())
			   	topico.add("Orientacao");
			if(checkAdministrativo.isSelected())
			   	topico.add("Administrativo");
			if(checkProjeto.isSelected())
			   	topico.add("Projeto");
			if(checkAcompanhamento.isSelected())
			   	topico.add("Acompanhamento");
			if(checkOutros.isSelected())
			   	topico.add("Outros"); 
			    
			if(nome.isEmpty())
				labelNome.setText("Digite um nome");
			if(senha.isEmpty())
				labelSenha.setText("Digite uma senha");
			if(email.isEmpty())
				labelEmail.setText("Digite um email");
			if(matricula.isEmpty())
				labelMatricula.setText("Insira a matricula");
			if(topico.isEmpty())
				labelTopico.setText("Selecione no minimo 1 topico");
			
		
		    	
		    System.out.println(nome);
		    System.out.println(senha);		//n esquecer de apagar depois
		    System.out.println(matricula);
		    System.out.println(email);
		    System.out.println(vinculo);
		    for(String topicos: topico)
		    	System.out.println(topicos);
		    
		    if(!nome.isEmpty() && !senha.isEmpty() && !matricula.isEmpty() && !email.isEmpty() && !topico.isEmpty()) {
		    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    	alert.setHeaderText(null);
		    	alert.setContentText("Cadastro feito com sucesso");
		    	alert.showAndWait();
		    	
		    	Parent cadastro = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		    	Scene scene = new Scene(cadastro,750,640);
		    	
		    	Stage janela = (Stage)((Node)event.getSource()).getScene().getWindow();
		    	
		    	janela.setScene(scene);
		    	janela.show();
		    }
		    
	    }
	    
	    


	}


