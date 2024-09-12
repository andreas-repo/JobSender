module org.printassist.jobsender {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires static lombok;

    opens org.printassist.jobsender to javafx.fxml;
    exports org.printassist.jobsender;
}