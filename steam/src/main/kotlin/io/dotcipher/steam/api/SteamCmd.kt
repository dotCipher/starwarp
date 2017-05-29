package io.dotcipher.steam.api

import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

/**
 * Interface for interacting with a headless Steam Command Line client.
 */
interface SteamCmd {

    companion object Executable {
        const val SCRIPT_NAME: String = "steamcmd.sh"
        const val DOWNLOAD_URL: String = "https://steamcdn-a.akamaihd.net/client/installer/steamcmd_linux.tar.gz"

        fun download(url: String, installDirectory: Path): Boolean {
            try {
                URL(url).openStream().use {
                    val filename = url.substringAfterLast("/")
                    Files.copy(it, Paths.get(installDirectory.toString(), filename), StandardCopyOption.REPLACE_EXISTING)
                    return true
                }
            } catch (e: Exception) {
                throw IllegalStateException(e.localizedMessage)
            }
        }

        fun download(installDirectory: Path): Boolean {
            return download(DOWNLOAD_URL, installDirectory)
        }

    }

    val installDirectory: Path

    fun appUpdate(appID: Int)

}
