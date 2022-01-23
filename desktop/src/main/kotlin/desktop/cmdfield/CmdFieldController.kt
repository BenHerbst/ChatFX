package desktop.cmdfield

import tornadofx.*
import core.Query

class CmdFieldController : Controller(){
	val view: CmdFieldView by inject()

	fun queryCommand(command: String) {
		core.Query.takeQuery(command)
		// Clear the text field
		view.queryProperty.set("")
	}
}