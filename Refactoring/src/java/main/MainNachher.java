package java.main;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainNachher {

  private void buildUiExampleAfterRefactoring1() {
    HBox topContainer = buildHBox(
        buildLabel("Label Top", "test-label-top"),
        buildTextField("test-textfield-top"),
        buildButton("test-button-top", event -> System.out.println("Top Button was clicked!"))
    );

    HBox midContainer = buildHBox(
        buildLabel("Label Mid", "test-label-mid"),
        buildTextField("test-textfield-mid"),
        buildButton("test-button-mid", event -> System.out.println("Mid Button was clicked!"))
    );

    HBox botContainer = buildHBox(
        buildLabel("Label Bot", "test-label-bot"),
        buildTextField("test-textfield-bot"),
        buildButton("test-button-bot", event -> System.out.println("Bot Button was clicked!"))
    );

    VBox root = new VBox();
    root.setSpacing(12);
    root.getChildren().addAll(topContainer, midContainer, botContainer);
  }

  private void buildUiExampleAfterRefactoring2() {
    HBox topContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Top", "test-label-top"),
        UIFactory.buildTextField("test-textfield-top"),
        UIFactory.buildButton("test-button-top", event -> System.out.println("Top Button was clicked!"))
    );

    HBox midContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Mid", "test-label-mid"),
        UIFactory.buildTextField("test-textfield-mid"),
        UIFactory.buildButton("test-button-mid", event -> System.out.println("Mid Button was clicked!"))
    );

    HBox botContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Bot", "test-label-bot"),
        UIFactory.buildTextField("test-textfield-bot"),
        UIFactory.buildButton("test-button-bot", event -> System.out.println("Bot Button was clicked!"))
    );

    VBox root = new VBox();
    root.setSpacing(12);
    root.getChildren().addAll(topContainer, midContainer, botContainer);
  }

  private HBox buildHBox(Node...nodes) {
    HBox hBox = new HBox();
    hBox.setAlignment(Pos.CENTER_LEFT);
    hBox.setSpacing(12);
    hBox.getChildren().addAll(nodes);

    return hBox;
  }

  private Label buildLabel(String text, String styleClass) {
    Label label = new Label(text);
    label.getStyleClass().add(styleClass);
    label.setWrapText(true);

    return label;
  }

  private TextField buildTextField(String styleClass) {
    TextField textField = new TextField();
    textField.setPromptText("Type Something...");
    textField.getStyleClass().add(styleClass);

    return textField;
  }

  private Button buildButton(String styleClass, EventHandler eventHandler) {
    Button button = new Button("Click me");
    button.getStyleClass().add(styleClass);
    button.setOnAction(eventHandler);

    return button;
  }
}
