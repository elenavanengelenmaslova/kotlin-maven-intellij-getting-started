import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    logger.info { "This is an info message" }
    logger.debug { "This is a debug message" }
    logger.warn { "This is a warning message" }
    logger.error { "This is an error message" }
}