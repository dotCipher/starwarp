package io.dotcipher.steam

import io.dotcipher.steam.api.SteamCmd
import java.nio.file.Path
import java.nio.file.Paths

class LocalSteamCmd(installDirectory: Path): SteamCmd {

    override val installDirectory: Path
        get() = installDirectory

    constructor(installDirectory: String) : this(Paths.get(installDirectory))

    init {
        // Download on initialization

        SteamCmd.download(installDirectory)
    }

    override fun appUpdate(appID: Int) {
        val processBuilder = ProcessBuilder(installDirectory.toString(), SteamCmd.SCRIPT_NAME)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
