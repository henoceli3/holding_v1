package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class ImmeubleController implements Initializable {
	@FXML
    private StackPane pnl_principal;
 @FXML
 private GridPane pnl_ajouter;

 @FXML
 private GridPane pnl_liste;

 @FXML
 private GridPane pnl_modifier;  

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	 @FXML
	    void btn_ajouter_nouveau() {
	    	pnl_ajouter.toFront();
	    }

}
