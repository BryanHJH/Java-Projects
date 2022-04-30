package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class guiController implements Initializable{
    @FXML
    private Label exchageRateLabel, convertedAmountLabel;

    @FXML
    private Button convertButton, clearButton;

    @FXML
    private TextField baseAmount;

    @FXML
    private ComboBox currencySelector;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    public void showExchangeRate() {
        
    }
    
    public void convert(ActionEvent event) {

    }

    public void clear(ActionEvent event) {

    }

}
