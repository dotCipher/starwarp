package io.dotcipher.starwarp.starbound.config

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonProperty
import java.nio.file.Path
import java.nio.file.Paths

class StarboundInitConfig @JsonCreator constructor(@JsonProperty storageDirectory: String,
                                                   @JsonProperty assetDirectories: List<String>) {

    @get:JsonGetter
    val storageDirectory: Path = Paths.get(storageDirectory)

    @get:JsonGetter
    val assetDirectories: List<Path> = assetDirectories.map { Paths.get(it) }

}

