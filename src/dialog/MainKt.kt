package dialog

fun main() {
    AlertDialog.Builder()
        .setTitle("Good Title")
        .setMessage("Pretty Cool Message")
        .setMessageColor("RED")
        .setTitleColor("GREEN")
        .setOnNegativeButtonClick {
            println("Negative Button Click")
        }.setOnPositiveButtonClick {
            println("Positive Button Click")
        }.build().show()
}
