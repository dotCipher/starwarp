package io.dotcipher.starwarp.starbound

import com.fasterxml.jackson.databind.ObjectMapper
import io.dotcipher.starwarp.starbound.config.StarboundInitConfig
import io.dotcipher.starwarp.starbound.config.StarboundServerConfig
import io.dotcipher.starwarp.utils.Utilities
import java.io.File
import java.nio.file.Path
import java.util.*

class StarboundServer(serviceDirectory: Path, objectMapper: ObjectMapper) {

    val initConfig: StarboundInitConfig
    val config: Optional<StarboundServerConfig>

    init {
        val serviceDirectoryFile = File(serviceDirectory.toString())
        val file = Utilities.find(serviceDirectoryFile, INIT_CONFIG_FILE_NAME);

        this.initConfig = objectMapper.readValue(
                ,
                StarboundInitConfig::class.java)

        this.config = objectMapper.readValue(
                Utilities.File.find(serviceDirectoryFile, SERVER_CONFIG_FILE_NAME),
                StarboundServerConfig::class.java)
    }

    companion object Constants {
        const val INIT_CONFIG_FILE_NAME = "sbinit.config"
        const val SERVER_CONFIG_FILE_NAME = "starbound_server.config"
    }

}
