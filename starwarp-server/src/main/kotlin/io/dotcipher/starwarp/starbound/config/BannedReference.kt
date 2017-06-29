package io.dotcipher.starwarp.starbound.config

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonProperty

class BannedReference<out T> @JsonCreator constructor(@JsonProperty reference: T, @JsonProperty reason: String){

    @get:JsonGetter
    val reference: T = reference

    @get:JsonGetter
    val reason: String = reason

}
