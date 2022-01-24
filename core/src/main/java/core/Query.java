package core;

import core.chatbox.ChatboxModel;
import core.chatbox.Conservation;
import core.chatbox.Transmitter;
import core.operations.Browser;

public class Query {
	public static Conservation takeQuery(String query) {
		// Create the user chatbox
		ChatboxModel userChatbox = new ChatboxModel();
		userChatbox.transmitter = Transmitter.USER;
		userChatbox.text = query;
		// Create the bot chatbox
		ChatboxModel botChatbox = new ChatboxModel();
		botChatbox.transmitter = Transmitter.BOT;
		if (query.toLowerCase().equals("quit")) {
			// Quit the application
			System.exit(0);
		} else {
			// Take query of the given command / text
			String[] commands = query.split(" ");
			switch (commands[0]) {
			case "open":
				switch (commands[1]) {
				case "duckduckgo":
					Browser.openWithLink("https://duckduckgo.com");
					botChatbox.text = "Opening duckduckgo.com ...";
					break;
				case "google":
					Browser.openWithLink("https://google.com");
					botChatbox.text = "Opening google.com ...";
					break;
				case "browser":
					Browser.openWithLink("https://github.com/BenHerbst/ChatFX");
					botChatbox.text = "Opening the browser ...";
					break;
				}
				break;
			case "search":
				Browser.searchWithDDG(query.replace("search", ""));
				botChatbox.text = "Searching via duckduckgo ...";
				break;
			}
			return new Conservation(userChatbox, botChatbox);
		}
	}
}
