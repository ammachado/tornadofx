package tornadofx.testapps

import tornadofx.*

class InternalWindowTestApp : App(InternalWindowTest::class)

class InternalWindowTest : View("Internal Window") {
    override val root = stackpane {
        setPrefSize(600.0, 400.0)
        button("Open editor") {
            setOnAction {
                openInternalWindow(Editor::class, modal = false)
            }
        }
    }
}

class Editor : View("Editor") {
    override val root = form {
        prefWidth = 300.0

        fieldset("Editor") {
            field("First field") {
                textfield()
            }
            field("Second field") {
                textfield()
            }
            button("Save")
        }
    }
}