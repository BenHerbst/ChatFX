package core;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Query {
	public static void takeQuery(String query) {
		// Take query of the given command / text
		String[] commands = query.split(" ");
		switch (commands[0]) {
		case "open":
			switch (commands[1]) {
			case "browser":
				try {
					// Open the default browser with duckduckgo
					Desktop.getDesktop().browse(new URI("https://duckduckgo.com/"));
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}
		}

	}
}