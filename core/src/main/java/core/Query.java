package core;

import core.operations.Browser;

public class Query {
	public static void takeQuery(String query) {
		// Take query of the given command / text
		String[] commands = query.split(" ");
		switch (commands[0]) {
		case "open":
			switch (commands[1]) {
			case "duckduckgo":
				Browser.openWithLink("https://duckduckgo.com");
			case "google":
				Browser.openWithLink("https://google.com");
			}
		}
	}
}
