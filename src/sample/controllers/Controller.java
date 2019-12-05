package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.sentences.Introduction;
import sample.sentences.Preparation;
import sample.sentences.Reason;


public class Controller {
    @FXML
    Button generate_bt;
    @FXML
    Label randomSentence_lb;

    Introduction introduction;
    Preparation preparation;
    Reason reason;
    @FXML
    public void generate(ActionEvent e) {
        introduction = new Introduction();
        preparation = new Preparation();
        reason = new Reason();
        randomSentence_lb.setText(introduction.getRandomSentence() + preparation.getRandomSentence() + reason.getRandomSentence());
    }
}
