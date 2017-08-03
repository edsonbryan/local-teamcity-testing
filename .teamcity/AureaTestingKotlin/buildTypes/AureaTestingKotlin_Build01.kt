package AureaTestingKotlin.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object AureaTestingKotlin_Build01 : BuildType({
    uuid = "8fae98cc-ce0c-4da4-91ad-0bfb6b22cc56"
    extId = "AureaTestingKotlin_Build01"
    name = "build-01"

    steps {
        powerShell {
            scriptMode = script {
                content = """Write-Host "Hello Kotlin""""
            }
        }
    }
})
