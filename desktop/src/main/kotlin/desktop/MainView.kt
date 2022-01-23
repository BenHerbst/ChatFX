package org.chatfx.desktop

import tornadofx.*
import desktop.cmdfield.CmdFieldView

class MainView : View() {
	override val root = borderpane {
		top<CmdFieldView>()
	}
}