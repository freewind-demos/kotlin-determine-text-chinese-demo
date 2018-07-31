package example

fun main(args: Array<String>) {
    val lines = listOf(
            "Hello，大家好!",
            "Hello",
            "大家好",
            "_sdfsdf",
            "大家好  ",
            "大x家好"
    )

    lines.forEach { text ->
        println("$text: ${isChinese(text)}")
    }
}

private fun isChinese(text: String): Boolean {
    return text.matches("""[\u4e00-\u9eff]+""".toRegex())
}