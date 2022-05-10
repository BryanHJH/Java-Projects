package Controller;

import java.net.URL;
import java.text.DecimalFormat;
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
    private Label exchangeRateLabel, convertedAmountLabel;

    @FXML
    private Button convertButton, clearButton;

    @FXML
    private TextField baseAmount;

    @FXML
    private ComboBox currencySelector;

    // private String DEFAULT_CURRENCY = "MYR";
    private enum Currency {USD, EUR, GBP};
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        currencySelector.getItems().addAll(Currency.values());
    }

    public void showExchangeRate() {
        Currency chosenCurrency = (Currency) currencySelector.getValue();
        double exchangeRate = 0;

        switch (chosenCurrency) {
            case USD: exchangeRate = 0.23; exchangeRateLabel.setText(Double.toString(exchangeRate)); break;
            case EUR: exchangeRate = 0.22; exchangeRateLabel.setText(Double.toString(exchangeRate)); break;
            case GBP: exchangeRate = 0.18; exchangeRateLabel.setText(Double.toString(exchangeRate)); break;
            default: exchangeRate = 1.00; exchangeRateLabel.setText(Double.toString(exchangeRate));
        }
    }
    
    public void convert(ActionEvent event) {
        Double amount = Double.parseDouble(baseAmount.getText());
        Double exchangeRate = Double.parseDouble(exchangeRateLabel.getText());
        Double convertedAmount = amount * exchangeRate;
        DecimalFormat df = new DecimalFormat("#.##");
        convertedAmountLabel.setText(df.format(convertedAmount));
    }

    public void clear(ActionEvent event) {
        convertedAmountLabel.setText("");
        exchangeRateLabel.setText("");
        baseAmount.clear();
    }

}
