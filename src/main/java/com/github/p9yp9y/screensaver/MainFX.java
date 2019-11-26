package com.github.p9yp9y.screensaver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class MainFX extends Application {
	@Override
	public void start(final Stage stage) {
        StackPane root = new StackPane();

        WebView view = new WebView();
        WebEngine engine = view.getEngine();
        engine.load("https://pgy.no-ip.hu/clock");
        root.getChildren().add(view);

        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
	}

	public static void main(final String[] args) {
		launch();
	}
}
