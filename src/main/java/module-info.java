module me.t3sl4.licensecontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.t3sl4.licensecontrol to javafx.fxml;
    exports me.t3sl4.licensecontrol;
}