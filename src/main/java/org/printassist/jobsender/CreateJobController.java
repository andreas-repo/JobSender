package org.printassist.jobsender;

import com.dlsc.formsfx.model.structure.Field;
import com.dlsc.formsfx.model.structure.Form;
import com.dlsc.formsfx.model.structure.Group;
import com.dlsc.formsfx.view.renderer.FormRenderer;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import org.printassist.jobsender.models.Job;

import java.util.List;

public class CreateJobController {
    @FXML
    public GridPane gridPaneId;
    public Button addJobButton;
    private Form form;
    private FormRenderer formRenderer;
    StringProperty firstName = new SimpleStringProperty("");
    StringProperty lastName = new SimpleStringProperty("");
    StringProperty emailAddress = new SimpleStringProperty("");
    StringProperty number = new SimpleStringProperty("");

    @FXML
    public void initialize() {
        form = Form.of(
                Group.of(
                        Field.ofStringType(firstName)
                                .label("First Name"),
                        Field.ofStringType(lastName)
                                .label("Last Name"),
                        Field.ofStringType(emailAddress)
                                .label("Email Address"),
                        Field.ofStringType(number)
                                .label("Phone Number")
                )
        ).title("Create Job");
        formRenderer = new FormRenderer(form);
        formRenderer.setPrefWidth(600);
        gridPaneId.getChildren().add(formRenderer);
    }

    public void onAddJobButtonClick() {
        form.persist();
        Job job = new Job();
        job.setFirstName(firstName.get());
        job.setLastName(lastName.get());
        job.setEmailAddress(emailAddress.get());
        job.setPhoneNumber(number.get());
        System.out.println(job);
    }
}