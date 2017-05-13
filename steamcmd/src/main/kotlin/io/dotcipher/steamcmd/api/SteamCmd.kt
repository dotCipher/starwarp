package io.dotcipher.steamcmd.api

import java.nio.file.Path

/**
 * Interface for interacting with the headless Steam Command Line client.
 */
interface SteamCmd {

    companion object {
        const val DOWNLOAD_URL: String = "https://steamcdn-a.akamaihd.net/client/installer/steamcmd_linux.tar.gz"
    }

    fun installDirectory(): Path
    fun appUpdate(appID: Int)
}
