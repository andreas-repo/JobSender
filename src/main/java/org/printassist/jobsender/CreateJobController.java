package org.printassist.jobsender;

import com.dlsc.formsfx.model.structure.Field;
import com.dlsc.formsfx.model.structure.Form;
import com.dlsc.formsfx.model.structure.Group;
import com.dlsc.formsfx.view.renderer.FormRenderer;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CreateJobController {
    @FXML
    public GridPane gridPaneId;

    @FXML
    public void initialize() {
        Form form = Form.of(
                Group.of(
                        Field.ofStringType("")
                                .label("First Name"),
                        Field.ofStringType("")
                                .label("Last Name"),
                        Field.ofStringType("")
                                .label("Email Address"),
                        Field.ofStringType("")
                                .label("Phone Number")
                )
        ).title("Create Job");
        FormRenderer formRenderer = new FormRenderer(form);
        formRenderer.setPrefWidth(600);
        gridPaneId.getChildren().add(formRenderer);
    }

}