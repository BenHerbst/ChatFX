package desktop.chatarea.chatbox

import tornadofx.*;
import javafx.scene.paint.Color
import core.chatbox.ChatboxModel
import core.chatbox.Transmitter

class ChatboxFragment(chatboxModel: ChatboxModel) : Fragment() {
	var chatboxModel: ChatboxModel

	override val root = stackpane {
		rectangle {
			width = 250.0
			height = 100.0

			if (chatboxModel.transmitter == Transmitter.USER) {
				fill = Color.GREEN
			}
			else {
				fill = Color.GRAY
			}
		}
		text(chatboxModel.text) {
			fill = Color.WHITE
		}
	}

	init {
		this.chatboxModel = chatboxModel
	}
}