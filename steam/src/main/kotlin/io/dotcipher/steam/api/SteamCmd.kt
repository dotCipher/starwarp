package io.dotcipher.steam.api

import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

/**
 * Interface for interacting with a headless Steam Command Line client.
 */
interface SteamCmd {

    companion object Executable {
        const val SCRIPT_NAME: String = "steamcmd.sh"
        const val DOWNLOAD_URL: String = "https://steamcdn-a.akamaihd.net/client/installer/steamcmd_linux.tar.gz"

        fun download(url: String, installDirectory: Path): Path {
            try {
                val filename = url.substringAfterLast("/")
                if (!installDirectory.resolve(filename).toFile().exists()) {
                    URL(url).openStream().use {
                        Files.copy(it, installDirectory.resolve(filename), StandardCopyOption.REPLACE_EXISTING)
                    }
                }
                return installDirectory.resolve(filename)
            } catch (e: Exception) {
                throw IllegalStateException(e.localizedMessage)
            }
        }

        fun download(installDirectory: Path): Path {
            return download(DOWNLOAD_URL, installDirectory)
        }

    }

    val installDirectory: Path

    fun appUpdate(appID: Int)

}
