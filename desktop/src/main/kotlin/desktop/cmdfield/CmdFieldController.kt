package desktop.cmdfield

import tornadofx.*
import core.Query
import desktop.chatarea.chatbox.ChatboxFragment
import desktop.chatarea.ChatareaView
import javafx.scene.Node

class CmdFieldController : Controller(){
	val view: CmdFieldView by inject()
	val chatarea: ChatareaView by inject()

	fun queryCommand(command: String) {
		val conservation = core.Query.takeQuery(command)
		// Create chatboxes from consrvation
		val userChatboxFragment = ChatboxFragment(conservation.userChatbox)
		val botChatboxFragment = ChatboxFragment(conservation.botChatbox)
		// Add chatboxes to chat
		chatarea.root.children.add(userChatboxFragment.root)
		chatarea.root.children.add(botChatboxFragment.root)
		// Clear the text field
		view.queryProperty.set("")
	}
}