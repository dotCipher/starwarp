package io.dotcipher.starwarp

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import java.nio.file.Path
import java.nio.file.Paths

class StarWarpConfiguration @JsonCreator constructor(@JsonProperty starboundDirectory : String): Configuration() {

    @get:JsonGetter
    val starboundDirectory: Path = Paths.get(starboundDirectory)

}
