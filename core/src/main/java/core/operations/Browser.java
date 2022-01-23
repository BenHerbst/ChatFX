package core.operations;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
	// Duckduckgo search query link
	static String ddgSearchQuery = "https://duckduckgo.com/?q=";

	public static void openWithURI(URI uri) {
		try {
			// Opens the default browser with the given uri
			Desktop.getDesktop().browse(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Opens by using a string which is the link and gets converted to uri
	public static void openWithLink(String link) {
		try {
			openWithURI(new URI(link));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Search via the duckduckgo search query
	public static void searchWithDDG(String search) {
		openWithLink(ddgSearchQuery + search.replace(" ", "+"));
	}
}