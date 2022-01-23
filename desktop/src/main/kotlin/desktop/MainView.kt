package org.chatfx.desktop

import tornadofx.*
import desktop.cmdfield.CmdFieldView
import desktop.chatarea.ChatareaView

class MainView : View() {
	override val root = borderpane {
		top<CmdFieldView>()
		center<ChatareaView>()
	}
}