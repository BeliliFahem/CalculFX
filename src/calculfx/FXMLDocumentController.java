/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Fahem
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label textLabelCalcul;

    private String clac = "";

    @FXML
    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!"+((Button)event.getSource()).getText());
        if (((Button) event.getSource()).getText().equals("=")) {
            //TODO do computation
        } else {
            clac += ((Button) event.getSource()).getText();
            textLabelCalcul.setText(clac);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
