package com.github.p9yp9y.screensaver;

import java.awt.Frame;
import java.awt.Window.Type;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainFX extends Application {
	@Override
	public void start(final Stage nStage) {


		StackPane root = new StackPane();

		WebView view = new WebView();
		WebEngine engine = view.getEngine();
		engine.load("https://pgy.no-ip.hu/clock");
		root.getChildren().add(view);

		Scene scene = new Scene(root, 800, 600);

		nStage.setFullScreen(true);
		nStage.setScene(scene);
		nStage.show();
		nStage.alwaysOnTopProperty();
		nStage.centerOnScreen();
		nStage.focusedProperty();

		Frame w = new Frame();
		w.setType(Type.POPUP);
		w.setBounds(100, 100, 300, 300);
		w.setVisible(true);


	}

	public static void main(final String[] args) {
		launch();
	}
}
