package edu.wpi.teamname.views;

import edu.wpi.teamname.entity.Mortgage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
  private Mortgage mortgage;

  @FXML private TextField amountField;
  @FXML private TextField rateField;
  @FXML private TextField yearField;
  @FXML private Button computeButton;

  public MainController() {
    /* Inject entity objects */
  }

  public MainController(Mortgage mortgage) {
    this.mortgage = mortgage;
  }

  /** Set the properties of the mortgage model and calculate the montly interest */
  @FXML
  private void calculateTotalClicked() {
    mortgage.setAmount(Float.parseFloat(amountField.getText()));
    mortgage.setRate(Float.parseFloat(rateField.getText()));
    mortgage.setYears(Float.parseFloat(yearField.getText()));

    mortgage.setValue(mortgage.getAmount() * mortgage.getRate() * mortgage.getYears());
  }

  /**
   * Enables the calculate button if every text box is filled. Disables it if any text box is empty
   */
  @FXML
  private void validateButton() {
    boolean emptyField =
        amountField.getText().trim().isEmpty()
            || rateField.getText().trim().isEmpty()
            || yearField.getText().trim().isEmpty();
    computeButton.setDisable(emptyField);
  }
}
