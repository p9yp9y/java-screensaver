package com.github.p9yp9y.screensaver;

import java.awt.Window;
import java.awt.Window.Type;

import javax.swing.JButton;

public class Main {
	public static void main(final String[] args) {
		Window w = new Window(null);
		JButton b = new JButton();
		b.setText("Teszt Elek");
		b.addActionListener(l -> System.exit(-1));
		WebView browser = new WebView();
		WebEngine webEngine = browser.getEngine();
		webEngine.load("http://mySite.com");
		w.add(b);
		w.setType(Type.POPUP);
		w.setSize(500, 500);
		w.setVisible(true);
	}
}
