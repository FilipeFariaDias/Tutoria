package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TutoriaController {

    @FXML
    private Label nomeUsuario;

    @FXML
    private Label emailUsuario;

    @FXML
    private Label matriculaUsuario;

    @FXML
    private Tab tabSolicitarReuniao;

    @FXML
    private TextField textData;

    @FXML
    private TextField textHorario;

    @FXML
    private TextField textDuracao;

    @FXML
    private RadioButton radioServicos;

    @FXML
    private ToggleGroup radioPauta;

    @FXML
    private RadioButton radioOrientacao;

    @FXML
    private RadioButton radioMatricula;

    @FXML
    private RadioButton radioPlanEstudos;

    @FXML
    private RadioButton radioPlanProjeto;

    @FXML
    private RadioButton radioAdministrativo;

    @FXML
    private RadioButton radioAcompanhamento;

    @FXML
    private RadioButton radioOutros;

    @FXML
    private Button btnConvidar;

    @FXML
    private Tab tabHistoricoReuniao;
    
    @FXML
    void apertarConvidar(ActionEvent event) {
    	String data = textData.getText();
    	String horario = textHorario.getText();
    	String duracao = textDuracao.getText();
    	RadioButton radioTopico = (RadioButton) radioPauta.getSelectedToggle();
    	
    	String pauta = radioTopico.getText();
    	
    	if(data.isEmpty() || horario.isEmpty() || duracao.isEmpty()) {
	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setHeaderText(null);
	    	alert.setContentText("Por favor preencha todos os campos");
	    	alert.showAndWait();
	    	return;
    	}
    	
    	System.out.println(data);
    	System.out.println(horario);
    	System.out.println(duracao);
    	System.out.println(pauta);
    }

}
