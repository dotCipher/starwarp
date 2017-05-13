package io.dotcipher.steamcmd

import io.dotcipher.steamcmd.api.SteamCmd
import java.nio.file.Path
import java.nio.file.Paths

class DefaultSteamCMD(installDirectory: Path): SteamCmd {


    constructor(installDirectory: String) : this(Paths.get(installDirectory)) {

    }

    private fun verifyInstalled(installDirectory: Path) {

    }

    private fun install(installDirectory: Path) {

    }

    override fun installDirectory(): Path {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun appUpdate(appID: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
