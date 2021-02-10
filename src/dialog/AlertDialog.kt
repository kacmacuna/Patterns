package dialog

import java.lang.System.`in`
import java.util.*

class AlertDialog private constructor(
    private val title: String,
    private val titleColor: String,
    private val message: String,
    private val messageColor: String,
    private val onPositiveButtonClick: () -> Unit,
    private val onNegativeButtonClick: () -> Unit
) {

    fun show() {
        println("Title: $title, color: $titleColor")
        println("Message: $message, color: $messageColor")
        println("Y/N")
        val scanner = Scanner(`in`)
        while (true) {
            when (scanner.next()) {
                "Y" -> {
                    onPositiveButtonClick()
                    break
                }
                "N" -> {
                    onNegativeButtonClick()
                    break
                }
                else -> {
                    println("Incorrect Try Again")
                    println("Y/N")
                }
            }
        }
    }

    class Builder {

        private var title: String = ""
        private var titleColor: String = ""

        private var message: String = ""
        private var messageColor: String = ""

        private var onPositiveAction = {}
        private var onNegativeAction = {}

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setTitleColor(titleColor: String): Builder {
            this.titleColor = titleColor
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun setMessageColor(messageColor: String): Builder {
            this.messageColor = messageColor
            return this
        }

        fun setOnPositiveButtonClick(block: () -> Unit): Builder {
            this.onPositiveAction = block
            return this
        }

        fun setOnNegativeButtonClick(block: () -> Unit): Builder {
            this.onNegativeAction = block
            return this
        }


        fun build(): AlertDialog = AlertDialog(
            title = title,
            titleColor = titleColor,
            message = message,
            messageColor = messageColor,
            onPositiveButtonClick = onPositiveAction,
            onNegativeButtonClick = onNegativeAction
        )
    }

}
