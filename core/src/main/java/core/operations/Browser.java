package core.operations;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
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
}