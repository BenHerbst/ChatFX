package desktop.cmdfield

import tornadofx.*
import javafx.beans.property.SimpleStringProperty
import javafx.scene.input.KeyEvent
import javafx.scene.input.KeyCode

class CmdFieldView : View() {
	val controller = find(CmdFieldController::class)
	val queryProperty = SimpleStringProperty()

	override val root = textfield(queryProperty) {
		useMaxWidth = true
		addEventHandler(KeyEvent.KEY_PRESSED) {
			if (it.code === KeyCode.ENTER) {
				controller.queryCommand(queryProperty.value)
			}
		}
	}
}