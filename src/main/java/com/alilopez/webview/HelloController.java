package com.alilopez.webview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private WebView webView;

    WebEngine webEngine;

    @FXML
    void onClickBtnLoad(MouseEvent event) {
        String html = "<!DOCTYPE html>" +
                "<html lang=\"en\">" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 style=\" border: 2px solid red;\">Reporte de ventas</h1>\n" +
                "\n" +
                "    <td style=\"border: 1px solid red;\">\n" +
                "        <th>Encabezados</th>\n" +
                "        <tr>fila \"+ 1000 + \"</tr>\n" +
                "        <tr>Fila 2</tr>\n" +
                "    </td>\n" +
                "</body>\n" +
                "</html>";
        webEngine.loadContent(html);
    }

    @FXML
    void initialize() {
        webEngine = webView.getEngine();
    }

}
