package dev.trindadedev.robokapi

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

import dev.trindadedev.robokapi.tokens.Devs

fun Application.configureVersions() {
  install(ContentNegotiation) {
    json()
  }
  routing {
    get("/versions") {
      call.respond(getVersions())
    }
  }
}

// TODO: get latest builds from github
private fun getVersions(): List<Version> = listOf(
  Version(
    invoice = "1.0",
    buildDate = "00/00",
    buildDev = Devs.TRINDADEDEV.name,
    download = "https://nightly.link/Robok-Engine/Robok-Engine/workflows/android/dev/robok-release.zip"
  )
)