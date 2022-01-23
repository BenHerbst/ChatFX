package desktop.chatarea.chatbox

import tornadofx.*;
import javafx.scene.paint.Color

class ChatboxFragment : Fragment() {
	override val root = stackpane {
		group {
			rectangle(width = 250.0, height = 100.0){
				fill = Color.GREEN
			}
		}
	}
}