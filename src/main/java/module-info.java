module com.alilopez.webview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.alilopez.webview to javafx.fxml;
    exports com.alilopez.webview;
}