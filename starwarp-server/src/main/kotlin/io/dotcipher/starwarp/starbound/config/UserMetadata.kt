package io.dotcipher.starwarp.starbound.config

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonProperty

class UserMetadata @JsonCreator constructor(
        @get:JsonGetter @JsonProperty val admin: Boolean,
        @get:JsonGetter @JsonProperty val password: String)
