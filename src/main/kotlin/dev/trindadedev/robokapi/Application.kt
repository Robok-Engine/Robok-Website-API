package dev.trindadedev.robokapi

import dev.trindadedev.robokapi.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
  io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
  configureRouting()
}
